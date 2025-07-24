//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        int clientDeviceYear = 2018;
        int baseDeviceYear = 2015;
        if ((clientDeviceYear >= baseDeviceYear) && (clientOS == 0)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientDeviceYear >= baseDeviceYear) && (clientOS == 1)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((clientDeviceYear < baseDeviceYear) && (clientOS == 0)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((clientDeviceYear < baseDeviceYear) && (clientOS == 1)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //task3
        int year = 1504;
        int yearBeginLeap = 1584;
        boolean isYearBegin = year >= yearBeginLeap;     // год больше 1584
        boolean isEveryFourYear = year % 4 == 0;         // год кратный 4 високосный
        boolean isEveryOneHundredYear = year % 100 != 0; // год не кратный 100
        boolean isEveryFourHundredYear = year % 400 == 0; // год кратный 400 високосные

        if (isYearBegin && (isEveryFourYear && isEveryOneHundredYear) || isEveryFourHundredYear) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }

        //task4
        int timeDelivery = 0;
        int distance = 80;
        if (distance <= 20) {
            timeDelivery = 1;
        } else if (distance > 20 && distance < 60) {
            timeDelivery = 2;
        } else if (distance >= 60 && distance <= 100) {
            timeDelivery = 3;
        } else {
            timeDelivery = 0;
        }
        if (timeDelivery == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + timeDelivery);
        }

        //task5
        int monthNumber = 12;

        if (monthNumber >= 1 || monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Месяц январь относится к зиме");
                    break;
                case 2:
                    System.out.println("Месяц февраль относится к зиме");
                    break;
                case 3:
                    System.out.println("Месяц март относится к весне");
                    break;
                case 4:
                    System.out.println("Месяц апрель относится к весне");
                    break;
                case 5:
                    System.out.println("Месяц май относится к весне");
                    break;
                case 6:
                    System.out.println("Месяц июнь относится к лету");
                    break;
                case 7:
                    System.out.println("Месяц июль относится к лету");
                    break;
                case 8:
                    System.out.println("Месяц август относится к лету");
                    break;
                case 9:
                    System.out.println("Месяц сентябрь относится к осени");
                    break;
                case 10:
                    System.out.println("Месяц октябрь относится к осени");
                    break;
                case 11:
                    System.out.println("Месяц ноябрь относится к осени");
                    break;
                case 12:
                    System.out.println("Месяц декабрь относится к зиме");
                    break;
                default:
                    System.out.println("Месяц не определен");
                    break;
            }
        } else {
            System.out.println("Месяц не определен, введите номер месяца от 1 до 12");
        }

    }
}
