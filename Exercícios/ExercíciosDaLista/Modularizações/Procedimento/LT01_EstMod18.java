/**
 * 
 * Gustavo Jorge Geres
 * LT01_EstMod18
 * 
 * Receba 2 valores inteiros. Calcule e mostre o resultado
 * da diferença do maior pelo menor valor
 * 
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstMod18 {
    static int x, y, z;
    public static void main(String[] args) {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        CalcMaiorMenor();
        JOptionPane.showMessageDialog(null, "A diferença do maior para o menor é igual a "+ z);
    }
    
    static void CalcMaiorMenor(){
        if (x >= y) {
            z = (x - y);
        } else{
            z = (y - x);
        }
    }
    
}
