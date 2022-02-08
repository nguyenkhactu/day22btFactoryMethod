package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 để vẽ hình tròn");
        System.out.println("nhâp 2 để vẽ hình vuông");
        System.out.println("nhập 3 để vẽ hình chữ nhật");
        System.out.println("nhập lựa chọn");
        int sc = scanner.nextInt();
        Shape shape = ShapeFactory.getShape(sc);
        shape.draw();
    }
}
