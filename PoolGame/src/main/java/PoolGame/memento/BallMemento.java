package PoolGame.memento;

import java.util.ArrayList;
import java.util.HashMap;

import PoolGame.objects.*;

public class BallMemento {
    private HashMap<Ball, Ball> currBalls = new HashMap<>();
    private int score;
    private int time;
    private int gameScore;
    public BallMemento(ArrayList<Ball> balls, int score, int time, int gameScore){
        for(Ball b : balls){
                PoolBallBuilder ballBuild = new PoolBallBuilder();
                ballBuild.setColour(b.getColourString());
                ballBuild.setMass(b.getMass());
                ballBuild.setxPos(b.getxPos());
                ballBuild.setxVel(b.getxVel());
                ballBuild.setyPos(b.getyPos());
                ballBuild.setyVel(b.getyVel());

                Ball saveBall = ballBuild.build();
                saveBall.setActive(b.isActive());
                saveBall.getStrategy().setLives(b.getStrategy().getLives());
                currBalls.put(b, saveBall);
            
        }
    
        this.score = score;
        this.time = time;
        this.gameScore = gameScore;
    }

    public Ball getStateBall(Ball ball) {
        return currBalls.get(ball);
    }
    
    public int getScoreInt(){
        return score;
    }
    public int getTimeInt(){
        return time;
    }
    public int getGameScore(){
        return gameScore;
    }
}
