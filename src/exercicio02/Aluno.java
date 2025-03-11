package exercicio02;

public class Aluno {
    //atributos
    String nome;
    int matricula;
    String [] disciplina = new String[3];
    double [] nota1 = new double[3];
    double [] nota2 = new double[3];
    double [] mediaNota = new double[3];

    //metodo para calcular e media
    public void calcularMedia () {
        for (int i = 0; i < disciplina.length; i++) {
            mediaNota[i] = (nota1[i] + nota2[i])/2;
        }
    }

    //metodo para retornar o status do aluno
    public String verificaStatus(int i) {
            if (mediaNota[i] < 6){
                return "Reprovado";
            }
        return "Aprovado";
    }
}

