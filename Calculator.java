package mathematics;

public class Calculator{
     protected int value = 100;
     protected int add(int a,int b){
        return a+b;
    }
    protected int multiply(int a,int b){
        return a*b;
    } 
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println("You are in the Calculator class of the mathematics package");
        System.out.println(c.multiply(3,4));
    }
}

