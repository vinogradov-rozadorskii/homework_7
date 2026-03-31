import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        float [] arr1 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arr1));

        String [] shop = {"яблоки", "апельсины", "мандарины", "ананас"};
        System.out.println("В магазине есть " + Arrays.toString(shop));
        System.out.println("_________");

        System.out.println("Задача 2");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < shop.length; i++) {
            if (i == shop.length - 1) {
                System.out.print(shop[i]);
            } else {
                System.out.print(shop[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("_________");

        System.out.println("Задача 3");
        for (int i = arr.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        for (int i = arr1.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();

        for (int i = shop.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(shop[i]);
            } else {
                System.out.print(shop[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("_________");

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 !=0) {
                arr[i]= arr[i]+1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}