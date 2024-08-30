/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstFunc31
 * Calcule e mostre o quadrado dos números entre 10 e 150.
 * 29/08/2024
 * 
 */
//import javax.swing.JOptionPane;
public class LT01_EstFunc31 {
    public static void main(String[] args) {
        int n = 10;
        FunctionQuad(n);
    }
    
    static int FunctionQuad(int N){
        int Q = 0;
        for (N = 10; N <= 150; N++) {
            Q = (N * N);
            System.out.println(N+" ao quadrado é igual a "+Q);
        }
        return Q;
    }
}
