package com.afpa.formation_afpa_java.controlers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("product")
public class ProductController {
    private Map<Integer, String> produits = new HashMap<>(
            Map.of(
                    1,
                    "Petit poids",
                    2,
                    "cote",
                    3,
                    "steack"
            )
    );

    public  Map<Integer, String> getProduit(){
        return this.produits;
    }

    @GetMapping("{id}")
    public String idProduit(@PathVariable("id") int id){
        return produits.get(id);
    }

    @GetMapping("add")
    public String addProduit(@RequestParam(name="name") @PathVariable String name) {
        int randomInt = (int) (Math.random() * 100);
        produits.put(randomInt, name);
        return name + " was added to the list with id " + randomInt;
    }

    @GetMapping("all")
    public Map<Integer, String> allProduit(){
        return getProduit();
    }
}
