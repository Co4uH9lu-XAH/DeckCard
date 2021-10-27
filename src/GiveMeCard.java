
public class GiveMeCard {
    static String ask;

    public static void main(String[] args) {
        ask = FromConsole.say();
        while (!ask.equalsIgnoreCase("Флюгегехайме")) {
            if (ask.equalsIgnoreCase("тяну") || ask.equalsIgnoreCase("еще")) {
                randomCard();
                randomSuit();
            } else if (ask.equalsIgnoreCase("хватит")) {
                System.out.println("Ахтыжептваю!!! ЗарЭжу, да! Тяни, давай");
            } else {
                System.out.println("Нихьт ферштейн, тяни, говорю");
            }
            ask = FromConsole.say();
        }
        System.out.println("Уже уходищь? Ты эта...Заходи еще");
    }

    public static void randomSuit () {
        String[] suit = {"бубей", "червей", "пик", "крестей"};
        int n = (int)Math.floor(Math.random() * suit.length);
        System.out.println(suit[n]);
    }
    public static void randomCard () {
        String[] suit = {"6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int n = (int) Math.floor(Math.random() * suit.length);
        System.out.print(suit[n] + " ");
    }
}
