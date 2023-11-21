// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x = 100; // сумма начального счета
        int deposit = 300; // сумма  пополнения

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }



        System.out.println(x + deposit + bonus);

    }
}
