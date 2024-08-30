/**
 * LT01_EstSeq08
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq08 {
    public static void main(String[] args) {
        double valor_d, valor_n, jur;
        valor_d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado na Poupança:"));
        jur = (valor_d * 0.013);
        valor_n = (valor_d + jur);
        JOptionPane.showMessageDialog(null,"O valor da aplicação após 1 mês é: R$ "+valor_n);
    }
}