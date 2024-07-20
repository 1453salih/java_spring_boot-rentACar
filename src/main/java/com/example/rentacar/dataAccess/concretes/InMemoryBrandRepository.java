package com.example.rentacar.dataAccess.concretes;

import com.example.rentacar.dataAccess.abstracts.BrandRepository;
import com.example.rentacar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    //Liste Oluştur
    List<Brand> brands;

    public InMemoryBrandRepository() {

        //Boş liste
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
