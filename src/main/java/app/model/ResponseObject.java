package app.model;

public class ResponseObject {

    private String instance;
    private String clientIp;

    public ResponseObject(String instance, String clientIp) {
        this.instance = instance;
        this.clientIp = clientIp;
    }

    public ResponseObject() {
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
}
