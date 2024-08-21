/**
 * LT01_EstSeq12
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq12 {
    public static void main(String[] args) {
        int ano_n, ano_a, ida, idade2;
        ano_n = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        ano_a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        ida = ano_a - ano_n;
        idade2 = ida + 17;
        JOptionPane.showMessageDialog(null, "Sua idade atual é "+ida+" anos. Daqui 17 anos, sua idade será "+idade2+" anos.");
        
    }
}
