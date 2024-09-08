package Atividade1;

public class Sindicato {
    private double totalArrecadado = 0;
    private int totalMestres = 0;


    public void adicionarProfessor(Professor professor) {
        totalArrecadado += professor.calcularContribuicao();
        if (professor.getTitulacao().equalsIgnoreCase("mestre")) {
            totalMestres++;
        }
    }


    public double getTotalArrecadado() {
        return totalArrecadado;
    }


    public int getTotalMestres() {
        return totalMestres;
    }
}
