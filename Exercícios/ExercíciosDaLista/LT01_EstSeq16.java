/**
 * Gustavo Jorge Geres
 * LT01_EstSeq16
 * 
 * Receba a quantidade de horas trabalhadas, o valor por hora, 
 * o percentual de desconto e o número de descendentes. 
 * Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 * Calcule o salário líquido (= Salário Bruto – desconto). 
 * A cada dependente será acrescido R$ 100 no Salário Líquido. 
 * Exiba o salário a receber
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq16 {
    public static void main(String[] args) {
        int descen, p_descont, v_hora, hora, s_bruto;
        double s_liq;
        hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas"));
        v_hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pago por hora"));
        p_descont = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do percentual de desconto"));
        descen = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de descendentes"));

        s_bruto = (hora * v_hora);
        s_liq = (s_bruto - ((p_descont / 100) * s_bruto));
        s_liq = (s_liq + descen * 100);

        
        JOptionPane.showMessageDialog(null, "O salário líquido é de R$ "+s_liq);
    }
}
