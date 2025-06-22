/********************************************************************
***        T R A B A L H A N D O   C O M    M A T R I Z E S       ***
*********************************************************************        
*** Prof. Filipo Mor - filipomor.com - github.com/ProfessorFilipo ***
*********************************************************************
*** Exercicio: popule uma matriz Linhas*Colunas com valores       ***
*** positivos aleatório (0 até Linhas*Colunas) e em seguida       ***
*** mostre:                                                       ***
***   a) o conteúdo da matriz                                     ***
***   b) media dos elementos da diagonal secundaria, se a matriz  ***
***      for quadrada (Linhas == Colunas)                         ***
***   c) media dos elementos impares                              ***
***   d) maior e menor valores pares                              ***
*********************************************************************/
import java.util.Random;
import java.util.Scanner;
public class Principal
{
    //
    // Mostra o conteúdo da matriz de caracteres na saída de console
    //
    public static void MostraMatriz(int[][] M, int Linhas, int Colunas)
    {
        for(int L=0; L<Linhas; L++)
        {
            for(int C=0; C<Colunas; C++)
            {
                System.out.printf(" %3d ", M[L][C]);    
            }
            System.out.printf("\n");
        }
    }


    public static void main(String[] args)
    {
        Random  rd           = new Random();
        Scanner leitor       = new Scanner(System.in);
        int     Linhas       = 0, 
                Colunas      = 0, 
                maiorPar     = 0, 
                menorPar     = 0,
                contImpares  = 0,
                contDiag     = 0;
        float   mediaImpares = 0.0f, 
                mediaDiagonalSecundario = 0.0f;
        
        System.out.printf("\n::: Informe a quantidade de Linhas: ");
        Linhas = leitor.nextInt();
        System.out.printf("\n::: Informe a quantidade de Colunas: ");
        Colunas = leitor.nextInt();        
        
        int[][] M = new int[Linhas][Colunas];
        menorPar = Linhas * Colunas; // atribui um valor "grande" a variavel.
        
        for(int L=0; L<Linhas; L++)
        {
            for(int C=0; C<Colunas; C++)
            {
                M[L][C] = rd.nextInt(Linhas*Colunas);
                if(M[L][C] % 2 != 0) // elemento é impar?
                { 
                    mediaImpares += M[L][C];
                    contImpares++;
                    //System.out.printf("Impares: M[%2d][%2d]: %2d\n", L, C, M[L][C]);
                }
                else
                {
                    if(M[L][C] > maiorPar) maiorPar = M[L][C]; 
                    if(M[L][C] < menorPar) menorPar = M[L][C];
                }
                
                //matriz quadrada? Elemento esta na diagonal secundaria?
                if((Linhas == Colunas) && (Colunas-1-L == C))
                {
                   //System.out.printf("Diagonal Secundaria: M[%2d][%2d]: %2d\n", L, C, M[L][C]);
                   mediaDiagonalSecundario += M[L][C];
                   contDiag++;
                }
                
            }
        }
        
        MostraMatriz(M, Linhas, Colunas);
        mediaImpares /= contImpares;
        if(Linhas == Colunas)
        {
             mediaDiagonalSecundario /= contDiag;    
             System.out.printf("\n::: Media dos elementos da diagonal secundaria: %3.2f\n", mediaDiagonalSecundario);
        }
        else System.out.printf("\n::: Matriz nao eh quadrada, portanto, nao eh possivel definir a diagonal secundaria\n");
        System.out.printf("::: Media dos elementos impares: %3.2f\n", mediaImpares);
        System.out.printf("::: Maior valor Par: %d\n::: Menor valor Par: %d\n", maiorPar, menorPar);
        
        
        
    }    
}
