package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Jogador j = new Jogador();

        //entrada de dados
        System.out.print("Nome do jogador:");
        j.nome = e.nextLine();

        for (int i = 0; i < j.score.length; i++) {
            System.out.print("Score "+(i+1)+ ":");
            j.score[i] = e.nextInt();
        }
        //saida de dados
        System.out.println();
        System.out.println("Nome: " + j.nome);
        System.out.println("Score total: "+j.calcularTotal());

    }
}
