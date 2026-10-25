import java.util.Random;
import java.util.Scanner;

public class Lab_09_Arrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Lab 9: Defining and Managing Arrays
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Lab 9: Defining and Managing Arrays");

    }
}
