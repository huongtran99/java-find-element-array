package com.codegym;

import java.util.Scanner;

public class Main {

    public static boolean isSearch(String input_name, String[] students) {
        for (String list : students) {
            if (list.equals(input_name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên 1 sinh viên:");
        String input_name = scanner.nextLine();

        if(isSearch(input_name, students)){
            System.out.println(input_name);
        } else {
            System.out.println("Không tìm thấy !!");
        }


    }
}
