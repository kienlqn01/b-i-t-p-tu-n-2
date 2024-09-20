/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap10;
        import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo đối tượng quản lý sinh viên
        StudentManagement studentManagement = new StudentManagement();

        // Thêm sinh viên vào danh sách
        studentManagement.addStudent("Nguyen Van A");
        studentManagement.addStudent("Tran Thi B");
        studentManagement.addStudent("Le Van C");
        studentManagement.addStudent("Nguyen Van A"); // Tên trùng lặp
        studentManagement.addStudent("Pham Thi D");

        // In danh sách sinh viên
        studentManagement.printStudents();

        try ( // Kiểm tra sinh viên cụ thể có trong danh sách không
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nNhập tên sinh viên cần kiểm tra: ");
            String nameToCheck = scanner.nextLine();
            
            if (studentManagement.checkStudent(nameToCheck)) {
                System.out.println(nameToCheck + " có trong danh sách.");
            } else {
                System.out.println(nameToCheck + " không có trong danh sách.");
            }
        }
    }
}