/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

/**
 *
 * @author Admin
 */
// Lớp HoTro
public class HoTro {

    // Phương thức generic để in ra các phần tử của mảng
    public static <T> void inMang(T[] mang) {
        for (T phanTu : mang) {
            System.out.print(phanTu + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong mảng
    }

    // Phương thức main
    public static void main(String[] args) {
        // Tạo mảng số nguyên
        Integer[] mangSoNguyen = {1, 2, 3, 4, 5};
        System.out.print("Mảng số nguyên: ");
        inMang(mangSoNguyen); // In mảng số nguyên

        // Tạo mảng chuỗi
        String[] mangChuoi = {"Java", "C#", "Python"};
        System.out.print("Mảng chuỗi: ");
        inMang(mangChuoi); // In mảng chuỗi
    }
}
