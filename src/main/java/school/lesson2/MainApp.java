package school.lesson2;

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("метод printThreeWords()");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }
    public static void checkSumSign()
    {
        System.out.println("метод checkSumSign()");
        int a=1,b=5;
        int c= a + b;
        if (c>=0) {System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");}
        System.out.println();
    }
    public static void printColor()
    {
        System.out.println("метод printColor()");
        int value=101;
        if (value <=0) {System.out.println("Красный");}
        else if (value<=100) {System.out.println("Желтый");}
        else {System.out.println("Зеленый");}
        System.out.println();
    }
    public static void  compareNumbers()
    {
        System.out.println("метод compareNumbers()");
        int a=5,b=3;
        if (a>=b) {System.out.println("a >= b");}
        else {System.out.println("a < b");}
        System.out.println();
    }
}
