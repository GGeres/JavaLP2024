/**
 * Gustavo Jorge Geres
 * LT01_EstCond31
 * 22/08/2024
 * 
 * Calcule e mostre o quadrado dos números entre 10 e 150   
 * 
 */
//import javax.swing.JOptionPane;
public class LT01_EstRep31 {
    public static void main(String[] args) {
        int x, quad;
        x = 10;
        while (x >= 0 && x <= 150) {
            quad = x * x;
            System.out.println("O quadrado de "+x+" é igual a "+quad);
            //JOptionPane.showMessageDialog(null, "O quadrado de "+x+" é igual a "+quad);
            x++;
        }
    }
}