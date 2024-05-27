package com.danielfreitas.exercicio09.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitas.exercicio09.dtos.ProductsRecordDTO;
import com.danielfreitas.exercicio09.models.ProductsEntity;
import com.danielfreitas.exercicio09.services.ProductsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @PostMapping
    public ResponseEntity<ProductsEntity> saveProducts(@RequestBody ProductsRecordDTO productsRecordDTO) {
        return productsService.saveProducts(productsRecordDTO);
    }

    @GetMapping
    public ResponseEntity<List<ProductsEntity>> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("{name}")
    public ResponseEntity<Object> getOneProduct(@PathVariable String name) {
        return productsService.getOneProduct(name);
    }
    
    @PutMapping("{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable Long id, @RequestBody @Valid ProductsRecordDTO productsRecordDTO) {
        return productsService.updateProduct(id, productsRecordDTO);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
        return productsService.deleteProduct(id);
    }

}
