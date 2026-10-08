import java.util.Scanner;

public class Hackathon1Q3
{

    public static double Add(double morningenergy, double eveningenergy) 
    {
        double result = morningenergy + eveningenergy;
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Morning Energy: ");
        double morningenergy = sc.nextDouble();

        System.out.print("Enter Evening Energy: ");
        double eveningenergy = sc.nextDouble();

        double answer = Add(morningenergy, eveningenergy);

        System.out.println("Total Energy: " + answer);

        sc.close();
    }
}
