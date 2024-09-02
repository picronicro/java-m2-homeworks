public class HyperX extends Keyboard {

    private String quality;

    public HyperX(String name, int buttonAmount, String quality) {
        super(name, buttonAmount);
        this.quality = quality;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        System.out.println("Button amount: " + getButtonAmount());
        System.out.println("Production quality: " + quality);
        System.out.println();
    }

}
