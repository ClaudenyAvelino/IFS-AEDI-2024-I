package Revisao.Exercicio.Vetor;

import java.util.Scanner;

public class Array {
   private static int[] vetor;

   public static void criarVetor(int tamanho){
      vetor = new int[tamanho];
      Scanner entrada = new Scanner(System.in);
      System.out.println("Insira os elementos do vetor:");
      for (int i = 0; i < tamanho; i++) {
         vetor[i] = entrada.nextInt();
      }
   }

   public static void somatorio(){
      int soma=0;
      for (int elemento :vetor) {
         soma+= elemento;
      }
      double media = (double) soma / vetor.length;
      System.out.println("Média dos elementos do vetor: " + media);
   }


}
