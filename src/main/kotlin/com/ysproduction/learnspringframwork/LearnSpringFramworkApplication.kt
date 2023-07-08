package com.ysproduction.learnspringframwork

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class LearnSpringFramworkApplication

fun main(args: Array<String>) {
    runApplication<LearnSpringFramworkApplication>(*args)
}

@RestController
class Controll {

    @GetMapping("/hello")
    fun printName(@RequestParam count: Int): String {
        println(count)
        var a = ""

        for (i in 0 until count) {
            a += "Yogesh"
        }
        return "$a "
    }

}
