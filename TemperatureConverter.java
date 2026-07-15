import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");

        int choice = sc.nextInt();

        double temperature, result;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = (temperature * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", result);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = temperature + 273.15;
                System.out.printf("Temperature in Kelvin: %.2f K%n", result);
                break;

            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = (temperature - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f°C%n", result);
                break;

            case 4:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = ((temperature - 32) * 5 / 9) + 273.15;
                System.out.printf("Temperature in Kelvin: %.2f K%n", result);
                break;

            case 5:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = sc.nextDouble();
                result = temperature - 273.15;
                System.out.printf("Temperature in Celsius: %.2f°C%n", result);
                break;

            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = sc.nextDouble();
                result = ((temperature - 273.15) * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", result);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}