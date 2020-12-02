import java.util.ArrayList;

public class Abrigo {
    ArrayList<Animais> animais = new ArrayList<Animais>();
    String nomeAbrigo;
    String nomeDono;
    ArrayList<Adotante> adotantes = new ArrayList<Adotante>();

    public Abrigo(String nomeAbrigo, String nomeDono){
        this.nomeAbrigo = nomeAbrigo;
        this.nomeDono = nomeDono;
    }
}