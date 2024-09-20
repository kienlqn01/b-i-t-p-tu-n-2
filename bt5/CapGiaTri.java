/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt5;

/**
 *
 * @author Admin
 */
public class CapGiaTri<T, U> {
    private T giaTri1;
    private U giaTri2;

    public T layGiaTri1() {
        return giaTri1;
    }

    public U layGiaTri2() {
        return giaTri2;
    }

    public void datGiaTri1(T giaTri1) {
        this.giaTri1 = giaTri1;
    }

    public void datGiaTri2(U giaTri2) {
        this.giaTri2 = giaTri2;
    }
}
