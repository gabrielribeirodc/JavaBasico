import java.util.*;
public class Ex02
{
    public static void main()
    {
        Scanner leitor = new Scanner(System.in);
        Random Sorteador = new Random();
        
        System.out.printf("\nInforme a quantidade desejada de elementos: ");
        int quantidade = leitor.nextInt();
        
        if(quantidade < 1)
        {
            System.out.printf("\nQuantidade informada (%d) é inválida!\n");
            System.exit(0);
        }
        
        int []numeros = new int[quantidade];
        
        int i;
        int maior=0, menor=Integer.MAX_VALUE;
        float media = 0.0f;
        for(i=0; i<quantidade; i++)
        {
            numeros[i] = Sorteador.nextInt(quantidade*quantidade);
            if(numeros[i] > maior) { maior = numeros[i]; }
            if(numeros[i] < menor) { menor = numeros[i]; }
            media += numeros[i];            
            System.out.printf("numeros[%2d]: %3d\n", i, numeros[i]); 
        }
        
        System.out.printf("\nMaior valor: %d\nMenor valor: %d\nMedia: %2.2f\n", maior, menor, media/quantidade);

        System.out.printf("Quantidade de elementos no array: %d\n", listaNumeros);




    }
}
