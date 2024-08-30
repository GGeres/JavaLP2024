/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * Gustavo Geres
 * 22/08/2024
 * Receba um número inteiro. Calcule e mostre o seu fatorial
 * 
 */
import javax.swing.JOptionPane;
public class Prj_EstRep04 {
    public static void main(String[] args) {
        int x, F, fat;
        fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        F = 1;
        x = (fat - F);
        while(x > 1){
            fat = (fat * x);
            x--;
        }
        JOptionPane.showInternalMessageDialog(null,"O fatorial é: "+fat);
    }
}
