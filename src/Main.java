import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int ios = 0;
        int Android = 1;
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int android = 1;
        int ios = 0;
        int clientDeviceYear = 2012;
        int operationSystem =0;
        if (operationSystem == ios && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientDeviceYear<2015 && operationSystem == ios){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (operationSystem == android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientDeviceYear<2015 && operationSystem == android){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
    int year = 2021;
    if ((year % 4 == 0 && year % 100 !=0|| year % 400==0)) {
        System.out.println("Не високосный");
    } else {
            System.out.println("Високосный");}
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 15;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("потребуется "+ deliveryTime + " день для доставки");
        }else if (deliveryDistance >20 && deliveryDistance <60){
            System.out.println("Потребуется " + (deliveryTime+1) + " дня для доставки");
        }else if (deliveryDistance >= 60 && deliveryDistance <=100) {
            System.out.println("Потребуется " + (deliveryTime + 2) + " дня для доставки");
        }else{
            System.out.println("Доставка не осуществляется:");
        }
    }public static void task5() {
        System.out.println("Задача 5");

    }

}


