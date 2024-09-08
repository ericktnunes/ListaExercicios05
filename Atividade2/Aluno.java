package ListaExercicios05.Atividade2;

import java.util.Scanner;

public class Aluno {
    private String matricula;
    private double nota;
    private String conceito;

    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public String getConceito() {
        if(this.nota >= 0 && this.nota <=4.9){
            this.conceito = "D";
        } else if(this.nota >= 5 && this.nota <=6.9){
            this.conceito = "C";
        } else if(this.nota >= 7 && this.nota <=8.9){
            this.conceito = "B";
        } else if(this.nota >= 9 && this.nota <=10){
            this.conceito = "A";
        }
        return conceito;
    }

    public void informarDados(){
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nota: " + getNota());
        System.out.println("Conceito: " + getConceito());
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Informe o número de matrícula do aluno:");
            String matricula = leitura.nextLine();

            System.out.println("Informe a nota do aluno:");
            double nota = leitura.nextDouble();

            // Limpar o buffer do leitura
            leitura.nextLine();

            Aluno aluno = new Aluno(matricula, nota);
            System.out.println("Aluno: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Conceito: " + aluno.getConceito());

            System.out.println("Deseja informar dados de outro aluno? (sim/não)");
            continuar = leitura.nextLine();
        } while (continuar.equalsIgnoreCase("sim"));


    }
}
