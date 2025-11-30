
public class Conta {
	int numero;
	String titular;
	float saldo;
	float limite;
	
	Conta (int numero, String titular, float saldo, float limite){
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
		
		boolean sacar(double valor) {
			if  (valor > limite || valor > saldo || valor <= 0) {
				return false;
			}
			saldo -= valor;
			return true;
			
	}
		boolean depositar(double valor) {
			if(valor <= 0) {
				return false;
			}
			saldo += valor;
			return true;
		}
		
		boolean transferir(Conta outra, double valor) {
			if (valor <= 0) {
				return false;
			}
			outra.depositar(valor);
			return true;
			
		}
	
		void info() {
			System.out.println("Nome: " + titular);
			System.out.println("Numero da conta: " + numero);
			System.out.println("Saldo: " + saldo);
			
		}
	
}
