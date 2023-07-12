public class SI {
    int p, r, t;
    float result;

    void input(){
        p=1000;
        r=4;
        t=5;
    }
    
    void process(){
        result = (p*r*t)/100;
    }

    void output(){
        System.out.println(result);
    }

    public static void main(String[] args){
        SI obj = new SI();
        obj.input();
        obj.process();
        obj.output();
    }
}
