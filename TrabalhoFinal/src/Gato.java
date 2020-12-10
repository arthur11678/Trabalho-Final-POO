public class Gato  extends Animais{
    public Gato(String nome, String animal, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);;
    }
    public Gato(String nome, String animal, String raca, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaca(raca);
        this.setCor(cor);
    }
    public Gato(String nome, String animal, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);
        this.setIdade(idade); 
    }
    public Gato(String nome, String animal, String raca, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaca(raca);
        this.setCor(cor);
        this.setIdade(idade);
    }
}
