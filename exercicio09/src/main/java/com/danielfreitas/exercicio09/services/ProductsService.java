package com.danielfreitas.exercicio09.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.danielfreitas.exercicio09.dtos.ProductsRecordDTO;
import com.danielfreitas.exercicio09.models.ProductsEntity;
import com.danielfreitas.exercicio09.repositories.ProductsRepository;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;


    public ResponseEntity<ProductsEntity> saveProducts(ProductsRecordDTO productsRecordDTO) {
        ProductsEntity productsEntity = new ProductsEntity();
        BeanUtils.copyProperties(productsRecordDTO, productsEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(productsRepository.save(productsEntity));
    }

    public ResponseEntity<List<ProductsEntity>> getAllProducts() {
        List<ProductsEntity> productsEntities = productsRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productsEntities);
    }

    public ResponseEntity<Object> getOneProduct(String name) {
        Optional<ProductsEntity> product = productsRepository.findByName(name);
        if(product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum produto com este nome");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    public ResponseEntity<Object> updateProduct(Long id, ProductsRecordDTO productsRecordDTO) {
        Optional<ProductsEntity> product = productsRepository.findById(id);
        if(product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum produto com este id");
        }
        ProductsEntity productsEntity = product.get();
        BeanUtils.copyProperties(productsRecordDTO, productsEntity);
        return ResponseEntity.status(HttpStatus.OK).body(productsRepository.save(productsEntity));
    }
    
    public ResponseEntity<Object> deleteProduct(Long id) {
        Optional<ProductsEntity> product = productsRepository.findById(id);
        if(product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum produto com este id");
        }
        productsRepository.delete(product.get());
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }


}
