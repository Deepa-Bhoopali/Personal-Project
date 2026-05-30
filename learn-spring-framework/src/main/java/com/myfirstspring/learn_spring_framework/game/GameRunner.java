package com.myfirstspring.learn_spring_framework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) { //Loose coupling
        this.game = game;
    }
    
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
