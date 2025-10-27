package com.pluralsight.models;

public class Moped extends Vehicles {
    private int engineSize;
    private boolean hasPedalAssist;

    public boolean isHasPedalAssist() {
        return hasPedalAssist;
    }

    public void setHasPedalAssist(boolean hasPedalAssist) {
        this.hasPedalAssist = hasPedalAssist;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

}
