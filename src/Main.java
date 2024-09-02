import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse(
                "Mouse",
                12,
                new Properties(UUID.randomUUID().toString(), "Generic mouse manufacturer"),
                PortEnum.COM1
        );
        Roccat roccatKone = new Roccat(
                "Roccat Kone Aimo Remastered",
                18,
                new Properties(UUID.randomUUID().toString(), "Roccat GmbH"),
                PortEnum.COM2
        );
        Roccat roccatBurst = new Roccat(
                "Roccat Burst Pro",
                5,
                new Properties(UUID.randomUUID().toString(), "Roccat GmbH"),
                PortEnum.COM3
        );

        mouse.printProps();
        roccatKone.printProps();
        roccatBurst.printProps();

        System.out.println(roccatKone.input("LMB"));
        System.out.println(roccatKone.input(256.2));
        System.out.println(roccatKone.input(1200));

        System.out.println(roccatKone.input("RMB"));
        System.out.println(roccatKone.input(100.7));
        System.out.println(roccatKone.input(700));
    }

}