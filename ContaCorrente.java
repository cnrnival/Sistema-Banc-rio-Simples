/**
 * Classe que representa uma conta corrente.
 * Herdada de ContaBancaria, possui um atributo:
 * - limite (float): valor permitido para que o saldo fique negativo.
 *
 * Sobrescreve o método sacar para permitir saldo negativo até o limite.
 */
public class ContaCorrente extends ContaBancaria {
    private float limite; // Limite para o saldo ficar negativo

    // Construtor sem parâmetros
    public ContaCorrente() {
        super();
    }

    // Construtor com parâmetros
    public ContaCorrente(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    // Getter e setter para limite
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * Sobrescreve o método sacar para permitir que o saldo fique negativo
     * até o valor do limite.
     *
     * @param valor Valor a ser sacado.
     */
    @Override
    public void sacar(float valor) {
        if (getSaldo() - valor >= -limite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso (Conta Corrente).");
        } else {
            System.out.println("Limite excedido para saque de R$" + valor + ".");
        }
    }
}
