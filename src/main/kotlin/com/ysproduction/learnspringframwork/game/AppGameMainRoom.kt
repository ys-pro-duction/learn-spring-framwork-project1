package com.ysproduction.learnspringframwork.game

import org.springframework.context.annotation.AnnotationConfigApplicationContext

interface GameController{
    fun up()
    fun down()
    fun left()
    fun right()
}
fun main() {
    println("START")
//    GameRunner(MarioGame()).run()
//    GameRunner(SuperContra()).run()
    val context = AnnotationConfigApplicationContext(GameConfigration::class.java)
    context.getBean(GameController::class.java).up()
    context.getBean(GameRunner::class.java).run()

    println("END")
}

class SuperContra: GameController {
    override fun up(){
        println("fly up")
    }
    override fun down(){
        println("fly down")
    }
    override fun left(){
        println("slow donw")
    }
    override fun right(){
        println("speed up")
    }
}

class GameRunner(private val game: GameController) {
    fun run(){
        game.up()
        game.down()
        game.left()
        game.right()
    }
}

class MarioGame: GameController {
    override fun up(){
        println("up")
    }
    override fun down(){
        println("down")
    }
    override fun left(){
        println("back")
    }
    override fun right(){
        println("forward")
    }
}

