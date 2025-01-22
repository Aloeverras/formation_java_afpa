package com.afpa.formation_afpa_java.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private ArrayList<HashMap<Integer, String>> users(String[] names) {
        ArrayList<HashMap<Integer, String>> users = new ArrayList<>();

        for (int i = 0; i < names.length; i++){
            HashMap<Integer, String> user  = new HashMap<>();
            user.put(i, names[i]);
            users.add(user);
        }

        return users;
    }

    @GetMapping("{id}")
    public String idUser(@PathVariable("id") int id) {
        ArrayList<HashMap<Integer, String>> users = users(new String[]{"Alice", "Julie", "Checica", "Sophie"});

        return "Id to " + users.get(id).get(id) + "is " + id;
    }

    @GetMapping("all")
    public List<HashMap<Integer, String>> allUsers(){
        return users(new String[]{"Alice", "Julie", "Checica", "Sophie"});
    }
}
