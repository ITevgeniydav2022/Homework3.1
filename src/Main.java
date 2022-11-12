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
    }
}