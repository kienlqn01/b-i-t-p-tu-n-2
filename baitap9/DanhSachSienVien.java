/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap9;
    import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class DanhSachSienVien {

public class DanhSachSinhVien {
    private final TreeMap<String, Integer> danhSach;

    public DanhSachSinhVien() {
        danhSach = new TreeMap<>();
    }

    public void themSinhVien(String tenSinhVien, int diem) {
        danhSach.put(tenSinhVien, diem);
    }

    public void inDanhSach() {
        System.out.println("Danh sách sinh viên và điểm số:");
        for (String ten : danhSach.keySet()) {
            System.out.println("Sinh viên: " + ten + ", Điểm: " + danhSach.get(ten));
        }
    }

    public Integer timDiem(String tenSinhVien) {
        return danhSach.get(tenSinhVien);
    }
}

}
