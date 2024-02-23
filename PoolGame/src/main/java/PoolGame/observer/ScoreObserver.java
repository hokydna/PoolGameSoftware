package PoolGame.observer;

public class ScoreObserver implements Observer{
  
    private Scorer scorer;

    public ScoreObserver(Scorer s){
        this.scorer = s;
        s.attach(this);
    }


    @Override
    public String update() {
        return scorer.getScore();
    }
}
