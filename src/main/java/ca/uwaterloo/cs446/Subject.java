
public class Subject {
    private ArrayList<Observer> observers;
    private int state;

    Subject() {
        observers = new ArrayList<>();
    }


    public void attach(Observer obs) {
        observers.add(obs);
    }

    public void sendNotice() {
        for (Observer obs : observers) {
            obs.update();
        }
    }


    public int getState() {
        return state;
    }

    public void setState(int s) {
        state = s;
    }

}