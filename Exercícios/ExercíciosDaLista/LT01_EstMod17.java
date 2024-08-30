/**
 * 
 * Gustavo Jorge Geres
 * LT01_EstMod17
 * 
 * Calcule a quantidade de litros gastos em uma viagem, 
 * sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso 
 * e a velocidade média.
 * 
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstMod17 {
    static int tHoras, vMedia, qLit;
    public static void main(String[] args) {
        tHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da viagem"));
        vMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade Média"));
        CalcLitros();
        JOptionPane.showMessageDialog(null, "A quantidade de litros foi de "+qLit);
    }
    
    static void CalcLitros(){
        int dKm;
        dKm = (tHoras * vMedia);
        qLit = (dKm / 12);
    }
}
