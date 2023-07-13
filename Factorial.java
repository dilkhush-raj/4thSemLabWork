
import java.util.Scanner;

public class Factorial {
    int i, n, factorial;

    void input(){
        factorial = 1;
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter a number : ");

         n = scan.nextInt();

         scan.close();
    }

    void process() {
        for (i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
    }

    void output() {
        System.out.println("Factorial of 5 : " + factorial);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.input();
        obj.process();
        obj.output();
    }
}
