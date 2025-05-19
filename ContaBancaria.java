/**
 * Classe base que representa uma conta bancária.
 * Possui os atributos:
 * - cliente (String)
 * - numConta (int)
 * - saldo (float)
 *
 * Métodos:
 * - sacar: realiza um saque se houver saldo suficiente (não permite saldo negativo).
 * - depositar: adiciona valor ao saldo.
 * - exibirSaldo: exibe os dados da conta.
 */
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    // Construtor sem parâmetros
    public ContaBancaria() {}

    // Construtor com parâmetros
    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Getters e setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Realiza um saque da conta.
     * O saque só será efetuado se o valor solicitado for menor ou igual ao saldo atual.
     *
     * @param valor Valor a ser sacado.
     */
    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor + ".");
        }
    }

    /**
     * Deposita um valor na conta.
     *
     * @param valor Valor a ser depositado.
     */
    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    /**
     * Exibe os dados da conta.
     */
    public void exibirSaldo() {
        System.out.println("Cliente: " + cliente + " | Conta Nº: " + numConta + " | Saldo: R$" + saldo);
    }
}
