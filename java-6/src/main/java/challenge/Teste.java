package challenge;

public class Teste {
    public static void main(String[] args) {
        String texto = "d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr";
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayAlfabeto = alfabeto.toCharArray();
        int numeroCasas = -3;

        String result = "";
        String regex = "[^a-zA-Z0-9]+";

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if(!Character.isDigit(texto.charAt(i)) && texto.charAt(i) != ' ') {
            int posAlfabeto = texto.codePointAt(i) - 96;

            int deslocamentoLetra = (posAlfabeto + numeroCasas) % 26;
            if(deslocamentoLetra == 0){
                deslocamentoLetra = (26 + deslocamentoLetra);
            } else {
                deslocamentoLetra = deslocamentoLetra;
            }

            result += arrayAlfabeto[deslocamentoLetra - 1];

                        }
                        else {
                            result += texto.charAt(i);
                        }
        }
        System.out.println(result);
    }
}
