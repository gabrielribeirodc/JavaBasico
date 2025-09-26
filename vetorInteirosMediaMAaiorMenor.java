import java.util.*;
public class Ex02
{
    public static void main()
    {
        Scanner leitor = new Scanner(System.in);
        Random Sorteador = new Random();
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        int quantidade;
        try{
            System.out.println("Digite quantos números deseja para a média:");
            quantidade = leitor.nextInt();
        } catch (Exception e){
            System.out.println("Valor inválido, tente novamente.");
            leitor.next();
        }

        int maior=0, menor=Integer.MAX_VALUE;
        float media = 0.0f;
        for(int i = 0; i<quantidade; i++)
        {
            listaNumeros.add(Sorteador.nextInt(quantidade*quantidade));
            if(listaNumeros.get(i) > maior) { maior = listaNumeros.get(i); }
            if(listaNumeros.get(i) < menor) { menor = listaNumeros.get(i); }
            media += listaNumeros.get(i);
            System.out.printf("numeros[%2d]: %3d\n", i, listaNumeros.get(i));
        }

        System.out.printf("\nMaior valor: %d\nMenor valor: %d\nMedia: %2.2f\n", maior, menor, media/quantidade);




    }
}

