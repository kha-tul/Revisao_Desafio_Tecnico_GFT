package revisao.desafiotecnico.gft.funcionarios;

public class Consultor extends Funcionarios { //implementa a super classe Funcionario

    //12º apos implementar a super classe, criamos os atributos da classe Consultor
    private double valorDaHora;
    private long horasTrabalhadas;
    //adiciona os atributos ao construtor abaixo:

    public Consultor(String nome, long cpf, double valorDaHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorDaHora = valorDaHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //13º implementamos a logica de calcularSalario do construtor:
    @Override
    public double calculaSalario() {
        return valorDaHora * horasTrabalhadas;
    }

    //14º inserimos getters e setters:

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //15º criar objetos na classe main
}
