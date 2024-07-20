package com.example.rentacar.dataAccess.abstracts;

import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository {
    List<Brand> getAll();
}
