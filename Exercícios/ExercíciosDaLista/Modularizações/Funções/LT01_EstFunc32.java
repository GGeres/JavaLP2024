/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstFunc32
 * Receba um número inteiro. Calcule e mostre o seu fatorial.
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstFunc32 {
    public static void main(String[] args) {
        int fat;
        fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "O fatorial de "+fat+" é igual a "+FunctionFat(fat));
    }
    
    static int FunctionFat(int Fat){
        int x, F;
        F = 1;
        x = Fat - F;
        while (x > 1) {            
            Fat = Fat * x;
            x--;
        }
        return Fat;
    }
}
