package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ProductRequest;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

   public Product createProduct(@RequestBody ProductRequest ProductRequest){
        return productService.createProduct(ProductRequest);

    }


}
