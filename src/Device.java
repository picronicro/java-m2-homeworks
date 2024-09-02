public class Device {

    private String name;
    private int id;
    private Properties properties;
    private PortEnum port;

    public Device(String name, int id, Properties properties, PortEnum port) {
        this.name = name;
        this.id = id;
        this.properties = properties;
        this.port = port;
    }

    public void printProps() {
        System.out.println(" " + name + "\nID: " + id + "\nPort: " + port.name()
                + "\n Properties \nManufacturer: "
                + properties.getManufacturer() + "\nSerial Number: " + properties.getSerialNum() + "\n");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Properties getProperties() {
        return properties;
    }

    public PortEnum getPort() {
        return port;
    }

}
