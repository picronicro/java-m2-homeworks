public class Mouse extends Device {

    public Mouse(String name, int id, Properties properties, PortEnum port) {
        super(name, id, properties, port);
    }

    public String input(String buttonName) {
        return "You clicked " + buttonName;
    }

    public String input(double distance) {
        return "You scrolled " + distance + " cm";
    }

    public String input(int dpi) {
        return "You changed dpi to " + dpi;
    }

}
