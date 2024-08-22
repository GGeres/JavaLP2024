/**
 * Gustavo Jorge Geres
 * LT01_EstCond25
 * 21/08/2024
 * 
 *25.	Receba a hora de início e de final de um jogo (HH,MM), 
 calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo 
 é menor que 24 horas e pode começar num dia e terminar noutro.   
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstCond25 {
    public static void main(String[] args) {
        int h_Inicial, h_Final, m_Inicial, m_Final, h_Jogo, m_Jogo;

        h_Inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora que o jogo iniciou"));
        m_Inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto que o jogo iniciou"));
        h_Final = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora que o jogo terminou"));
        m_Final = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto que o jogo terminou"));
        if (h_Final >= h_Inicial) {
            h_Jogo = (h_Final - h_Inicial);            
        } else{
            h_Jogo = ((24 - h_Inicial) + h_Final);
        }
        if (m_Final >= m_Inicial){
            m_Jogo = (m_Final - m_Inicial);
        } else{
            m_Jogo = ((60 - m_Inicial) + m_Final);
            h_Jogo = (h_Jogo - 1);
        }
        JOptionPane.showMessageDialog(null, "A duração do jogo foi de "+ h_Jogo+" horas e "+ m_Jogo+" minutos.");
    }
}
