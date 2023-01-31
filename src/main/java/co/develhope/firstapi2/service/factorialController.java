package co.develhope.firstapi2.service;

import co.develhope.firstapi2.controllers.FactorialCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class factorialController {

    @Autowired
    FactorialCalculator factorialCalculator;

    @GetMapping("/factorial/{n}")
    public Integer getFactorial(@PathVariable Integer n) {
        return factorialCalculator.calculateFactorial(n);
    }
}
