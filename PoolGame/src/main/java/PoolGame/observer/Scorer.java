package PoolGame.observer;

import PoolGame.objects.*;
import javafx.scene.paint.Paint;

public class Scorer extends Subject{
    private int score;


    public String getScore(){
        return String.format("Score: %d" , score);
    }

    public String updateScore(Ball ball){

        if(ball.getColour().equals(Paint.valueOf("red"))){
            score += 1;
        } else if (ball.getColour().equals(Paint.valueOf("yellow"))){
            score += 2;
        }else if (ball.getColour().equals(Paint.valueOf("green"))){
            score += 3;
        }else if (ball.getColour().equals(Paint.valueOf("brown"))){
            score += 4;
        }else if (ball.getColour().equals(Paint.valueOf("blue"))){
            score += 5;
        }else if (ball.getColour().equals(Paint.valueOf("purple"))){
            score += 6;
        }else if (ball.getColour().equals(Paint.valueOf("black"))){
            score += 7;
        } else if (ball.getColour().equals(Paint.valueOf("orange"))){
            score += 8;
        }
        return inform();
    }

    public void resetScore(){
        score = 0;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScoreInt(){
        return score;
    }
}
