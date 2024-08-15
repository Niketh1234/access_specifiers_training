package physics;
public class Distance{
    public static void main(String ... args){
        System.out.println("You are in the physics package..");
        System.out.println("Calculating the distance");
        calculateDistance();
    }
    public static void calculateDistance(){
        double speed = 10;
        int time = 50;
        System.out.println(speed * time);
    }
}