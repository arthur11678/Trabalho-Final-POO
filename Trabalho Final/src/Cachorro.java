public class Cachorro extends Animais{
    public Cachorro(String nome, String animal, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);;
    }
    public Cachorro(String nome, String animal, String raça, String cor){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaça(raça);
        this.setCor(cor);
    }
    public Cachorro(String nome, String animal, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setCor(cor);
        this.setIdade(idade); 
    }
    public Cachorro(String nome, String animal, String raça, String cor, int idade){
        this.setNome(nome);
        this.setAnimal(animal);
        this.setRaça(raça);
        this.setCor(cor);
        this.setIdade(idade);
    }
}
