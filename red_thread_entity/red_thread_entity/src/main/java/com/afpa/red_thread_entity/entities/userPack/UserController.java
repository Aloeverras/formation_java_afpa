package com.afpa.red_thread_entity.entities.userPack;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("all")
    public List<User> getAllUsers(){
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @PostMapping("create")
    @Transactional
    public User createUser(@RequestBody User user){
        entityManager.persist(user);
        return user;
    }

    @GetMapping("shear/{id}")
    public User getUserById(@PathVariable Long id) {
        return entityManager.find(User.class, id);
    }

    @DeleteMapping("delect/{id}")
    @Transactional
    public String delectUser(@PathVariable Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
            return "User delected";
        } else {
            return "User indifunned";
        }
    }
}
