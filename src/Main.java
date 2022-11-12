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
        int year = 2024;
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год является вискосным");
        } else {
            System.out.println("Год не является високосным");
        }
        // Задание 4
        System.out.println("Задание 4");
        byte deliveryDistance = 95;
        byte day1 = 1;
        byte days2 = 2;
        byte days3 = 3;
        if(deliveryDistance < 20) {
            System.out.println(" Потребуется дней " + day1);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println(" Потребуется дней " + days2);
        }
        if(deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется дней " + days3);
        }
        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 6;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}