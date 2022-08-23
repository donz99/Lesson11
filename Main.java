package Lesson11;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Денис Красько. Вариантт 2

    //задача1 заполняет, печатает массив, задание (3 функции)
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(11) -5;
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("Сумма элементов массива: " + sum);

    }

    static int  (int a) {
        int[] arr=new int[size];
        Random gen = new Random();
        return*/


    //задача2
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int proiz = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(25) -12;
            if (arr[i]<0) proiz = proiz*arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("Произведение отрицательных элементов массива: " + proiz);
    }*/

    //задача3
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int kolvo = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(21);
            System.out.print(arr[i] + " ");
            if (arr[i]%3==0 || arr[i]%5==0 || arr[i]%7==0) kolvo++;
        }
        System.out.println("Кол-во элементов массива которые делятся на 3 или на 5 или на 7: " + kolvo);
    }*/

    //задача4
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];
        Random gen = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(26);
            System.out.print(arr[i] + " ");
            if (arr[i]%2==1) sum=sum+arr[i];
        }
        System.out.println("Сумма элементов массива, которые являются нечётными числами: " + sum);
    }*/
    //заполнение случайными числами (если ничего не возвращаем то void)
    /*static int summOfArray (int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum=sum+mas[i];
        }
        System.out.println();
    }*/

    static void fillRandom(int[] mas, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt(right - left + 1) + left;
        }
    }

    static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    /*static int proiz (int[] mas) {
        int pr=1;
        for (int i = 0; i < mas.length; i++) {
            pr=pr*mas[i];
        }
    }*/

    static double arifmAvg (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];

        }
        return (double) sum / arr.length;
    }
    static int countLessK(int[] mas, int k){
        int qty = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]<k) qty++;
        }
        return qty;
    }

    static int numElem ( int[] mas, int k) {
        int res = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>k){
                res = i;
                break;
            }
        }
        return res;
    }
    static void printLessRight (int[] mas) {
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] < mas [i+1]){
                System.out.print(mas[i]+" ");
            }
        }
        System.out.println();
    }
    static int countLessRight (int[] mas) {
        int qty = 0;
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] < mas [i+1]){
                qty++
            }
        }
        return qty;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillRandom(arr, -10, 10);
        print(arr);
        Scanner in = new Scanner(System.in);

        //Дан массив из десяти ЦЕЛЫХ чисел. Найти их сумму
        //System.out.println("Сумма элементов массива " + summOfArray(arr));
        // Даны десять вещественных чисел. Найти их произведение.
        //System.out.println("Произведение: " + proiz(arr));
        //Даны десять вещественных чисел. Найти их среднее ар
        //System.out.println(arifmAvg(arr));
        //Series14 Дано целое число K и набор ненулевых целых чисел; признак его
        //завершения — число 0. Вывести количество чисел в наборе, меньших K.
        //System.out.print("Введите к ");
        //int k =  in.nextInt();
        //System.out.println("Кол-во элементов <k " + countLessK(arr, k));
        //15 Дано целое число K и набор ненулевых целых чисел; признак его
        //завершения — число 0. Вывести номер первого числа в наборе, большего K. Если таких чисел нет, то вывести -1
        /*System.out.print("Введите к ");
        int k =  in.nextInt();
        System.out.println("Номер первого элемента >k " + numElem(arr, k));*/
        //Series20. Дано целое число N (> 1) и набор из N целых чисел. Вывести те
        //элементы в наборе, которые меньше своего правого соседа, и количество K
        //таких элементов
        System.out.print("Введите к ");
        //int k =  in.nextInt();
        //System.out.println("Кол-во элементов <k " + countLessK(arr, k));


    }



}


