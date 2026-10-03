import java.util.Scanner;

public class WaterConsumption {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning water usage: ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage: ");
        int evening = scanner.nextInt();

        int total = calculateTotal(morning, evening);

        System.out.println("Total water consumption: " + total);

        scanner.close();
    }
}
