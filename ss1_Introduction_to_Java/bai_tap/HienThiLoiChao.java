package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
