/**
 * Gustavo Jorge Geres
 * LT01_EstCond27
 * 21/08/2024
 * 
 *Receba o número de voltas, a extensão do circuito (em metros) 
 e o tempo de duração (minutos). 
 Calcule e mostre a velocidade média em km/h.  
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstCond27 {
    public static void main(String[] args) {
        int n_voltas;
        double circ_ext, t_min, t_seg, v_mediaI, v_mediaF;
        n_voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas"));
        circ_ext = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito"));
        t_min = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do circuito em minutos"));
        if (n_voltas > 0 && circ_ext > 0 && t_min > 0) {
            t_seg = (t_min * 60);
            v_mediaI = (circ_ext * n_voltas / t_seg);
            v_mediaF = (v_mediaI * 3.6);

            JOptionPane.showMessageDialog(null,"A velocidade média no circuito foi de "+v_mediaF+" km/h.");
        } else{
            JOptionPane.showMessageDialog(null, "Dados insuficientes.");
        }
    }
}