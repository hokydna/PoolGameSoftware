package PoolGame.observer;

public class Timer extends Subject{
    private int time;
    private int ms;


    public String getTime(){
        return String.format("Time %d: %02d" , time / 60 ,time % 60);
    }

    public String updateTime(){
        ms += 17;
        if(ms >= 1000){
            time += 1;
            ms = 0;
        }
        return inform();
    }

    public void resetTime(){
        time = 0;
        ms = 0;
    }

    public void setTime(int time){
        this.time = time;
        ms = 0;
    }

    public int getTimeInt(){
        return time;
    }

}
