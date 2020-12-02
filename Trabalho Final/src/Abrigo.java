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
    public void registrarAdotante(Adotante adotante){
        this.adotantes.add(adotante);
    }
    public void registrarAnimal(Animais animal){
        this.animais.add(animal);
    }

    public ArrayList<Adotante> listarAdotantes(){
        return this.adotantes;
    }
    
    public ArrayList<Animais> listarAnimais(){
        return this.animais;
    }
    public void adotarAnimal(Adotante adotante, Animais animal){
        this.animais.remove(animal);
        adotante.adotar(animal);
    }
}