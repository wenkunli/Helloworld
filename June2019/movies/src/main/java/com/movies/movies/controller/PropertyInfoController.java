package com.movies.movies.controller;


import com.movies.movies.model.PropertyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PropertyInfoController {
    private PropertyInfoService propertyInfoService;

    @Autowired
    public  PropertyInfoController(PropertyInfoService propertyInfoService){
        this.propertyInfoService = propertyInfoService;
    }
    @GetMapping("/propertyInfos")
    public String propertyInfos(Model model) {
        model.addAttribute("propertyInfos", propertyInfoService.getPropertyInfos());
        return "propertyInfos";
    }

}
