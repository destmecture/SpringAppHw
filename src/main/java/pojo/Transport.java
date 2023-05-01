package pojo;

public abstract class Transport {
    public Transport(String type) {
        this.type = type;
    }

    private String type;


    public String getType() {
        return type;
    }

    public abstract void readiness();
}
