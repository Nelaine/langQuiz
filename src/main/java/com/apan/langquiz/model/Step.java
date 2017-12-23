package main.java.com.apan.langquiz.model;

import java.util.List;

/**
 * Created by Agnieszka on 2017-12-23.
 */
public class Step {
    String id;
    String label;
    List<Row> listOfRows;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Row> getListOfRows() {
        return listOfRows;
    }

    public void setListOfRows(List<Row> listOfRows) {
        this.listOfRows = listOfRows;
    }
}
