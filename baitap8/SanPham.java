/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;
    import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class SanPham {


    private final HashMap<String, Double> danhSachSanPham;

    public SanPham() {
        danhSachSanPham = new HashMap<>();
    }

    public void themSanPham(String tenSanPham, double gia) {
        danhSachSanPham.put(tenSanPham, gia);
    }

    public void inDanhSach() {
        System.out.println("Danh sách sản phẩm và giá:");
        for (HashMap.Entry<String, Double> entry : danhSachSanPham.entrySet()) {
            System.out.println("Sản phẩm: " + entry.getKey() + ", Giá: " + entry.getValue() + " VNĐ");
        }
    }

    public Double timGia(String tenSanPham) {
        return danhSachSanPham.get(tenSanPham);
    }
}


