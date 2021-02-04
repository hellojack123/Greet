
import java.util.Scanner;

/**
 * @author huangjianchang
 */
public class Greet {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What's your name? ");
            String name = sc.nextLine();
            System.out.println("Hi," + name + "!");
        }
    }
}

