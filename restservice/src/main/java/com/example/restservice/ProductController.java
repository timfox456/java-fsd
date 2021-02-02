package com.example.restservice;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    private ArrayList<Product> products = new ArrayList<>();

    private Product searchProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ProductController() {
        products.add((new Product(0, "product1")));
        products.add((new Product(1, "product2")));
        products.add((new Product(2, "product3")));
        products.add((new Product(3, "product4")));

    }

    // TODO: Add a collection that stores products and initialize with few products.


    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "product1") String name) {

        Product searchedProduct = this.searchProduct(name);
        if (searchedProduct != null) {
            return searchedProduct;

        }
        else {
            throw new ProductNotFoundException(name);

        }
    }
}
