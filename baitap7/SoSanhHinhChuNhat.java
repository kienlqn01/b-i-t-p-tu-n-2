/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap7;

/**
 *
 * @author Admin
 */
//public class SoSanhHinhChuNhat {
    
// Lớp để so sánh HinhChuNhat
class SoSanhHinhChuNhat implements SoSanh<HinhChuNhat> {
    public int soSanh(HinhChuNhat h1, HinhChuNhat h2) {
        double dienTich1 = h1.dienTich();
        double dienTich2 = h2.dienTich();
        
        if (dienTich1 > dienTich2) {
            return 1;
        } else if (dienTich1 < dienTich2) {
            return -1;
        } else {
            return 0;
        }
    }
}

