package PoolGame.observer;

public abstract class Subject {
    Observer o;
    
    public void attach(Observer o){
        this.o = o;
    }

    public void detach(Observer o) {
        if (this.o == o) {
            this.o = null;
        }
    }
    public String inform(){
        if (o != null){
            return this.o.update();
        }
        return null;
    }
}
