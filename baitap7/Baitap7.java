/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap7;
    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Admin
 */
public class Baitap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



// TODO code application logic here
        // Interface generic SoSanh
        // Phương thức main
//
//    public static void main(String[] args) {
        List<HinhChuNhat> danhSachHinh = new ArrayList<>();
        danhSachHinh.add(new HinhChuNhat(4, 5)); // Diện tích = 20
        danhSachHinh.add(new HinhChuNhat(3, 7)); // Diện tích = 21
        danhSachHinh.add(new HinhChuNhat(2, 8)); // Diện tích = 16

        // Sắp xếp danh sách hình chữ nhật theo diện tích
        Collections.sort(danhSachHinh, new Comparator<HinhChuNhat>() {
            SoSanhHinhChuNhat sosanh = new SoSanhHinhChuNhat();

            @Override
            public int compare(HinhChuNhat h1, HinhChuNhat h2) {
                return sosanh.soSanh(h1, h2);
            }
        });

        // In danh sách hình chữ nhật đã sắp xếp
        System.out.println("Danh sách hình chữ nhật theo diện tích tăng dần:");
        for (HinhChuNhat hinh : danhSachHinh) {
            System.out.println(hinh);
        }
    } 
}
