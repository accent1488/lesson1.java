import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String  age = scanner.nextLine();
       switch (age){
           case "ноль" :
               System.out.println("ты только что родился");
               break;
           case "семь" :
               System.out.println("ты идёшь в шкилку");
           case "восемнадцать" :
               System.out.println("ты косишь от армии");
               break;
           default:
               System.out.println("нет результата");
       }
    }
}
