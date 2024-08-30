/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstFunc35
 * Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos 
 * números ímpares entre esses valores.  
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstFunc35 {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        JOptionPane.showMessageDialog(null, "A somatória dos números ímpares entre "+x+" e "+y+" é "+FunctionVerify(x,y));
    }
    
    static int FunctionVerify(int a, int b){
        int B, L, i, d, imp;
        if (a > b) {
            B = a;
            L = b;
        } else{
            B = b;
            L = a;
        }
        imp = 0;
        i = L;
        while (i < B) {            
            d = (i % 2);
            if (d != 0) {
                imp = (imp + i);
            }
            i++;
        }
        return imp;
    }
}
