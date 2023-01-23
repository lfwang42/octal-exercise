package observer;
import subject.Subject;

public abstract class Observer {

    public Observer() {
        
    }

    public abstract void update(Subject sub);

    public abstract String getValue();
}