import java.util.Scanner;

public class Les3 {
    public static void main(String[] args) {
        System.out.println("�������� ��������� ��� ������ �������� ���� ���� �� ������ ������. Switch");
        zadacha11();
        System.out.println("�������� ��������� ��� ������ �������� ���� ���� �� ������ ������. if-else");
        zadacha12();
        System.out.println("������ ��� ���������� ����� t (����������� �� �����)");
        zadacha13();
        System.out.println("�� ���������� ������ ���������� ���� ������");
        zadacha14();
        System.out.println("��� ������ ����� for ������� �� ����� �������� ����� �� 1 �� 99.");
        zadacha21();
        System.out.println("���������� ������� �� ����� ����� �� 5 �� 1.");
        zadacha22();
        System.out.println("��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.");
        zadacha23();
        System.out.println("����������, ���� ��������� �������� �� ����� ��� ����� ������������������");
        zadacha24();
        System.out.println("������� 10 ������ ����� ������������������");
        zadacha25();
        System.out.println("��������� ���������, ��������� �� ����� �������� ����� �� 10 �� 20");
        zadacha26();
        System.out.println("������ �� ����� ������ 11 ������ ������������������ ���������.");
        zadacha31();
        System.out.println("�������� ���������, ������� ������� �� ������� ������� ���������");
        zadacha32();}


    //1. �������� ��������� ��� ������ �������� ���� ���� �� ������
//    ������.
//    ��� ������� ����������� �������� switch-case.
    public static void zadacha11() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 12:
                System.out.println("����");
                break;
            case 3, 4, 5:
                System.out.println("�����");
                break;
            case 6, 7, 8:
                System.out.println("����");
                break;
            case 9, 10, 11:
                System.out.println("�����");
                break;
            default:
                System.out.println("������� �������� �����, ������� ����� �� 1 �� 12");
        }
    }

    /*2. �������� ��������� ��� ������ �������� ���� ���� �� ������
        ������.
        ��� ������� ����������� �������� if-else-if.*/
    public static void zadacha12() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("����");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("�����");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("����");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("�����");
        } else {
            System.out.println("������� �������� �����, ������� ����� �� 1 �� 12");
        }
    }

    //3. ��� ���������� ����� t (����������� �� �����) �������
//    ���� t>�5, �� ������� ������.
//    ���� �5>= t > �20, �� ������� ����������.
//    ���� �20>= t, �� ������� ��������.
    public static void zadacha13() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > -5) {
            System.out.println("�����");
        } else if (number <= -5 && number > -20) {
            System.out.println("���������");
        } else if (number <= -20) {
            System.out.println("�������");
        }
    }

    //4. �� ���������� ������ ���������� ���� ������ (1 �
    //�������, 4 � ������� � �. �.).
    public static void zadacha14() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("�������");
                break;
            case 2:
                System.out.println("���������");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("�������");
                break;
            case 5:
                System.out.println("�������");
                break;
            case 6:
                System.out.println("�����");
                break;
            case 7:
                System.out.println("����������");
                break;
            default:
                System.out.println("������� ����� �� 1 �� 7");

        }
    }

    //1. ��� ������ ����� for ������� �� ����� �������� ����� �� 1 �� 99.
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

    //    ���������� ������� �� ����� ����� �� 5 �� 1.
//    ��� ������� ����������� �������� ���������� (--).
    public static void zadacha22() {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //3. �������� ���������, ��� ������������ ������ ����� �����
//    ������������� �����. � ��������� ��������� ��� ����� �� 1 ��
//    ���������� ������������� �����.
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

    //    4. ����������, ���� ��������� �������� �� ����� ��� �����
//    ������������������:
//            7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//    � ������� ����������� ���� while.
    public static void zadacha24() {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //5. ������� 10 ������ ����� ������������������ 0, -5,-10,-15..
    public static void zadacha25() {
        for (int i = 0; i < 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i * -1 + " ");
            }
        }
        System.out.println();
    }

    //    6. ��������� ���������, ��������� �� ����� �������� ����� �� 10 �� 20
//    ������������.
    public static void zadacha26() {
        for (int i = 10; i < 21; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    //  1. �������� �� ����� ������ 11 ������ ������������������ ���������.
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
//    2. �������� ���������, ������� ������� �� ������� ������� ���������
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
