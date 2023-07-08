package com.ysproduction.learnspringframwork

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.Arrays

class App02HelloWorldSpring {

}

private const val TAG = "App02HelloWorldSpring "
fun main() {
    println(TAG+"start")
    val context = AnnotationConfigApplicationContext(HelloWorldConfigration::class.java)
    println(context.getBean("name"))
    println(context.getBean("age"))
    val person = context.getBean("person") as Person
    println(person.name+" : "+person.age)
    println(context.getBean("personMethodCall"))
    val addr = context.getBean("addr") as Address
    println(addr.street +","+addr.city)
    println(context.getBean("distric"))
    println(context.getBean(Int::class.java))
    println(context.getBean("fullAddress"))
    println(context.getBean("paramaterCall"))
    println(context.getBean(Address::class.java))
    println(context.getBean(Person::class.java))
    println(context.getBean("paramaterCallWithQualifire"))
    Arrays.stream(context.beanDefinitionNames).forEach(System.out::println)

}