/**
 * 
 * @author Gustavo Jorge Geres
 * 
 * LT01_EstFunc38
 * 
 * Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
 * Obs.: somente valores positivos.  
 * 
 * 12/09/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstFunc38 {
    public static void main(String[] args) {
        int i;
        i = 0;
        JOptionPane.showMessageDialog(null,FunctBigLow(i));
    }

    static String FunctBigLow(int a){
        int x, b, l;
        String res;
        b = 0;
        l = 100000000;
        while (a < 5) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (x >= 0) {
                if (x > b) {
                    b = x;
                }
                if (x < l) {
                    l = x;
                }
                a++;
            }
        }
        res =("O maior valor é "+b+" e o menor é "+l);
        return res;
        
    }
}
