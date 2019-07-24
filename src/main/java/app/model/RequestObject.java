package app.model;

public class RequestObject {
    private String instance;


    public RequestObject(String instance) {
        this.instance = instance;
    }

    public RequestObject() {
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
