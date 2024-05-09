package com.sparta.myselectshop.controller;

import com.sparta.myselectshop.dto.ProductMypriceRequestDto;
import com.sparta.myselectshop.dto.ProductRequestDto;
import com.sparta.myselectshop.dto.ProductResponseDto;
import com.sparta.myselectshop.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @RequestMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {

        return productService.createProduct(requestDto);
    }

    @PatchMapping
    @RequestMapping("/products/{id}")
    public ProductResponseDto updateProducts(@Valid @RequestParam Long id, @Valid @RequestBody ProductMypriceRequestDto requestDto) {

        return productService.updateProduct(id, requestDto);
    }

    @GetMapping
    @RequestMapping("/products")
    public List<ProductResponseDto> getProductList() {
        return productService.getProducts();
    }
}
