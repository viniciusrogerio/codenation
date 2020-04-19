package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        return realizarOperacao(texto,3);
    }

    @Override
    public String descriptografar(String texto) {
        return realizarOperacao(texto,-3);
    }

    private String realizarOperacao(String texto, int operador){
        if(texto=="")
            throw new IllegalArgumentException("O texto não pode estar vazio.");
        if(texto==null)
            throw new NullPointerException("O campo texto não pode ser nulo.");

        String resultado = "";
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            int indiceAtual = alfabeto.indexOf(texto.toCharArray()[i]);
            resultado += ( indiceAtual != -1 ? alfabeto.charAt(indiceAtual + operador) : texto.charAt(i) );
        }
        return resultado;
    }
}