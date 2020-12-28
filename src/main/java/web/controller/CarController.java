package web.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model){
        CarService carService = new CarServiceImp();
        count = count == null ? 5 : count;
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
