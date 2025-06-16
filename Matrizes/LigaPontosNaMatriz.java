/********************************************************************
***        T R A B A L H A N D O   C O M    M A T R I Z E S       ***
*********************************************************************        
***           ligando pontos aleatórios dentro da matriz          ***
*********************************************************************        
*** Porf. Filipo Mor - filipomor.com - github.com/ProfessorFilipo ***        
*********************************************************************/
import java.util.Random;
public class Main
{
    //
    // Mostra o conteúdo da matriz de caracteres na saída de console
    //
    public static void MostraMatriz(char[][] M, int linhas, int colunas)
    {
        for(int L=0; L<linhas; L++)
        {
            for(int C=0; C<colunas; C++)
            {
                System.out.printf(" %c ", M[L][C]);
            }
            System.out.printf("\n");
        }
    }
    
    //
    // Retorna o valor absoluto (sem sinal) do número informado.
    //
    public static double Modulo(int valor)
    {
        return Math.sqrt(valor * valor);
    }
    
    public static void main(String[] args)
    {
        int Linhas  = 10; // altura da matriz
        int Colunas = 10; // largura da matriz
        char[][] M = new char[Linhas][Colunas];
        
        // popula a matriz com pontos
        for(int L=0; L<Linhas; L++)
        {
            for(int C=0; C<Colunas; C++)
            {
                M[L][C] = '.';
            }
        }

        Random rd = new Random();

        // sorteia o ponto de Origem
        int POx = rd.nextInt(Colunas);
        int POy = rd.nextInt(Linhas);
        
        // sorteia o ponto de Destino
        int PDx = rd.nextInt(Colunas);
        int PDy = rd.nextInt(Linhas);        

        // calcula as distancias por eixo e manhattan
        double DistY = Modulo(POy - PDy);
        double DistX = Modulo(POx - PDx);
        double Dist = DistX + DistY;
        double DeslY = DistY / Dist;  // calcula o deslocamento necessário no eixo Y a cada iteracao
        double DeslX = DistX / Dist;  // calcula o deslocamento necessário no eixo X a cada iteracao
        
        // coordenadas a serem utilizadas como ponto de partida
        double PosY = POy; 
        double PosX = POx;

        for(int avanco=0; avanco<Dist; avanco++)
        {
            // informacoes para depuracao
            //System.out.printf("DeslY: %f ::: DeslX: %f\nPosY: %f ::: PosX: %f\n\n", DeslY, DeslX, PosY, PosX);
            M[(int)PosY][(int)PosX] = '+';
            
            //
            // decide por incrementar ou decrementar os deslocamentos,
            // dependendo das posicoes relativas dos pontos de Origem
            // e de Destino. Para colunas iguais ou linhas iguais, 
            // o deslocamento será de zero na coordenada.
            //
            if(PDy > POy) // linha de destino esta abaixo da de origem?
            {
                PosY += DeslY;    
            } else if(PDy < POy) // linha de destino esta acima da de origem?
            {
                PosY -= DeslY;    
            }

            if(PDx > POx) // coluna de destino esta a direita da de origem?
            {
                PosX += DeslX;    
            } else if(PDx < POx) // coluna de destino esta a esquerda da de origem?
            {
                PosX -= DeslX;    
            }            

        }
        
        // marca os pontos de Origem e Destino
        M[POy][POx] = 'O';
        M[PDy][PDx] = 'D';
        
        // Mostra a matriz resultante no console
        MostraMatriz(M, Linhas, Colunas);
        
    }    
}
