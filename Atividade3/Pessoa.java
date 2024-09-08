package Atividade3;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private Calendar dataDeNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int anoNascimento = dataDeNascimento.get(Calendar.YEAR);
        int mesNascimento = dataDeNascimento.get(Calendar.MONTH);
        int diaNascimento = dataDeNascimento.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }

    public void imprimirDadosDaPessoa() {
        System.out.println("O nome da pessoa é: " + getNome());
        System.out.println("A data de nascimento do(a) " + getNome() + " é: "
                + dataDeNascimento.get(Calendar.DAY_OF_MONTH) + "/"
                + (dataDeNascimento.get(Calendar.MONTH) + 1) + "/"
                + dataDeNascimento.get(Calendar.YEAR));
        System.out.println("A altura do(a) " + getNome() + " é: " + getAltura());
        System.out.println("A idade do(a) "+ getNome() + " é: " + calcularIdade() + " anos");
    }


    public static void main(String[] args) {
        Calendar dataDeNascimento = Calendar.getInstance();
        dataDeNascimento.set(2000, Calendar.MAY, 20);

        Pessoa jorge = new Pessoa();
        jorge.setNome("Jorge");
        jorge.setDataDeNascimento(dataDeNascimento);
        jorge.setAltura(1.95);


        jorge.imprimirDadosDaPessoa();
    }
}