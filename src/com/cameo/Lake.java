package com.cameo;

import java.util.ArrayList;

/**
 * Created by Cameo on 11/17/2015.
 */
public class Lake {
    private String name;
    private ArrayList<Double> runTimes;

    public Lake(String lakeName){
    this.name = lakeName;
    this.runTimes = new ArrayList<>();

}
    public void addRunTime(double newRunTime){
        runTimes.add(newRunTime);
    }

    public double fastestTime() {
        double fastestTime = runTimes.get(0);
        for (Double time : runTimes) {
            if (time < fastestTime) {
                fastestTime = time;
            }
        }
        return fastestTime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getRunTimes() {
        return runTimes;
    }
}
