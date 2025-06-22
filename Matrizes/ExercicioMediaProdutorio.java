/********************************************************************
***        T R A B A L H A N D O   C O M    M A T R I Z E S       ***
*********************************************************************        
*** Prof. Filipo Mor - filipomor.com - github.com/ProfessorFilipo ***
*********************************************************************
*** Exercicio: popule uma matriz N*N com valores inteiros         ***
*** negativos aleatório (-N*N ate 0) e em seguida mostre:         ***
***   a) o conteúdo da matriz, incluindo os indices das linhas e  ***
***      colunas;                                                 ***
***  b) inverta o sinal dos valores maior que a média dos         ***
***     elementos da matriz                                       ***
***  c) calcule e mostro o produtorio dos elementos com valor     ***
***     menor que a média dos valores dos elementos da matriz     ***
*********************************************************************/
import java.util.Random;
public class Principal
{
    //
    // Mostra o conteúdo da matriz de caracteres na saída de console
    //
    public static void MostraMatriz(int[][] M, int N)
    {
        System.out.printf("       ");
        for(int C=0; C<N; C++)
        {
            System.out.printf("%2d:   ", C);
        }
        System.out.printf("\n");
        for(int L=0; L<N; L++)
        {
            System.out.printf(" %2d: ", L); // indice da linha
            for(int C=0; C<N; C++)
            {
                if(M[L][C] < 0)
                {
                     // mostra os valores negativos entre ()
                     System.out.printf(" (%2d) ", M[L][C]*-1);    
                }
                else System.out.printf(" %3d ", M[L][C]);
            }
            System.out.printf("\n");
        }
    }


    public static void main(String[] args)
    {

        int N = 10;
        int[][] M = new int[N][N];
        Random rd = new Random();
        float media = 0.0f;
        double produtorio = 1.0f; // deve ser 1. Precisa ser double?
        
        // popula matriz com valores aleatórios menores que zero
        // e os acumula para em seguida calcular a média.
        for(int L=0; L<N; L++)
        {
            for(int C=0; C<N; C++)
            {
                M[L][C] = rd.nextInt(N*N) * -1;
                media += M[L][C]; // acumulador
            }
        }
        media /= (N*N); // finalmente, calcula a média
        
        
        MostraMatriz(M, N);
        System.out.printf("\n Media: %3.2f\n", media);
        
        for(int L=0; L<N; L++)
        {
            for(int C=0; C<N; C++)
            {
                // se valor do elemento é maior que a média, inverte seu sinal.
                if(M[L][C] > media) 
                {
                    M[L][C] *= -1;
                }
                
                // se o valor do elemento é menor que a média, inclui no cálculo do produtorio
                if(M[L][C] < media) 
                {
                    produtorio *= M[L][C];
                    //System.out.printf("\n Media: %3.2f\n M[%2d][%2d]: %3d ::: produtorio: %3.3f\n", media, L, C, M[L][C], produtorio );
                }
            }
        }

        MostraMatriz(M, N);
        System.out.printf("\n:::: Media: %3.2f\n:::: Produtorio: %3.2f\n", media, produtorio);
        

    }    
}
