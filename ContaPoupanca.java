/**
 * Classe que representa uma conta poupança.
 * Herdada de ContaBancaria, esta classe adiciona:
 * - taxaRendimento (double): percentual de rendimento.
 *
 * Método:
 * - calcularNovoSaldo: atualiza o saldo aplicando a taxa de rendimento.
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento; // Exemplo: 0.02 para 2%

    // Construtor sem parâmetros
    public ContaPoupanca() {
        super();
    }

    // Construtor com parâmetros
    public ContaPoupanca(String cliente, int numConta, float saldo, double taxaRendimento) {
        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Getter e setter para taxa de rendimento
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    /**
     * Calcula o novo saldo aplicando a taxa de rendimento.
     * Exemplo: novoSaldo = saldo + (saldo * taxaRendimento)
     */
    public void calcularNovoSaldo() {
        float novoSaldo = (float)(getSaldo() * (1 + taxaRendimento));
        setSaldo(novoSaldo);
        System.out.println("Novo saldo após rendimento: R$" + novoSaldo);
    }
}
