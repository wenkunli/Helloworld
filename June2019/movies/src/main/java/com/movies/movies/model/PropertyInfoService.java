package com.movies.movies.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyInfoService {
    private PropertyInfoRepository propertyInfoRepository;

    @Autowired
    public PropertyInfoService(PropertyInfoRepository propertyInfoRepository){
        this.propertyInfoRepository = propertyInfoRepository;
    }

    public void savePropertyInfo(PropertyInfo propertyInfo){
        propertyInfoRepository.save(propertyInfo);
    }

    public Optional<PropertyInfo> findPropertyInfoById(long id){
        return  propertyInfoRepository.findById(id);
    }

    public List<PropertyInfo> getPropertyInfos(){
        Iterable<PropertyInfo> found = propertyInfoRepository.findAll();
        List<PropertyInfo> propertyInfos = new ArrayList<>();
        for(PropertyInfo propertyInfo : found){
            propertyInfos.add(propertyInfo);
        }
        return propertyInfos;
    }

    public List<PropertyInfo> getPropertyInfosbycity(String searchcity){
        Iterable<PropertyInfo> found = propertyInfoRepository.findAll();
        List<PropertyInfo> propertyInfos = new ArrayList<>();
        for(PropertyInfo propertyInfo : found){
            if(propertyInfo.getCity().equals(searchcity)){
            propertyInfos.add(propertyInfo);
            }
        }
        return propertyInfos;
    }

}
