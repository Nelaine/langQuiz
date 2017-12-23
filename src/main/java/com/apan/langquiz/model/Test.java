package main.java.com.apan.langquiz.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Agnieszka on 2017-12-23.
 */
public class Test {
    String id;
    String name;
    Person author;
    Date addedOnDate;
    Dictionary language;
    String label;
    List<Step> listOfSteps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public Date getAddedOnDate() {
        return addedOnDate;
    }

    public void setAddedOnDate(Date addedOnDate) {
        this.addedOnDate = addedOnDate;
    }

    public Dictionary getLanguage() {
        return language;
    }

    public void setLanguage(Dictionary language) {
        this.language = language;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Step> getListOfSteps() {
        return listOfSteps;
    }

    public void setListOfSteps(List<Step> listOfSteps) {
        this.listOfSteps = listOfSteps;
    }
}
