import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void displayYearsStatus(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        displayYearsStatus(year);
    }

    public static void printDeviceVersion(String os, int year) {
        int checkYear = 2015;
        if (os.equalsIgnoreCase("ios") && year <= checkYear) {
            System.out.println("Установите облегченную версию для IOS");
        } else if (os.equalsIgnoreCase("ios") && year > checkYear) {
            System.out.println("Установите приложение для IOS");
        } else if (os.equalsIgnoreCase("android") && year <= checkYear) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Установите приложение для Android");
        }
    }
    public static void task2() {
        System.out.println("задача 2");
        int currentYear = LocalDate.now().getYear();
        String osDevice = "android";
        printDeviceVersion(osDevice, currentYear);
    }

    public static int printDistanceInDay(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 21;
        int deliveryDay = printDistanceInDay(deliveryDistance);
        if (deliveryDay > 3) {
            System.out.println("Доставка свыше 100 км не действует");
        } else {
            System.out.println("Потребуется для доставки дней: " + deliveryDay);
        }
    }
}
