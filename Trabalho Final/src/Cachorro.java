public class Cachorro extends Animais{
    public Cachorro(String nome, String animal, String cor){
        this.nome = nome;
        this.animal = animal;
        this.cor = cor;
    }
    public Cachorro(String nome, String animal, String raça, String cor){
        this.nome = nome;
        this.animal = animal;
        this.raça = raça;
        this.cor = cor;
    }
    public Cachorro(String nome, String animal, String cor, int idade){
        this.nome = nome;
        this.animal = animal;
        this.cor = cor;
        this.idade = idade; 
    }
    public Cachorro(String nome, String animal, String raça, String cor, int idade){
        this.nome = nome;
        this.animal = animal;
        this.raça = raça;
        this.cor = cor;
        this.idade = idade;
    }
}
