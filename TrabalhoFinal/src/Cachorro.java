public class Cachorro extends Animais{
    public Cachorro(String nome, String animal, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);;
    }
    public Cachorro(String nome, String animal, String raca, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaca(raca);
        this.setCor(cor);
    }
    public Cachorro(String nome, String animal, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);
        this.setIdade(idade); 
    }
    public Cachorro(String nome, String animal, String raca, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaca(raca);
        this.setCor(cor);
        this.setIdade(idade);
    }
}
