abstract class Animais {
    private String nome;
    private String animal;
    private String raca;
    private String cor;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnimal(String animal){
        this.animal = animal;
    }
    public void setRaca(String raca){
        this.raca = raca;
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
    public String getRaca(){
        return this.raca;
    }
    public String getCor(){
        return this.cor;
    }
    public int getIdade(){
        return this.idade;
    }
}
