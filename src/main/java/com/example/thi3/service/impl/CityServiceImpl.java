package com.example.thi3.service.impl;


import com.example.thi3.model.City;
import com.example.thi3.repository.ICityRepository;
import com.example.thi3.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        if (cityRepository.findById(id).isPresent()){
            return cityRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }
}
