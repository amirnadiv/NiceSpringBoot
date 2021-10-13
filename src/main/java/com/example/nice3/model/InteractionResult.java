package com.example.nice3.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class InteractionResult implements Serializable {

    private String id;
    private List<String> results;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InteractionResult that = (InteractionResult) o;
        return Objects.equals(id, that.id) && Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, results);
    }

    @Override
    public String toString() {
        return "InteractionResult{" +
                "id='" + id + '\'' +
                ", results=" + results +
                '}';
    }
}
