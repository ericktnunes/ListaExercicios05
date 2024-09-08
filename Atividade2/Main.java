package ListaExercicios05.Atividade2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("1A", 10);
        Aluno aluno2 = new Aluno("1B", 7);
        Aluno aluno3 = new Aluno("1C", 6);
        Aluno aluno4 = new Aluno("1D", 4);

        aluno1.informarDados();
        System.out.println("*".repeat(15));
        aluno2.informarDados();
        System.out.println("*".repeat(15));
        aluno3.informarDados();
        System.out.println("*".repeat(15));
        aluno4.informarDados();
    }
}
