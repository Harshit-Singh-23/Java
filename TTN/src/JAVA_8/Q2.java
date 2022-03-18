package JAVA_8;
interface myInterface{
    int Operation(int a, int b);
}
public class Q2{
    public int add(int a, int b){
        System.out.println("Addition of the given numbers:");
        return a+b;
    }
    public int sub(int a, int b){
        System.out.println("Subtraction of a from b:");
        return b-a;
    }
    public static int multiply(int a, int b){
        System.out.println("Product of the given numbers:");
        return a*b;
    }

    public static void main(String[] args) {
        myInterface m1 = new Q2()::add;
        System.out.println();
        System.out.println(m1.Operation(4,12));
        myInterface m2 = new Q2()::sub;
        System.out.println(m2.Operation(3,8));
        myInterface m3 = Q2::multiply;
        System.out.println(m3.Operation(4,8));
    }
}