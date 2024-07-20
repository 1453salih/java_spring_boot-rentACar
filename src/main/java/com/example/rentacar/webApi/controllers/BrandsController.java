package com.example.rentacar.webApi.controllers;


import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}

//birinin brand'i listeyebilmesi için iş kurallarından geçmesi lazım geçtiyse
//bu sefer business data access'e gider o da datayı verir.