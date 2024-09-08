import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> linesA = new ArrayList<>();
        ArrayList<String> linesB = new ArrayList<>();

        System.out.println("Input five lines...");
        for (int i = 0; i < 5; i++) {
            linesA.add(sc.nextLine());
        }
        System.out.println(linesA + "\n");

        System.out.println("Now, another five...");
        for (int i = 0; i < 5; i++) {
            linesB.add(sc.nextLine());
        }
        System.out.println(linesB + "\n");

        ArrayList<String> linesC = new ArrayList<>();
        Collections.reverse(linesB);
        for (int i = 0; i < 5; i++) {
            linesC.add(linesA.get(i));
            linesC.add(linesB.get(i));
        }
        System.out.println("List C");
        System.out.println(linesC + "\n");

        linesC.sort(Comparator.comparing(String::length));
        System.out.println("Sorted C");
        System.out.println(linesC);
    }

}
