import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in - new Scanner(System.in);
    System.out.println("Enter your height in meters:");
    double height = in.nextDouble();

    System.out.println("Enter your weight in kilograms:");
    double weight = in.nextDouble();

    double bmi = String.format("%.2f", weight / (height * height));
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
  }
}
