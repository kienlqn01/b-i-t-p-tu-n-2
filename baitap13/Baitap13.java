/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap13;

/**
 *
 * @author Admin
 */
public class Baitap13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        public class Main {
//    public static void main(String[] args) {
        // Khởi tạo đối tượng với kiểu dữ liệu cụ thể là String
        GenericsType<String> a = new GenericsType<>();
        a.set("Pankajgưgsfwfefwswefw"); // Không cần ép kiểu

        // Truy xuất giá trị mà không cần ép kiểu
        String str = a.get(); // Không có ép kiểu, an toàn
        System.out.println(str);
    }
}

    
    

