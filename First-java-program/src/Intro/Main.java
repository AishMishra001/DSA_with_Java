import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(3242345);
        Scanner input = new Scanner(System.in) ;
        System.out.println(input.nextInt());
        input.close();
        Scanner input2 = new Scanner(System.in) ;
        System.out.println(input2.next());
        input2.close();
    }
}