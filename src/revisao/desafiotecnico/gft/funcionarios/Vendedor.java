package revisao.desafiotecnico.gft.funcionarios;

public class Vendedor extends Funcionarios { //extende de Funcionario

    //8º implementa métodos da classe, clicando em cima do nome ^

    //9º cria atributos: comissao e numeroVendas.

    private double comissao;
    private long numeroVendas;

    //10º criar construtor para receber a comissão de vendas: alt + insert > construtor > seleciona os dois
    public Vendedor(String nome, long cpf, double comissao, long numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public Vendedor(String nome, long cpf) {
        super(nome, cpf);
    }

    // 12º calcularSalario: pegar da super classe com super.getSalarioMinimo + (comissao * numeroVendas)

    @Override
    public double calculaSalario() {
        return super.SALARIO_MINIMO + (this.comissao * this.numeroVendas);
    }

    //11º gerar getters e setters

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public long getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(long numeroVendas) {
        this.numeroVendas = numeroVendas;
    }


}
