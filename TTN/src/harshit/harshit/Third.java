package harshit;
import java.io.*;

public class Third{
    public static class SpecialStack{
        int[] data;
        int tos;
        int min;

        public SpecialStack(int cap){
            data = new int[cap];
            tos = -1;
            min = Integer.MAX_VALUE;
        }
        void push(int value){
            if(tos == data.length - 1){
                System.out.println("Stack Overflow");
            }
            else{
                tos++;
                data[tos] = value;
            }
            if(value < this.min){
                this.min = value;
            } 
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                int value = data[tos];
                tos--;
                return value;
            }
            
        }
        boolean isEmpty(){
            if(tos == -1){
                return true;
            }
            else {
                return false;
            }
        }
        boolean isFull(){
            if(tos == data.length - 1){
                return true;
            }
            else {
                return false;
            }
        }
        int getMin(){
            int min =Integer.MAX_VALUE;
            for(int i =0; i < data.length ; i++){
                if(data[i] < min){
                    min = data[i];
                }
            }
            return min;
        }

        int getTop(){
            return tos;
        }
    }
    public static void main(String[] args) throws IOException {
       SpecialStack st = new SpecialStack(10);
       
       if(st.isEmpty()) System.out.println("Stack Underflow");
       st.push(8);
       st.push(5);
       st.push(32);
       System.out.println("Top of Stack is: " + st.getTop());
       st.push(4);
       System.out.println("Minimum in Stack is: " + st.getMin());
       st.push(23);
       st.push(81);
       st.push(2);
       System.out.println("Minimum in Stack is: " + st.getMin());
       st.push(54);
       st.push(25);
       st.push(67);
       if(st.isFull()) System.out.println("Stack overflow");
       st.pop();
       st.pop();



    }
}