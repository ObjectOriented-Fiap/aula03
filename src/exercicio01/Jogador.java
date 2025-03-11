package exercicio01;

public class Jogador {
    //atributos ou variaveis de instancia
    String nome;
    int [] score = new int [3];

    //metodo para calcular e retornar o score total
    public int calcularTotal() {
        int total = 0;
        for (int i : score) {
            total += i;
        }
        return total;
    }
}
