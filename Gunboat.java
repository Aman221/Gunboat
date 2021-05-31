import java.util.Scanner;

public class Gunboat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter distance to target.\n");
        double d = reader.nextDouble();
        System.out.println("Enter the height of the battery relative to the water line. \n");
        double h = reader.nextDouble();
        System.out.println("Enter the initial velocity of the shell. \n");
        double v = reader.nextDouble();

        double a = -4.9*Math.pow((d/v), 2);
        double b = d;
        double c = a + h;

        double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double angle = Math.atan(tanTheta)*(180/Math.PI);

        if ((b*b-4*a*c) < 0)
            System.out.println("The enemy is too far or your shell is too slow! Never fear, bide your time, shoot faster and try again!");
        else
            System.out.println("The shell was fired at an angle of " + angle + " degrees!");
    }
}