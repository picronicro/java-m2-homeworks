public class Properties {

    private String serialNum;
    private String manufacturer;

    public Properties(String serialNum, String manufacturer) {
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
