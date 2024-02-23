package PoolGame.observer;

public class TimeObserver implements Observer{
    private Timer timer;


    public TimeObserver(Timer t){
        this.timer = t;
        t.attach(this);

    }


    @Override
    public String update() {
        return timer.getTime();
    }

}
