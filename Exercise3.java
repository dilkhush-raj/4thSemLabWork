// Write a program in Java to explain the use of break and continue statements.

public class Exercise3 {
    public static void main(String[] args){
        int i[] = {1,2,3,4,5,6,7,8,9,10};

        for(int j = 0; j<i.length; j++){
            if(i[j] == 5 ){
                break;
            }
            System.out.println(i[j]);
        }
        for(int j = 0; j<i.length; j++){
            if(i[j] == 5 ){
                continue;
            }
            System.out.println(i[j]);
        }
    }
}
