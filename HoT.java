import java.util.*;

public class HoT {

    public static void main(String[] args) {
	System.out.println("Who are you?");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	System.out.println("Hello, " + name + "!");
        int ctH = 0, ctT = 0;
        System.out.println("Tossing a coin...");
        String[] HT = { "Heads", "Tails" };
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            String num = HT[rand.nextInt(2)];
            int j = i + 1;
            System.out.println("Round " + j + ": " + num);
            if (num == HT[0]) {
                ctH++;
            } else
                ctT++;
        }
        System.out.println("Heads:" + ctH + ",Tails:" + ctT);
    }

}
