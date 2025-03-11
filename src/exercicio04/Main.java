package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fMoeda = new DecimalFormat("0.00");
        Scanner e = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Nome:");
        f.nome = e.nextLine();
        System.out.print("Cargo:");
        f.cargo = e.next();
        System.out.println("Salário:");
        f.salario = e.nextDouble();



    }
}
