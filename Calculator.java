package mathematics;

public class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    } 
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println("You are in the Calculator class of the mathematics package");
        System.out.println(c.multiply(3,4));
    }
}