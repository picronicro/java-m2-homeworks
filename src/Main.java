public class Main {

    public static void main(String[] args) {
        Keyboard[] boards = {
                createObject("FlEsports"),
                createObject("Hexgears"),
                createObject("HyperX")
        };

        for (Keyboard board : boards) {
            board.print();
        }
    }

    public static Keyboard createObject(String className) {
        Keyboard keyboard = null;
        switch(className) {
            case "FlEsports" -> keyboard = new FlEsports("FL680", 68, "Plate Mount");
            case "Hexgears" -> keyboard = new Hexgears("GK707", 87, 60);
            case "HyperX" -> keyboard = new HyperX("Alloy Elite RGB", 104, "poor");
        }

        return keyboard;
    }

}
