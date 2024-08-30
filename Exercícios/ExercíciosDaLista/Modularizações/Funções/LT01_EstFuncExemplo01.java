/**
* Gustavo Jorge Geres
* 
* Exemplo de Função
* Calcula a Área do Triângulo 
* 29/08/2024
 *  
 */
import javax.swing.JOptionPane;
public class LT01_EstFuncExemplo01 {
    public static void main(String[] args) {
        int Base, Altura;
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da BASE"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da ALTURA"));
        JOptionPane.showMessageDialog(null, "A área é "+ FunctionArea(Base, Altura));
    }
    
    static int FunctionArea(int B, int A){
        int AR = 0;
        AR = (B * A) / 2;
        return AR;
    }
}
