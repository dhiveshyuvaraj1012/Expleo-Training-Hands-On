package.com.javaassignment
import java.util.Scanner;

public class CalendarDisplay {
    public static void printCalendar(String monthName, int startDay, int daysInMonth) {
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println("\n     " + monthName);
        for (String day : daysOfWeek) {
            System.out.print(day + " ");
        }
        System.out.println();
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day - 1) % 7 == 0) System.out.println();
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        while (true) {
            System.out.print("Enter month number (1-12, other to exit): ");
            int month = sc.nextInt();
            if (month < 1 || month > 12) break;
            System.out.print("Enter starting day of the month (1=Mon, 7=Sun): ");
            int startDay = sc.nextInt();
            int daysInMonth = month == 2 ? sc.nextInt() : monthDays[month - 1];
            printCalendar(months[month - 1], startDay, daysInMonth);
        }
        sc.close();
    }
}