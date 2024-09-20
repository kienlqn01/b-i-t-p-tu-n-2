/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap8;
        import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//    public static void main(String[] args) {
        SanPham sanPham = new SanPham();

        // Thêm một số sản phẩm vào HashMap
        sanPham.themSanPham("Laptop", 1500.00);
        sanPham.themSanPham("Điện thoại", 800.00);
        sanPham.themSanPham("Máy tính bảng", 400.00);
        sanPham.themSanPham("Tai nghe", 50.00);

        // In ra danh sách tất cả sản phẩm và giá tương ứng
        sanPham.inDanhSach();

        try ( // Tìm và in giá của một sản phẩm cụ thể
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập tên sản phẩm cần tìm giá: ");
            String tenSanPham = scanner.nextLine();
            Double gia = sanPham.timGia(tenSanPham);
            if (gia != null) {
                System.out.println("Giá của sản phẩm " + tenSanPham + " là: " + gia + " VNĐ");
            } else {
                System.out.println("Sản phẩm không tồn tại trong danh sách.");
            }
            // Đóng scanner
        }
    }
}

    
    

