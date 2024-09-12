/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod27
 * Receba o número de voltas, a extensão do circuito (em metros) e o 
 * tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.    
 * 12/09/2024
 * 
 **/
import javax.swing.JOptionPane;
public class LT01_EstMod27 {
    static int n_voltas;
    static double circ_ext, t_min, t_seg, v_mediaI, v_mediaF;
    public static void main(String[] args) {
        n_voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas"));
        circ_ext = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito"));
        t_min = Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos"));
        CalcVMedia();
    }

    static void CalcVMedia(){
        if (n_voltas >  0 && circ_ext > 0 && t_min > 0) {
            t_seg = t_min * 60;
            v_mediaI = circ_ext * n_voltas / t_seg;
            v_mediaF = v_mediaI * 3.6;
            JOptionPane.showMessageDialog(null,"A velocidade média no circuíto foi de "+v_mediaF+" km/h.");
        } else{
            JOptionPane.showMessageDialog(null,"ERRO!! Digite valores válidos");
        }
    }
}
