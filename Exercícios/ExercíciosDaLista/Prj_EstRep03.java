/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Gustavo Geres
 * Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7. 
 */
public class Prj_EstRep03 {
    public static void main(String[] args) {
        int dado1, dado2;
        dado1 = 1;
        dado2 = 6;
        int i = 1;
        while(i <= 6){
            if(dado1 + dado2 == 7){
                System.out.println(dado1+" + "+dado2+" = 7");
            }
            dado1++;
            dado2--;
            i++;
        }
    }
}
