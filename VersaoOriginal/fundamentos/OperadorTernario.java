package fundamentos;

/**
 * @author diego
 *
 */
public class OperadorTernario {
	public static void main(String[] args) {
		double nota1 = 7.1;
		double nota2 = 6;
		// Se expressão for verdadeira, a atribuição é feita pelo primeiro operando após ?, senão segundo operando
		String resultado1 = nota1 >= 7 ? "Aprovado" : "Reprovado";
		String resultado2 = nota2 >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
