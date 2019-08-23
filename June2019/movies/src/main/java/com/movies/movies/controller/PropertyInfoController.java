package com.movies.movies.controller;


import com.movies.movies.model.PropertyInfo;
import com.movies.movies.model.PropertyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityNotFoundException;

@Controller
public class PropertyInfoController {
    private PropertyInfoService propertyInfoService;

    @Autowired
    public  PropertyInfoController(PropertyInfoService propertyInfoService){
        this.propertyInfoService = propertyInfoService;
    }



    @GetMapping("/propertyInfoadd")
    public String propertyInfos(@RequestParam(required = false, name = "id") Long id, Model model){
        PropertyInfo propertyInfo;
        if(id == null){
            propertyInfo = new PropertyInfo();
        }else {
            propertyInfo = propertyInfoService.findPropertyInfoById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Could not find propertyInfo " + id));
        }
        model.addAttribute("propertyInfo", propertyInfo);
        return  "propertyInfoadd";
    }

    @GetMapping("/propertyInfo")
    public String propertyInfoshome(@RequestParam(required = false, name = "id") Long id, Model model){
        PropertyInfo propertyInfo;
        if(id == null){
            propertyInfo = new PropertyInfo();
        }else {
            propertyInfo = propertyInfoService.findPropertyInfoById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Could not find propertyInfo " + id));
        }
        model.addAttribute("propertyInfo", propertyInfo);
        return  "propertyInfo";
    }

    @GetMapping("/propertyInfos")
    public String propertyInfos(Model model) {
        model.addAttribute("propertyInfos", propertyInfoService.getPropertyInfos());
        return "propertyInfos";
    }


    @PostMapping("/propertyInfoadd")
    public String savepropertyInfo(@ModelAttribute PropertyInfo propertyInfo, Model model){
        propertyInfoService.savePropertyInfo(propertyInfo);
        model.addAttribute("propertyInfos",propertyInfoService.getPropertyInfos());
        return "propertyInfos";
    }

    @PostMapping("/propertyInfosearch")
    public String propertyInfosearch(@ModelAttribute PropertyInfo propertyInfo, Model model){
        model.addAttribute("propertyInfos",propertyInfoService.getPropertyInfosbycity(propertyInfo.getCity()));
        return "propertyInfosearch";
    }





}
