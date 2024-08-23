/**
 * Gustavo Jorge Geres
 * LT01_EstCond32
 * 22/08/2024
 * 
 * Receba um número inteiro. Calcule e mostre o seu fatorial.   
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstRep32 {
    public static void main(String[] args) {
        int x, F, fat;
        fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        F = 1;
        x = (fat - F);
        while (x > 1) {
            fat = (fat * x);
            x--;
        }
        JOptionPane.showMessageDialog(null, "O fatorial é igual a "+fat);

    }
}
