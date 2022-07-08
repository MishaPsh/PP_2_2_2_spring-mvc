package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ShowGetCars;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final ShowGetCars showGetCars;

    public CarController(ShowGetCars showGetCars) {
        this.showGetCars = showGetCars;
    }

    @GetMapping()
    public String showCars(Model model, @RequestParam(value = "count", required = false) Integer count) {

        if (count == null) {
            model.addAttribute("cars_list", showGetCars.getAllCar());
        }
        if (count <= 4) {
            model.addAttribute("cars_list", showGetCars.
                    getCarInterval(count));
        }
        if (count >= 5) {
            model.addAttribute("cars_list", showGetCars.getAllCar());
        }

        return "cars";
    }
}
