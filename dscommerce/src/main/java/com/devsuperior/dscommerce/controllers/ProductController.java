package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.DTO.ProductDTO;
import com.devsuperior.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ProductDTO findByID(@RequestBody @PathVariable Long id){
        return productService.findById(id); //retorna um objeto do tipo ProductDTO
    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable){
        return productService.findAll(pageable); //retorna uma lista de objetos do tipo ProductDTO
    }
}
