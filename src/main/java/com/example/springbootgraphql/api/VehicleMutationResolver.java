package com.example.springbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springbootgraphql.model.Vehicle;
import com.example.springbootgraphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.springbootgraphql.dto.VehicleDto;

import java.util.Date;

/*
*
* sunucuda veri uzeerinde save , delete, update islemi için kullanılır
*
* */
@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle=new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setType(vehicleDto.getType());
        return vehicle;
    }
}
