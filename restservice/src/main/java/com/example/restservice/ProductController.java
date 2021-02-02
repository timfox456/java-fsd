package com.example.restservice;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final AtomicLong counter = new AtomicLong();


    // TODO: Add a collection that stores products and initialize with few products.


    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "Product") String name) {

        //TODO: search collection for product and return product if found, exception if not found.
        return new Product(counter.incrementAndGet(), name + counter.toString());
    }
}
