package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayAlfabeto = alfabeto.toCharArray();
        int numeroCasas = 3;
        String result = "";

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

        if(texto == ""){
            throw new IllegalArgumentException("Você deve enviar um campo preenchido");
        }
        if(texto == null){
            throw new NullPointerException("Você deve enviar um campo preenchido");
        }
        return result;
    }

    @Override
    public String descriptografar(String texto) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayAlfabeto = alfabeto.toCharArray();
        int numeroCasas = -3;
        String result = "";

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

        if(texto == ""){
            throw new IllegalArgumentException("Você deve enviar um campo preenchido");
        }
        if(texto == null){
            throw new NullPointerException("Você deve enviar um campo preenchido");
        }
        return result;
    }
}
