package controle;

public class Principal {
    public static void main(String[] args) {
	String objetivo = "Hello World";
    String atual = "";

    	for (int i = 0; i < objetivo.length(); i++) {
    		atual += 'a'; // Comece com 'a' e aumente gradualmente
        
    		while (atual.charAt(i) != objetivo.charAt(i)) {
    			System.out.println(atual); // Imprime a String atual
    			char[] arranjo = atual.toCharArray(); // Incorpora a última letra da String atual para o arranjo.
    			arranjo[i]++; // Incrementa a letra do arranjo
    			atual = new String(arranjo);  // Incorpora a String atual com os caracteres contidos em arranjo
    		}
    	}
    System.out.println(atual); // Imprime uma ultima vez a String atual
    }
}