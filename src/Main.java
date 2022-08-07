
public class Main {

	public static void main(String[] args) {
		Cliente amauri = new Cliente();
		amauri.setNome("Amauri");
		
		Conta cc = new ContaCorrente(amauri);
		cc.depositar(100);
		Conta poup = new ContaPoupanca(amauri);
		
		cc.transferir(80, poup);
		
		cc.imprimirExtrato();
		
		poup.imprimirExtrato();
		
	}

}
