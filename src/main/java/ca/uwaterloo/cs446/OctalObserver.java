public class OctalObserver extends Observer  {
    private String octValue;
    public void OctalObserver() {
    }

    @Override
    public void update(Subject sub) {
        this.octValue = sub.getState.toOctalString();
    }

    @Override
    public String getValue() {
        return this.octValue;
    }

}