/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap9;
        import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitap9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    //public static void main(String[] args) {
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();

        // Thêm một số sinh viên vào TreeMap
        danhSachSinhVien.themSinhVien("Nguyễn Văn A", 85);
        danhSachSinhVien.themSinhVien("Trần Thị B", 90);
        danhSachSinhVien.themSinhVien("Lê Văn C", 78);
        danhSachSinhVien.themSinhVien("Phạm Thị D", 92);

        // In ra danh sách sinh viên được sắp xếp theo tên
        danhSachSinhVien.inDanhSach();

        try ( // Tìm và in điểm số của một sinh viên cụ thể
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập tên sinh viên cần tìm điểm: ");
            String tenSinhVien = scanner.nextLine();
            Integer diem = danhSachSinhVien.timDiem(tenSinhVien);
            if (diem != null) {
                System.out.println("Điểm của sinh viên " + tenSinhVien + " là: " + diem);
            } else {
                System.out.println("Sinh viên không tồn tại trong danh sách.");
            }
            // Đóng scanner
        }
    }
}

    
    

