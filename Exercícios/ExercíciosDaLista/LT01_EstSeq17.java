/**
 * Gustavo Jorge Geres
 * LT01_EstSeq17
 * 21/08/2024
 * 
 *Calcule a quantidade de litros gastos em uma viagem, 
 sabendo que o automóvel faz 12 km/l. 
 Receber o tempo de percurso e a velocidade média. 
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq17 {
    public static void main(String[] args) {
        int d_km, q_lit, t_horas, v_media;
        t_horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas viajadas"));
        v_media = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média"));

        d_km = (t_horas * v_media);
        q_lit = (d_km / 12);
        JOptionPane.showMessageDialog(null,"A quantidade de litros gasta na viagem foi de "+ q_lit+" L");
    }
}
