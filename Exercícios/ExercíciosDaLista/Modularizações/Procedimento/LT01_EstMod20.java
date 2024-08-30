/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod20
 * Receba 3 coeficientes A, B, e C de uma equação do 2º grau 
 * da fórmula AX²+BX+C=0. Verifique e mostre a existência 
 * de raízes reais e se caso exista, calcule e mostre. 
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstMod20 {
    static double a, b, c, x1,x2;
    public static void main(String[] args) {
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));
        OperSegGrau();
        
    }
    
    
    static void OperSegGrau(){
        double Dt;
        Dt = (b * b - 4 * a * c);
        if (Dt >= 0) {
            x1 = (((-b + Math.sqrt(Dt))/2 * a));
            x2 = (((-b - Math.sqrt(Dt))/2 * a));
            JOptionPane.showMessageDialog(null, "As raízes são "+x1+" e "+x2);
        } else{
            JOptionPane.showMessageDialog(null, "Raizes não reais");
        }
    }
}
