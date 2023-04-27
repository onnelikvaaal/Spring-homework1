package sky.pro.homework;

public class Driver {

    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return name + " is driving the " + transport + "!";
    }
}