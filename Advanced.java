package mathematics;

public class Advanced{
    public int addition(int a,int b){
        return a+b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public static void main(String args[]){
        Advanced a = new Advanced();
        System.out.println("You are in the Advanced class of the mathematics package");
        System.out.println("Yes you are in the correct path only");
        System.out.println(a.multiply(3,4));
    }
}