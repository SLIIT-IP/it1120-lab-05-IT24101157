import java.util.Scanner;

public class IT24101157Lab5Q3{

    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date : ");
        int endDate = scanner.nextInt();


        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println(" Error: Start Date must be less than End Date.");
            return;
        }

        int numberOfDaysReserved = endDate - startDate;

        int discountRate = 0;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discountRate / 100;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Room Charge Per Day:"+ROOM_CHARGE_PER_DAY +"/=" );
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.println("Total amount to be paid:  " + finalAmount);

    }
}