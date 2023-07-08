package com.ysproduction.learnspringframwork

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

private const val TAG = "HelloWorldConfigration "
data class Person (val name: String, val age: Int)
data class Address(val person: Person, val street: String, val city: String)
@Configuration
class HelloWorldConfigration {
    @Bean
    fun name(): String{
        println(TAG+"name: Start")
        return "Yogesh!"
    }
    @Bean
    fun age(): Int{
        println(TAG+"age: start")
        return 18
    }
    @Bean
    @Qualifier("personQualifire")
    fun person(): Person {
        return Person("Ravi", 45)
    }
    @Bean(name = ["personMethodCall"])
    @Primary
    fun person2(): Person {
        return Person(name(), age())
    }
    @Bean
    fun addr(): Address {
        return Address(person(), "Behind jalday vibhaj", "Ratangarh")
    }
    @Bean(name = ["fullAddress"])
    fun addr2(): Address {
        return Address(person2(),"Behind jalday vibhaj", "Ratangarh")
    }
    @Bean(name = ["paramaterCall"])
    @Primary
    fun addr3(person: Person,distric: String,name: String): Address {
        return Address(person,distric, name)
    }
    @Bean(name = ["distric","anotherName"])
    fun churu(): String {
        return "Churu"
    }
    @Bean(name = ["paramaterCallWithQualifire"])
    fun addr4(@Qualifier("personQualifire") person5: Person, distric: String, name: String): Address {
        return Address(person5,distric, name)
    }
}