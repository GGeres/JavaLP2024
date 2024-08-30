/**
 * LT01_EstSeq02
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq02 {
    public static void main(String[] args) {
        double sal, n_sal;
        sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
        n_sal = (sal + (sal*0.15));
        JOptionPane.showMessageDialog(null,"O valor do salário após o reajuste é de R$"+n_sal);
    }
}
