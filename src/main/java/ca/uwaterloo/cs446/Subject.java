
public class Subject {
    private ArrayList<Observer> observers;

    Subject() {
        observers = new ArrayList<>();
    }


    public void attach(Observer obs) {
        observers.add(obs);
    }

    public void sendNotice() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }


    public abstract int getState() {
    }

    public abstract void setState(int s) {
    }

}