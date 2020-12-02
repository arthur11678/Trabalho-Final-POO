import java.util.ArrayList;

public class Adotante {
    String nome;
    String cpf;
    String endereco;
    ArrayList<Animais> animaisAdotados = new ArrayList<Animais>();
    

    public Adotante(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void adotar(Animais animal){
        this.animaisAdotados.add(animal);
    }
}
