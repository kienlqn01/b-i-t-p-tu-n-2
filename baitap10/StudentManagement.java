/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap10;

/**
 *
 * @author Admin
 */
import java.util.HashSet;

public class StudentManagement {
    // Tạo một HashSet để lưu trữ tên sinh viên
    private final HashSet<String> studentSet;

    // Constructor
    public StudentManagement() {
        studentSet = new HashSet<>();
    }

    // Phương thức thêm sinh viên
    public void addStudent(String name) {
        if (studentSet.add(name)) {
            System.out.println(name + " đã được thêm vào danh sách.");
        } else {
            System.out.println(name + " đã tồn tại trong danh sách.");
        }
    }

    // Phương thức in danh sách sinh viên
    public void printStudents() {
        System.out.println("Danh sách sinh viên duy nhất:");
        for (String student : studentSet) {
            System.out.println(student);
        }
    }

    // Phương thức kiểm tra xem sinh viên có trong danh sách hay không
    public boolean checkStudent(String name) {
        return studentSet.contains(name);
    }
}
