import java.util.Scanner;

class Time {
     int hours;
     int minutes;
     int seconds;

    // Constructor to initialize time to zero
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Constructor to initialize time to user-provided values
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to display time in hh:mm:ss format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    // Method to add two Time objects and return a new Time object
    public Time addTime(Time otherTime) {
        int totalSeconds = this.seconds + otherTime.seconds;
        int carryMinutes = totalSeconds / 60;
        totalSeconds %= 60;

        int totalMinutes = this.minutes + otherTime.minutes + carryMinutes;
        int carryHours = totalMinutes / 60;
        totalMinutes %= 60;

        int totalHours = this.hours + otherTime.hours + carryHours;

        return new Time(totalHours, totalMinutes, totalSeconds);
    }
}

 class Time2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first time
        System.out.println("Enter the first time:");
        System.out.print("Hours: ");
        int hours1 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Seconds: ");
        int seconds1 = scanner.nextInt();

        // Input for the second time
        System.out.println("\nEnter the second time:");
        System.out.print("Hours: ");
        int hours2 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Seconds: ");
        int seconds2 = scanner.nextInt();

        // Create Time objects
        Time time1 = new Time(hours1, minutes1, seconds1);
        Time time2 = new Time(hours2, minutes2, seconds2);

        // Display the input times
        System.out.println("\nTime 1:");
        time1.displayTime();
        System.out.println("Time 2:");
        time2.displayTime();

        // Add the two times
        Time sumTime = time1.addTime(time2);

        // Display the result
        System.out.println("\nSum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}
