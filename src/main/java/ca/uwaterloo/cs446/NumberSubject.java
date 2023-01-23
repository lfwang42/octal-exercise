
public class NumberSubject extends Subject {
    public int state;
    
    public void NumberSubject(state: int) {
        this.state = state;
    }
    
    @Override 
    public int getState() {
        return this.state;
    }

    @Override 
    public void setState(state: int) {
        this.state = state;
    }
}