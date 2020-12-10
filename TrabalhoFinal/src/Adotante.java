import java.util.ArrayList;

public class Adotante {
    private String nome;
    private String cpf;
    private String endereco;
    private ArrayList<Animais> animaisAdotados = new ArrayList<Animais>();
    

    public Adotante(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void adotar(Animais animal){
        this.animaisAdotados.add(animal);
    }

    public ArrayList<Animais> listarAnimais(){
        return this.animaisAdotados;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }
}
