package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String show(@RequestParam(name = "count",required = false) Integer count,
                       Model model){
        if (count == null) {
            model.addAttribute("cars", carDao.getCarList());
        } else {
            model.addAttribute("cars", carDao.getCarsNumber(count));
        }
        return "cars";
    }

}
