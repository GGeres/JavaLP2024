/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstFunc34
 * Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstFunc34 {
    public static void main(String[] args) {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        FunctTabuada(x);
    }
    
    static int FunctTabuada(int a){
        int y, T;
        y = 1;
        T = 1;
        while (T <= 10) {            
            y = a * T;
            System.out.println(a+" X "+T+" = "+y);
            T++;
        }
        return y;
    }
    
}
