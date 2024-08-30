/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod21
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média: - Feito
    a.	Se a média for >= 6,0 exibir “APROVADO”;
    b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c.	Se a média for < 3,0 exibir “RETIDO”.

 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstMod21 {
    static long n1, n2, n3, n4, mBim;
    public static void main(String[] args) {
        n1 = Long.parseLong(JOptionPane.showInputDialog("Digite a primeira nota"));
        n2 = Long.parseLong(JOptionPane.showInputDialog("Digite a segunda nota"));
        n3 = Long.parseLong(JOptionPane.showInputDialog("Digite a terceira nota"));
        n4 = Long.parseLong(JOptionPane.showInputDialog("Digite a quarta nota"));
        CalcMediaBim();
    }

    static void CalcMediaBim(){
        mBim = ((n1 + n2 + n3 + n4) / 4);
        if (mBim >= 6) {
            JOptionPane.showMessageDialog(null,"Aprovado! Sua nota: "+mBim);
        } else if (mBim >= 3) {
            JOptionPane.showMessageDialog(null,"Exame. Sua nota: "+mBim);
        } else{
            JOptionPane.showMessageDialog(null,"Retido. Sua nota: "+mBim);
        }
    }
}