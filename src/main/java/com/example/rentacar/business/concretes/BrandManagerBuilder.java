package com.example.rentacar.business.concretes;

import com.example.rentacar.dataAccess.abstracts.BrandRepository;

public class BrandManagerBuilder {
    private BrandRepository brandRepository;

    public BrandManagerBuilder setBrandRepository(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
        return this;
    }

    public BrandManager createBrandManager() {
        return new BrandManager(brandRepository);
    }
}