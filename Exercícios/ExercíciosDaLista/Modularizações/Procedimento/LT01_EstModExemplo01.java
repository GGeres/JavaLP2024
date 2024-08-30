/**
* Gustavo Jorge Geres
* 
* Exemplo de Modularização
* Calcula o Salário a Receber a partir do Salário Bruto e Desconto
* 29/08/2024
*
**/
import javax.swing.JOptionPane;
public class LT01_EstModExemplo01 {
    // Variáveis Globais aqui
    // Public / Static Double / Int var;
    static Double SalBruto, SalLiq;
    public static void main(String[] args) {
        SalBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto"));
        ProcedureSal();
        JOptionPane.showMessageDialog(null, "Salário Líquido: "+SalLiq);
    }
    
    // Modulo de Procedimento
    static void ProcedureSal(){
        Double Desconto;
        if(SalBruto < 500){
            Desconto = 0.0;
        } else if(SalBruto >= 500 && SalBruto < 800){
            Desconto = 0.05;
        } else if(SalBruto >= 800 && SalBruto < 1200){
            Desconto = 0.10;
        } else {
            Desconto = 0.15;
        }
        SalLiq = (SalBruto - (SalBruto * Desconto));
    }
}
