/********************************************************************
***        T R A B A L H A N D O   C O M    M A T R I Z E S       ***
*********************************************************************        
*** Porf. Filipo Mor - filipomor.com - github.com/ProfessorFilipo ***        
*********************************************************************/
public class Principal
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

        //
        // Liga dois pontos na mesma linha.
        //
        int Pl=1, Pc=1, Ql=1, Qc=5;
        M[Pl][Pc] = 'P';
        M[Ql][Qc] = 'Q';
        
        for(int col = Pc+1; col<Qc; col++)
        {
            M[Pl][col] = '#';
        }
        
        //
        // Liga dois pontos na mesma coluna.
        //
        int Al=2, Ac=3, Bl=7, Bc=3;
        M[Al][Ac] = 'A';
        M[Bl][Bc] = 'B';
        
        for(int lin=Al+1; lin<Bl; lin++)
        {
            M[lin][Ac] = '*';
        }
        
        //
        // Liga dois pontos em linhas e colunas distintas
        //
        int Ol=3, Oc=4, Dl=8, Dc=8;   // coordenadas do ponto de Origem e de Destino
        double Dist  = Modulo(Ol-Dl) 
                     + Modulo(Oc-Dc); // calcula  distancia geométrica entre os dois pontos.
        double DistY = Modulo(Oc-Dc); // calcula a distancia apenas no eixo Y
        double DistX = Modulo(Dl-Ol); // calcula a distancia apenas no eixo X
        double DeslY = DistY / Dist;  // calcula o deslocamento necessário no eixo Y a cada iteracao
        double DeslX = DistX / Dist;  // calcula o deslocamento necessário no eixo X a cada iteracao
        double PosY  = Ol;            // coordenada Y da posicao inicial
        double PosX  = Oc;            // coordenada X da posicao inicial
        for(int avanco=0; avanco<Dist; avanco++)
        {
            PosY += DeslY;
            PosX += DeslX;
            // informacoes para depuracao
            //System.out.printf("DeslY: %f ::: DeslX: %f\nPosY: %f ::: PosX: %f\n\n", DeslY, DeslX, PosY, PosX);
            M[(int)PosY][(int)PosX] = '+';
        }
        // garante que as marcacoes de ponto de origem e de destino nao foram sobrescritas
        M[Ol][Oc] = 'O';
        M[Dl][Dc] = 'D';
        
        // Mostra a matriz resultante no console
        MostraMatriz(M, Linhas, Colunas);
        
    }    
}
