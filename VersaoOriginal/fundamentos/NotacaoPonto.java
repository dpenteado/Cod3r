package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
				
		/* Faz o mesmo que a expressão anterior
		 *  
		 *String s = "Bom dia ?";
		 *s = s.toUpperCase();
		 *s = s.replace("?", "Bia");
		 *s = s.concat("!"); 
		 */
		
		System.out.println(s);
	}

}
