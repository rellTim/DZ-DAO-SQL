package my.project.daosql.controller;

import my.project.daosql.repository.DAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DAOcontroller {
    @Autowired
    DAORepository repository;

    @GetMapping("/products/fetch-product")
    public List<String> getProduct(@RequestParam("name") String name) {
        return repository.getProductName(name);
    }
}
