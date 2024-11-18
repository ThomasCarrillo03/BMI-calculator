import java.util.Scanner;

public class Weight {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    // Method to know how much weight to lose or gain
    public static String calculateWeightToLorW(double weight, double idealWeight) {
        if (idealWeight > weight)
            return "You should gain: " + (idealWeight - weight) + " kg";
        else
            return "You should lose: " + (weight - idealWeight) + " kg";
    }

    // Method to determinate your weight level based on your BMI
    public static String weightLevel(double BMI) {
        if (BMI < 18.5)
            return "Low weight. Try to gain weight. Your low weight can cause you many problems.";
        else if (BMI >= 18.5 && BMI <= 24.9)
            return "Normal. Your weight is ideal, please try to stay just like this.";
        else if (BMI >= 25 && BMI <= 29.9)
            return "Overweight. Please be careful with your weight. Your weight can cause you some health problems.";
        else if (BMI >= 30 && BMI <= 34.9)
            return "Obesity I. Please try to lose weight. Your weight might start to cause you health problems.";
        else if (BMI >= 35 && BMI <= 39.9)
            return "Obesity II. Please try to lose weight. Your weight might cause you health problems.";
        else if (BMI >= 40 && BMI <= 49.9)
            return "Obesity III. Please try to lose weight. Your weight might cause you serious health problems.";
        else
            return "Obesity IV. Please try to lose weight. Your weight might cause you extreme health problems.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Insert your height in meters:");
        double height = scanner.nextDouble();

        double BMI = calculateBMI(weight, height);

        // Calculate the ideal weight
        double idealWeight = (height * 100) - 100;

        System.out.println("Your weight level is: " + weightLevel(BMI));

        System.out.println("Based on your weight and your height, your ideal weight should be: " + idealWeight + " kg");

        System.out.println(calculateWeightToLorW(weight, idealWeight));

        System.out.println("Remember that your health depends on many factors other than BMI. For a more precise answer, please consult a doctor.");
    }
}


