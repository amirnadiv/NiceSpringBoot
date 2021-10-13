package com.example.nice3.model;

import com.opencsv.bean.CsvBindByPosition;
import java.util.Objects;

public class Interaction {

    @CsvBindByPosition(position = 0)
    String id;
    @CsvBindByPosition(position = 1)
    String duration;
    @CsvBindByPosition(position = 2)
    String startTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interaction that = (Interaction) o;
        return Objects.equals(id, that.id) && Objects.equals(duration, that.duration) && Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duration, startTime);
    }
}
