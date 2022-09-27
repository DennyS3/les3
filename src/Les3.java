import java.util.Scanner;

public class Les3 {
    public static void main(String[] args) {
        System.out.println("Написать программу для вывода названия поры года по номеру месяца. Switch");
        zadacha11();
        System.out.println("Написать программу для вывода названия поры года по номеру месяца. if-else");
        zadacha12();
        System.out.println("задача для введенного числа t (температура на улице)");
        zadacha13();
        System.out.println("По введенному номеру определить цвет радуги");
        zadacha14();
        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        zadacha21();
        System.out.println("Необходимо вывести на экран числа от 5 до 1.");
        zadacha22();
        System.out.println("программа суммирует все числа от 1 до введенного пользователем числа.");
        zadacha23();
        System.out.println("Необходимо, чтоб программа выводила на экран вот такую последовательность");
        zadacha24();
        System.out.println("Вывести 10 первых чисел последовательности");
        zadacha25();
        System.out.println("Составьте программу, выводящую на экран квадраты чисел от 10 до 20");
        zadacha26();
        System.out.println("ведите на экран первые 11 членов последовательности Фибоначчи.");
        zadacha31();
        System.out.println("Напишите программу, которая выводит на консоль таблицу умножения");
        zadacha32();}


    //1. Написать программу для вывода названия поры года по номеру
//    месяца.
//    При решении используйте оператор switch-case.
    public static void zadacha11() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("введено неверное число, введите число от 1 до 12");
        }
    }

    /*2. Написать программу для вывода названия поры года по номеру
        месяца.
        При решении используйте оператор if-else-if.*/
    public static void zadacha12() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Зима");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Весна");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Лето");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("введено неверное число, введите число от 1 до 12");
        }
    }

    //3. Для введенного числа t (температура на улице) вывести
//    Если t>–5, то вывести «Тепло».
//    Если –5>= t > –20, то вывести «Нормально».
//    Если –20>= t, то вывести «Холодно».
    public static void zadacha13() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > -5) {
            System.out.println("тепло");
        } else if (number <= -5 && number > -20) {
            System.out.println("Нормально");
        } else if (number <= -20) {
            System.out.println("холодно");
        }
    }

    //4. По введенному номеру определить цвет радуги (1 –
    //красный, 4 – зеленый и т. д.).
    public static void zadacha14() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Введите число от 1 до 7");

        }
    }

    //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void zadacha21() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //    Необходимо вывести на экран числа от 5 до 1.
//    При решении используйте операцию декремента (--).
    public static void zadacha22() {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //3. Напишите программу, где пользователь вводит любое целое
//    положительное число. А программа суммирует все числа от 1 до
//    введенного пользователем числа.
    public static void zadacha23() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.print(sum + " ");
        System.out.println();
    }

    //    4. Необходимо, чтоб программа выводила на экран вот такую
//    последовательность:
//            7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//    В решении используйте цикл while.
    public static void zadacha24() {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void zadacha25() {
        for (int i = 0; i < 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i * -1 + " ");
            }
        }
        System.out.println();
    }

    //    6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20
//    включительно.
    public static void zadacha26() {
        for (int i = 10; i < 21; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    //  1. Выведите на экран первые 11 членов последовательности Фибоначчи.
    public static void zadacha31() {
        int[] num = new int[11];
        for (int q = 0; q < num.length; q++) {
            if (q > 2) {
                num[q] = num[q - 1] + num[q - 2];
            } else {
                num[q] = q;
            }
            System.out.print(num[q] + " ");
        }
        System.out.println();
    }
//    2. Напишите программу, которая выводит на консоль таблицу умножения
    public static void zadacha32(){
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
