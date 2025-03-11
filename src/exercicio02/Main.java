package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Aluno a = new Aluno();

        //entrada de dados
        System.out.print("Nome:");
        a.nome = e.nextLine();
        System.out.print("Matrícula:");
        a.matricula = e.nextInt();
        for (int i = 0; i < a.disciplina.length; i++) {
            System.out.print("Disciplina:");
            a.disciplina[i] = e.next();
            System.out.print("Nota 1:");
            a.nota1[i] = e.nextDouble();
            System.out.print("Nota 2:");
            a.nota2[i] = e.nextDouble();
        }

    a.calcularMedia();

        //saida de dados
        System.out.println();
        System.out.println("Nome: "+ a.nome);
        System.out.println("Matricula: "+ a.matricula);
        for (int i = 0; i < a.disciplina.length; i++) {
            System.out.println("Disciplina: "+ a.disciplina[i]);
            System.out.println("Media: "+ a.mediaNota[i]+" Status: "+ a.verificaStatus(i));
        }

    e.close();
    }
}
