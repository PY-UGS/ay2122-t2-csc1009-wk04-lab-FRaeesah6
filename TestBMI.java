import java.util.Scanner;

public class TestBMI {
    public static void main(String [] args){
        double bmi = 0;
        String bmiInterpretation = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        BMI test = new BMI(weight, height);

        bmi = test.getBmi();
        bmiInterpretation = test.getBmiInterpretation();
        System.out.print("BMI is " + bmi);
        System.out.print("\n" + bmiInterpretation);
    }
}
