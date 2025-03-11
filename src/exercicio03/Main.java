package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner e = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.println("Informe as coordenadas x e y do ponto 1:");
        p1.x = e.nextInt();
        p1.y = e.nextInt();
        System.out.println();
        System.out.println("Informe as coordenadas x e y do ponto 2:");
        p2.x = e.nextInt();
        p2.y = e.nextInt();

        //impressao da distancia entre os dois pontos
        System.out.println();
        System.out.println("Distancia de p1 para p2: "+ formato.format(p1.calcularDistancia(p2)));
        System.out.println("Distancia de p2 para p1: "+ formato.format(p2.calcularDistancia(p1)));

        //impressao da distancia de cada ponto ate a origem
        System.out.println();
        System.out.println("Distancia do p1 ate a origem: "+ formato.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distancia do p2 ate a origem: "+ formato.format(p2.calcularDistanciaOrigem()));

        //impressao do ponto mais proximo da origem
        System.out.println();
        Ponto aux = p1.maisProximoDaOrigem(p1,p2);//repeticao, revisar proxima semana
        System.out.print("Ponto mais proximo da origem:");
        System.out.println(aux.formatarPonto());
    }
}
