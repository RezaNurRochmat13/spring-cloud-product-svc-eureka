package com.microservice.product.ProductService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "Index page";
    }
}
