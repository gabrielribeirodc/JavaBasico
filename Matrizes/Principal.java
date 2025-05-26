public class Principal
{
    public static void main(String[] args) 
    {
        // Criação de uma matriz de 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores
        inicializarMatriz(matriz);

        // Exibindo a matriz
        exibirMatriz(matriz);

        // Calculando a soma dos elementos da matriz
        int soma = somarElementos(matriz);
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }

    // Método para inicializar a matriz com valores
    public static void inicializarMatriz(int[][] matriz) 
    {
        int valor = 1;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = valor;
                valor++;
            }
        }
    }

    // Método para exibir a matriz no console
    public static void exibirMatriz(int[][] matriz) 
    {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    // Método para somar todos os elementos da matriz
    public static int somarElementos(int[][] matriz) 
    {
        int soma = 0;
        for (int[] linha : matriz) // for each: atribui a linha inteira (um vetor de inteiro) para 'linha' a cada iteracao
        {
            for (int elemento : linha) 
            {
                soma += elemento;
            }
        }
        return soma;
    }    
}
