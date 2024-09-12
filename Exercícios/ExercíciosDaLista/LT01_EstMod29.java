/**
 * 
 * @author Gustavo Jorge Geres
 * 
 * LT01_EstMod29
 * 
 * Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% 
 * e a renda fixa = 5%. Demais tipos não serão considerados   
 *       
 * 12/09/2024
 * 
 **/
import javax.swing.JOptionPane;
public class LT01_EstMod29 {
    static double rFix, pp, inv;
    static int t_inv;
    public static void main(String[] args) {
        inv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Investimento"));
        t_inv = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de Investimento"));
        CalcInvest();
    }

    static void CalcInvest(){
        if (t_inv > 0 && t_inv < 3) {
            if (t_inv == 1) {
                pp = inv + inv * 0.03;
                JOptionPane.showMessageDialog(null,"O valor corrigido é de R$ "+pp+"0");
            } else{
                rFix = inv + inv * 0.05;
                JOptionPane.showMessageDialog(null,"O valor corrigido é de R$ "+rFix+"0");
            }
        } else{
            JOptionPane.showMessageDialog(null,"Erro!! Tipo não considerado");
        }
    }
}
