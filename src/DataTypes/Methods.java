package DataTypes;

public class Methods {
    //  Без метода
    public static void main(String[] args) {
        System.out.print("Wi-");
        System.out.println("Fi");
        System.out.print("Wi-");
        System.out.println("Fi");
        System.out.println();
        System.out.print("Wi-");
        System.out.println("Fi");

        //С методом
        Hi();
        Hi();

//        printLines("Привет", 10);
//        printLines("Пока", 20);

        int[][] array = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
        fill (array, 8);
    }

    //С методом
    public static void Hi() {
        System.out.println("Hii");
        System.out.println("WORLD!");
        System.out.println("SANDUU");
        System.out.println();
    }

//    public static void printLines(String text, int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println(text);
//        }
//    }


        public static void fill(int[][] data, int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = value;
            }
        }
        }

    }

