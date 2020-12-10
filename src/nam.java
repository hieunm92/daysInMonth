import java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which month that you want to count days?");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "The month '2' has 28 or 29 days";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "The month " + month +" has 31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "The month " + month +" has 30 days";
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equalsIgnoreCase(""))
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
