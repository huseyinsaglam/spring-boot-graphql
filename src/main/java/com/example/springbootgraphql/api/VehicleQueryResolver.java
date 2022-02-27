package com.example.springbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springbootgraphql.model.Vehicle;
import com.example.springbootgraphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/*
*
* sunucuda sorgulama islemi icin kullanilan sinif
*
* */
@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(String type) {
        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getById(Long id) {
        return vehicleRepository.findById(id);
    }

}
