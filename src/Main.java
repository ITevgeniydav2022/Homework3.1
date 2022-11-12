public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS <= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2020;
        int clientOS1 = 0;
        if (clientOS1 <= 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 <= 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения, для iOS по ссылке");
        }
        if (clientOS1 > 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 > 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения, для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год вискосный");
        } else {
            System.out.println("Год не високосный");
        }

    }
}