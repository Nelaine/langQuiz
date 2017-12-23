package main.java.com.apan.langquiz.model;

/**
 * Created by Agnieszka on 2017-12-23.
 */
public class Row {
    String id;
    Boolean isTrue;
    String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getTrue() {
        return isTrue;
    }

    public void setTrue(Boolean aTrue) {
        isTrue = aTrue;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
