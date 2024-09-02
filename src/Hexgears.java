public class Hexgears extends Keyboard {

    private int knobDegree;

    public Hexgears(String name, int buttonAmount, int knobDegree) {
        super(name, buttonAmount);
        this.knobDegree = knobDegree;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        System.out.println("Button amount: " + getButtonAmount());
        System.out.println("Volume knob max degree: " + knobDegree);
        System.out.println();
    }

}
