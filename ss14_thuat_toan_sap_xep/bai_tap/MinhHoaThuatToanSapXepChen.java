package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter list size :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortStep(list);
    }
    public static void insertionSortStep(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                System.out.println("Gán value tại index " + pos + " = " + array[pos-1]);
                pos--;
            }
            array[pos] = x;
            System.out.println("Gán value tại index " + pos + " = " + x);
            System.out.print("List after the  " + i + "' sort: ");
            for (int k : array) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
