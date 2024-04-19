import sun.nio.cs.Surrogate;

import java.util.Scanner;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
