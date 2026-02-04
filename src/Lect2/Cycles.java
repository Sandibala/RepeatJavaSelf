package Lect2;

public class Cycles {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 2; j++) {
//                System.out.println("i=" + i + ", j=" + j);
//            }
//        }
//
//        int[] array = new int[10];
//        array[0] = 1;
//        array[1] = 10;
//        System.out.println(array.length);
//
//        String[] name = new String[2];
//        name[0] = "GFhvjbknll";
//        System.out.println(name[0]);
//
//        int[] monthss = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//
//            for (int i = 0; i < months.length; i++) {
//                System.out.println(months[i] + " — " + monthss[i] + " дней");
//            }
        int[][] data = new int[3][5];
        data[0][2] = 5;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();

        }

        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
        matrix[1] = new int[]{1, 2, 3};
        matrix[2] = new int[]{1, 3, 7, 9};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    }
