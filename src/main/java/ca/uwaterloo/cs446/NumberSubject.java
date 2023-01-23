package numbersubject;
import subject.Subject;

public class NumberSubject extends Subject {
    public int state;

    public void NumberSubject(int state) {
        this.state = state;
    }
    
    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }
}