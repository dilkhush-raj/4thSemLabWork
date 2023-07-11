// Write a program in Java to implement the formula
// Area = Height X Width

import java.util.Scanner;

class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height: ");
        long height = scanner.nextLong();
        System.out.print("Enter Width: ");
        long width = scanner.nextLong();
        scanner.close();

        long area = Area(height, width);
        System.out.println("The area of the rectangle is " + area);
    }

    private static long Area(long height, long width) {
        return height * width;
    }
}
