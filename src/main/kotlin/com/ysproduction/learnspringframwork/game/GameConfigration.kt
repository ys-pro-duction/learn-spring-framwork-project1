package com.ysproduction.learnspringframwork.game

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GameConfigration {
    @Bean
    fun mario(): GameController {
        val marioGame = SuperContra()
        return marioGame
    }
    @Bean
    fun gameRunner(game: GameController): GameRunner{
        val runner = GameRunner(game)
        return runner
    }
}