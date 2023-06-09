
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca= new ContaPoupanca(joao);
		
		cc.depositar(100); 
		cc.transferir(80, poupanca);
		cc.pix(10, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}