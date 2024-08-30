/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Gustavo Geres
 * Receba o código correspondente ao cargo de um funcionário 
 * e seu salário atual e mostre o cargo, 
 * o valor do aumento e seu salário. 
 */
import javax.swing.JOptionPane;
public class Prj_EstRep01 {
    public static void main(String[] args) {
        int codigo;
        double salario, aumento = 0;
        String cargo;
        do{
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cargo: "));
            if (codigo != 9)
               {
                 salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual: "));
                 switch (codigo){
                 case 1: cargo = "Escriturário";
                    aumento = (salario * 0.50);
                    salario = (salario + aumento);
                    JOptionPane.showInternalMessageDialog(null, "O cargo "+cargo+" terá aumento de "+aumento+" reais e "
                            + "seu salário será de "+salario+" reais");
                    break;
                 case 2 : cargo = "Secretário";
                    aumento = (salario * 0.35);
                    salario = (salario + aumento);
                    JOptionPane.showInternalMessageDialog(null, "O cargo "+cargo+" terá aumento de "+aumento+" reais e "
                            + "seu salário será de "+salario+" reais");
                    break;
                 case 3: cargo = "Caixa";
                    aumento = (salario * 0.20);
                    salario = salario + aumento;
                    JOptionPane.showInternalMessageDialog(null, "O cargo "+cargo+" terá aumento de "+aumento+" reais e "
                            + "seu salário será de "+salario+" reais");
                    break;
                 case 4: cargo = "Gerente";
                    aumento = (salario * 0.10);
                    salario = salario + aumento;
                    JOptionPane.showInternalMessageDialog(null, "O cargo "+cargo+" terá aumento de "+aumento+" reais e "
                            + "seu salário será de "+salario+" reais");
                    break;
                 
                 default: JOptionPane.showInternalMessageDialog(null, "Não há cargo.");
               }
            } else{
                cargo = "O sistema está desligando";
                JOptionPane.showInternalMessageDialog(null, cargo);
            }
            
        }while(codigo != 9);
    }
}
