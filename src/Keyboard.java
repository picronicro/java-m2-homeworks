public abstract class Keyboard implements Printable {

    private String name;
    private int buttonAmount;

    public Keyboard(String name, int buttonAmount) {
        this.name = name;
        this.buttonAmount = buttonAmount;
    }

    public String getName() {
        return name;
    }

    public int getButtonAmount() {
        return buttonAmount;
    }

}
