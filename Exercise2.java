// Write a program in Java to find the result of following expression 
// (Assume a = 10, b = 5)
// i) (a < < 2) + (b > > 2)
// ii) (a) | | (b > 0)
// iii) (a + b 100) / 10
// iv) a & b

public class Exercise2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int result1 = (a << 2) + (b >> 2);
        Boolean result2 = (a > 0) || (b > 0);
        int result3 = (a + b * 100) / 10;
        int result4 = a & b;

        System.out.println("Result for (a < < 2) + (b > > 2) : " + result1);
        System.out.println("Result for (a) | | (b > 0) : " + result2);
        System.out.println("Result for  (a + b *100) / 10: " + result3);
        System.out.println("Result a & b : " + result4);
    }
}
