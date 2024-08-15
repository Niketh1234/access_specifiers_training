package physics;
import mathematics.Calculator;
public class Force extends Calculator {
    public void show(){
        System.out.println(add(10,20));
        System.out.println(value);
    }
    public static void main(String ... args){
        Force f = new Force();
        f.show();
    }
}

