import java.util.*;
public class Ex01
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
        for(i=0; i<quantidade; i++)
        {
            numeros[i] = Sorteador.nextInt(quantidade*quantidade);
            System.out.printf("numeros[%2d]: %3d\n", i, numeros[i]); 
        }
        
        
        
    }
}
