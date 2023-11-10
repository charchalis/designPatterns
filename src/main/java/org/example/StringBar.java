package org.example;

public class StringBar extends Bar {

    private boolean happyHour;

    public StringBar(boolean happyHour) {
        super();
        this.happyHour = happyHour;
    }

    public StringBar() {
        this.happyHour = false;
    }

    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        this.happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHour = false;
        notifyObservers();
    }

    public void setHappyHour(boolean happyHour) {
        this.happyHour = happyHour;
    }
}
