/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap13real;
 import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class Baitap13real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
//public class Main {
//    public static void main(String[] args) {
//        // Sử dụng ArrayList để lưu trữ các phần tử
        ArrayList<String> names;
        names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Duyệt qua ArrayList bằng Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("Duyệt qua ArrayList bằng Iterator:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Duyệt qua ArrayList theo kiểu thông thường (dùng chỉ số)
        System.out.println("\nDuyệt qua ArrayList theo kiểu chỉ số:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Phần tử thứ " + i + ": " + names.get(i));
        }

        // Sử dụng mảng cố định kích thước
        System.out.println("\nDuyệt qua mảng cố định kích thước:");
        String[] mangthuong = new String[3];
        mangthuong[0] = "Alice";
        mangthuong[1] = "Bob";
        mangthuong[2] = "Charlie";

        for (int i = 0; i < mangthuong.length; i++) {
            System.out.println("Phần tử thứ " + i + ": " + mangthuong[i]);
        }
    }
}

    
    

