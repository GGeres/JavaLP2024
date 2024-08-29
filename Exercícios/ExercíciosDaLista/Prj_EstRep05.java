/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Gustavo Geres
 * 22/08/2024
 * Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória 
 * dos números ímpares entre esses valores.
 * 
 */
import javax.swing.JOptionPane;
public class Prj_EstRep05 {
    public static void main(String[] args) {
        int x, y, B, L, i, d, imp;
        imp = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        if(x > y){
            B = x;
            L = y;
        } else{
            B = y;
            L = x;
        }
        i = L;
        while(i < B){
            d = (i % 2);
            if(d != 0){
                imp = (imp + i);
            }
            i++;
        }
        JOptionPane.showInternalMessageDialog(null, "A somatória dos números ímpares é igual a "+imp);
    }
}
