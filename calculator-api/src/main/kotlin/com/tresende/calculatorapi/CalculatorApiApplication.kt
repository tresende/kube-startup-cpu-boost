package com.tresende.calculatorapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalculatorApiApplication

fun main(args: Array<String>) {
    stressCpu()
    runApplication<CalculatorApiApplication>(*args)
}

private fun stressCpu() {
    // Simulando uso intenso de CPU
    println("Iniciando o stress na CPU...")
    for (i in 0 until 35000) {
        doCpuIntensiveWork()
    }
}

private fun doCpuIntensiveWork() {
    var result = 0.0
    for (i in 0 until 2_000_000) {
        result += Math.sqrt(i.toDouble()) // operação pesada
    }
}

// docker build . -t tresende/calculator-api &&  docker tag tresende/calculator-api latest && docker push tresende/calculator-api