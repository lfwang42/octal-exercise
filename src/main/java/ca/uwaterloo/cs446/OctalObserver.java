package octalobserver;
import observer.Observer;
import subject.Subject;
import java.lang.*;

public class OctalObserver extends Observer  {
    private String octValue;
    public void OctalObserver() {
    }

    public void update(Subject sub) {
        int temp = sub.getState();
        this.octValue = temp.toOctalString();
    }

    public String getValue() {
        return this.octValue;
    }

}