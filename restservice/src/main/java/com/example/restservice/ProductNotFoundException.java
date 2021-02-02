package com.example.restservice;

public class ProductNotFoundException extends RuntimeException {

    ProductNotFoundException(String name) {
        super("Could not find product " + name);
    }

}
