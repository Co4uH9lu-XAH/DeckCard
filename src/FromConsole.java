import java.util.Scanner;

public  class FromConsole {

    public static String say () {
        Scanner scan = new Scanner(System.in);
        String say = scan.nextLine();
        return say;
    }
}
