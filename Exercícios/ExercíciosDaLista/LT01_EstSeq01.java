/**
 * LT01_EstSeq01
 */

 import javax.swing.JOptionPane;
public class LT01_EstSeq01 {
    public static void main(String[] args) {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área é de "+area+" m²");
    }
    
}