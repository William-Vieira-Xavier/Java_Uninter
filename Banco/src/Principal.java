
public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111, "Alfredo", 2000, 500);
		Conta c2 = new Conta(222, "Gerinelson", 1000, 300);
		
		c1.info();
		
		if (!c1.sacar(200)) {
			System.out.println("Problema ao sacar");
			
		}
		
		if (!c1.depositar(500)) {
			System.out.println("Problema ao depositar!");
		}
		
		c1.info();
		
		c1.transferir(c2, 200);
		c1.info();
		c2.info();
		
	}

}
