package school.lesson2;

public class Main {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
    }

    public static void one() {
        System.out.println("Задание 1");
        int a = 5, b = 3;
        int c = a + b;
        if (c >= 10 && c <= 20) System.out.println("true");
        else System.out.println("false");
        System.out.println();
    }

    public static void two() {
        System.out.println("Задание 2");
        int n = 3;
        String str = "abc";
        for (int i = 0; i < n; i++)
            System.out.println(str);
        System.out.println();
    }
    public static void three() {
        System.out.println("Задание 3");
        int a = 5;
        if (a >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
        System.out.println();
    }
    public static boolean four() {
        System.out.println("Задание 4");
        int a = 5;
            if (a < 0) return true;
            else return false;
    }
    public static void five() {
        System.out.println("Задание 5");
        int year = 9;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println("не високосный");
        else System.out.println("високосный");
        System.out.println();
    }
    public static void six() {
        System.out.println("Задание 6");
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");}
        System.out.println("\n");
    }
    public static void seven() {
        System.out.println("Задание 7");
        int[] arr = new int[100];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter = counter + 1;
            System.out.print(counter + " ");
        }
        System.out.println("\n");
    }
    public static void eight() {
        System.out.println("Задание 8");
        int a = 6;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                arr[i] = arr[i]*2;
            } else if (arr[i] == 0) {
                arr[i] = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static void nine() {
        System.out.println("Задание 9");
        int n = 3;
        int [][] arr= new int [n][n];
        for (int i =0; i< arr.length; i++){
            for (int j=0; j<arr.length; n= arr[i].length, j++, n--){
                if (i==j|| i==n-j ){
                    arr[i][j]=1;
                    System.out.println("строка " + i + ", столбец " + j + " = число " + arr[i][j]);}
                else {
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void ten() {
        System.out.println("Задание 10");
        int len = 8;
        int initialValue = 5;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }
}

