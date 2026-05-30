package com.myfirstspring.learn_spring_framework;

import com.myfirstspring.learn_spring_framework.game.GameRunner;
import com.myfirstspring.learn_spring_framework.game.MarioGame;
import com.myfirstspring.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        var game = new SuperContraGame(); // 1: object creation
        var gameRunner = new GameRunner(game); // 2: pass the object to the game + wiring of dependencies
        // runner (dependency injection)
        // game is dependency of game runner
        gameRunner.run();

        // getting spring framework to do the wiring of dependencies for us

    }

}
