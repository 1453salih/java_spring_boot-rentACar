package com.example.rentacar.business.concretes;

import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.dataAccess.abstracts.BrandRepository;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Bu anotasyonu eklemeyi unutmayın
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // İş kuralları
        return brandRepository.getAll();
    }
}
