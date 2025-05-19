/**
 * Classe principal que simula as operações em contas bancárias.
 * Cria instâncias de ContaPoupanca e ContaCorrente, realiza depósitos, saques,
 * aplica rendimento na conta poupança e exibe os dados das contas.
 */
public class Contas {
    public static void main(String[] args) {
        // Criação de uma conta poupança para o cliente
        ContaPoupanca cp = new ContaPoupanca("Maria Santos", 101, 1000.0f, 0.02);
        
        // Criação de uma conta corrente para o mesmo cliente
        ContaCorrente cc = new ContaCorrente("Maria Santos", 102, 500.0f, 300.0f);

        System.out.println("=== Dados Iniciais ===");
        cp.exibirSaldo();
        cc.exibirSaldo();

        // Operações de depósito e saque
        System.out.println("\nOperações:");
        cp.depositar(200.0f);
        cp.sacar(150.0f);
        
        cc.depositar(100.0f);
        cc.sacar(700.0f); // Exemplo: saldo corrente de 500 + 100 = 600, saque de 700 deixa o saldo em -100 (dentro do limite de 300)

        // Aplicar rendimento na conta poupança
        cp.calcularNovoSaldo();

        // Exibição dos dados atualizados
        System.out.println("\n=== Dados Atualizados ===");
        cp.exibirSaldo();
        cc.exibirSaldo();
    }
}
