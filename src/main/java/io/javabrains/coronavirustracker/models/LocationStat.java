package io.javabrains.coronavirustracker.models;

import java.io.StringReader;

public class LocationStat {

    private String country;
    private String state;
    private int totalStat;
    private int diffPrevDay;

    public int getDiffPrevDay() {
        return diffPrevDay;
    }

    public void setDiffPrevDay(int diffPrevDay) {
        this.diffPrevDay = diffPrevDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotalStat() {
        return totalStat;
    }

    public void setTotalStat(int totalStat) {
        this.totalStat = totalStat;
    }

    @Override
    public String toString() {
        return "LocationStat{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", totalStat=" + totalStat +
                '}';
    }
}
