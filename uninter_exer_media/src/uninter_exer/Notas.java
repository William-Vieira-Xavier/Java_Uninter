package uninter_exer;

public class Notas {
	private double nota1;
	private double nota2;
	
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota) {
		if(nota1<0 || nota1>10) {
			System.out.println("Nota inválida.");
			return;
		}
		nota1 = nota;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota) {
		if(nota1<0 || nota1>10) {
			System.out.println("Nota inválida.");
			return;
		}
		nota2 = nota;
		
	}

	void resultado() {
		double media = (nota1 + nota2) / 2;
		if (media > 6) {
			
			System.out.println("Sua media foi de " + media + " Você foi aprovado!");
		}
		else {
			System.out.println("Você foi reprovado!");
		}
		
	}
}
