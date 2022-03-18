import java.util.Scanner;

public class First{

    public First(){
        
    }
    public static Scanner scn = new Scanner(System.in);

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static int newSum(int a, int b){
        int c = (2 * a) + (2 * b);
        return c;
    }
    public static void main(String[] args){

        First f = new First();
        int x = 2;
        int y = 3;
        f.swap(x, y);
        int z = newSum(x, y);
        System.out.println(z);
        // System.out.println(y);

    }
}