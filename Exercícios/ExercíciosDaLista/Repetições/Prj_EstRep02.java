/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Gustavo Geres
 * Calcule e mostre o quadrado dos números entre 10 e 150
 */
//import javax.swing.JOptionPane;
public class Prj_EstRep02 {
    public static void main(String[] args) {
        int num, quad;
        num = 10;
        while(num >= 10 && num <= 150){
            quad = num * num;
            System.out.println("O quadrado de "+num+" é "+quad);
            num++;
        }
    }
}
