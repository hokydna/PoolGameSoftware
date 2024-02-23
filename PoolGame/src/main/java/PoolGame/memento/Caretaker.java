package PoolGame.memento;


public class Caretaker {
    private BallMemento ballMemento;

    public Caretaker(){}
        
    
    public BallMemento getBallMemento(){
        return ballMemento;
    }

    public void addMemento(BallMemento ballMemento){
        this.ballMemento = ballMemento;
      
    }

    public void removeMemento(){
        this.ballMemento = null;

    }
    
    
}
