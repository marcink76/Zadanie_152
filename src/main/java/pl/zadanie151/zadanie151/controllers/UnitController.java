package pl.zadanie151.zadanie151.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.zadanie151.zadanie151.repositories.UnitRepository;
import pl.zadanie151.zadanie151.model.Unit;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("unit")
public class UnitController {

    private UnitRepository unitRepository;

    @Autowired
    public UnitController(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    @GetMapping("/addunit")
    public String addProductForm(Model model) {
        model.addAttribute("unit", new Unit("Koszula", "333", "cloth"));
        return "addunit"; // To nie dziala:
    }

    /*
    @RequestMapping(path = "/addunit", method = RequestMethod.GET)
    @ResponseBody
    public void addUnit(@RequestParam String name,
                        @RequestParam String price,
                        @RequestParam String cathegory) {

        Unit unit = new Unit(name, price, cathegory);
        unitRepository.add(unit);
    }


    @RequestMapping("/addunit")
    @ResponseBody
    public void addUnit(HttpServletRequest request) {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String cathegory = request.getParameter("cathegory");

        unitRepository.add(new Unit(name, price, cathegory));

    }
    */
    @RequestMapping("/showall")
    @ResponseBody
    public String showAll() {
        List<Unit> allUnits = unitRepository.getAllUnits();
        StringBuilder result = new StringBuilder();
        for (Unit allUnit : allUnits) {
            result.append(allUnit.toString()).append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("/sorting")
    @ResponseBody
    public String sorting(@RequestParam String cathegory) {
        List<Unit> allUnits = unitRepository.getAllUnits();
        StringBuilder result = new StringBuilder();

        double totalPrice = 0;

        for (Unit allUnit : allUnits) {
            if (allUnit.getCathegory().equals(cathegory)) {
                result.append(allUnit.toString()).append("<br>");
                totalPrice += Double.parseDouble(allUnit.getPrice());
            }
        }
        result.append("<br> Całkowite wydatki: " + totalPrice);
        return result.toString();
    }


    @RequestMapping(value = "/addunitform")

    public String addUnitPost() {
        System.out.println("Test");
        return "addunit";
    }
}