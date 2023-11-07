package controle;

public class Principal {
    public static void main(String[] args) {
	String objetivo = "hello world";
    String atual = "";

    for (int i = 0; i < objetivo.length(); i++) {
        char objetivoChar = objetivo.charAt(i);

        while (atual.length() <= i) {
            atual += 'a'; // Comece com 'a' e aumente gradualmente
        }

        while (atual.charAt(i) != objetivoChar) {
            System.out.println(atual);
            char[] arranjo = atual.toCharArray();
            arranjo[i]++;
            atual = new String(arranjo);
        }
    }
    System.out.println(atual);
}
}