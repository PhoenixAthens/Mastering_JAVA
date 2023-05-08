package Functional_Programming_Java8;

public class Lesson1_Introduction_Lambdas {
    @FunctionalInterface
    private interface Calculator{
        public int compute(int a, int b);
    }
    public static void main(String...args){
        //Before Java8
        Calculator anonymousClass=new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a+b;
            }
        };
        var value = anonymousClass.compute(5,10);
        System.out.println("ADDITION: "+value);
        //Since Java 8
        Calculator add=(int a, int b)->{return a+b;};
        Calculator sub=(int a, int b)->(a-b);
        Calculator multiply=(a,b)->a*b;
        Calculator div = (a,b)->a/b;
        //Calculator uba = (int a,int b)->return a+b; NOT POSSIBLE
        var val1=add.compute(56,90);
        var val2=sub.compute(100,23);
        var val3=multiply.compute(54,93);
        var val4=div.compute(123,23);
        System.out.println("Add: "+val1+"\nSub: "+val2+"\nMultiply: "+val3+"\nDivide: "+val4);
    }
}
