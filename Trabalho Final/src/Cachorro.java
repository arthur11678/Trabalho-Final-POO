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

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRaça(String raça){
        this.raça = raça;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAnimal(){
        return this.animal;
    }
    public String getRaça(){
        return this.raça;
    }
    public String getCor(){
        return this.cor;
    }
    public int getIdade(){
        return this.idade;
    }
}
