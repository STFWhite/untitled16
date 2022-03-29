package lesson1;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println(do1(5, 8));
        do2(-7);
        System.out.println(do3(-1));
    }

    static boolean do1(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    static void do2(int a) {
        System.out.println("\nЗадание 2.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    static boolean do3(int a) {
        System.out.println("\nЗадание 3.");
        if (a<0) return true;
        else return false;
    }

}
