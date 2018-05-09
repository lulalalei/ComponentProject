package com.example.basemodel.eventbean;

/**
 * Created by Administrator on 2018/5/8.
 */

public class TestEvent {

    public TestEvent(String query, String type) {
        this.query = query;
        this.type = type;
    }

    private String query;

    private String type;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
