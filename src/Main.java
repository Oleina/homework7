import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum();
        checkPositivity();
        printString();
        printYear();
        getArray();
        getArray2();
        getArray3();
        getArray4();
        getArray5();


    }
    static void printThreeWords(){
        System.out.println("Orange, Banana, Apple");
    }
    static void checkSumSign(){
        int a = 1;
        int b = 2;
        if (a+b>=0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = 4;
        if (value<=0){
            System.out.println("Красный");
        } else if (0<value && value<101) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers(){
        int a = 1;
        int b = 2;
        if (a>=b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
    static void checkSum(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a+b>=10 && a+b<=20){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    static void checkPositivity(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }

    }
    static void printString(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.nextLine();
    while (a>0){
        a--;
        System.out.print(s + " ");
    }
    }
    static void printYear(){
        Scanner scanner = new Scanner(System.in);
        boolean longer = true;
        boolean regular = false;
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(longer);
        }else {
            System.out.println(regular);
        }
    }
    static void getArray(){
        int[] myArray = new int[4];
        myArray[0] = 0;
        myArray[1] = 1;
        myArray[2] = 1;
        myArray[3] = 0;
        myArray[4] = 1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]==0){
                myArray[i]=1;
            }else {
                myArray[i]=0;
            }
        }
        System.out.println(myArray);
    }
    static void getArray2(){
        int[] myArray2 = new int[99];
        int a = 0;
        while (a<100){
            myArray2[a]=a;
            a++;
        }
        System.out.println(myArray2);
    }
    static void getArray3(){
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<6){
                numbers[i]=numbers[i]*2;
            }
        }
        System.out.println(numbers);

    }
    static void getArray4(){
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void getArray5(){
        int len = 5;
        int initialValue = 10;
        int[] array = createArray(len, initialValue);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}
