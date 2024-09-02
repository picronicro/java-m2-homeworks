public class FlEsports extends Keyboard {

    private String mount;

    public FlEsports(String name, int buttonAmount, String mount) {
        super(name, buttonAmount);
        this.mount = mount;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        System.out.println("Button amount: " + getButtonAmount());
        System.out.println("Mount type: " + mount);
        System.out.println();
    }

}
