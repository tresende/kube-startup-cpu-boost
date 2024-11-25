package com.tresende.calculatorapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController {

    //docker run -p 8080:8080 --rm tresende/calculator-api
    //http://localhost:8080/sum?x=1&y=2
    @GetMapping("/sum")
    fun sum(
        @RequestParam(value = "x") x: Int,
        @RequestParam(value = "y") y: Int
    ) = x + y


    @GetMapping
    fun hc() {
        println("Health check")
    }
}