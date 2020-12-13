import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int acao;
        ArrayList<Abrigo> abrigos = new ArrayList<Abrigo>();
        ArrayList<Adotante> adotantes = new ArrayList<Adotante>();
        ArrayList<Animais> animais = new ArrayList<Animais>();
        boolean isRunning = true;
        while(isRunning){
            clrscr();
            System.out.println("1 - Registrar um abrigo");
            System.out.println("2 - Listar abrigos");
            System.out.println("3 - Criar um adotante");
            System.out.println("4 - Registrar um adotante");
            System.out.println("5 - Criar um animal");
            System.out.println("6 - Registrar um animal");
            System.out.println("7 - Listar todos os animais de um abrigo");
            System.out.println("8 - Adotar um animal");
            System.out.println("9 - Fechar o programa");
            acao = teclado.nextInt();
            if(acao == 1){
                clrscr();
                String nomeAbrigo;
                String nomeDono;
                System.out.println("Digite o nome do abrigo");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do dono");
                nomeDono = teclado.next();
                abrigos.add(new Abrigo(nomeAbrigo, nomeDono));
                System.out.println("Abrigo cadastrado com sucesso!");
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 2){
                clrscr();
                int i = 1;
                for(Abrigo abrigo : abrigos){
                    System.out.println(Integer.toString(i) + " - " + abrigo.getNomeAbrigo());
                    i++;
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();
            }else if(acao == 3){
                clrscr();
                String nome;
                String cpf;
                String endereco;
                System.out.println("Digite o nome do adotante:");
                nome = teclado.next();
                System.out.println("Agora digite o CPF:");
                cpf = teclado.next();
                System.out.println("Por fim, digite o endereço:");
                endereco = teclado.next();
                adotantes.add(new Adotante(nome, cpf, endereco));
                System.out.println("Adotante criado com sucesso!");
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 4){
                clrscr();
                boolean abrigoExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                System.out.println("Digite o nome do abrigo para registrar o adotante");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do adotante a ser registrado");
                nomeAdotante = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(nomeAbrigo.equals(abrigo.getNomeAbrigo())){
                        abrigoExiste = true;
                        for(Adotante adotante : adotantes){
                            if(nomeAdotante.equals(adotante.getNome())){
                                adotanteExiste = true;
                                abrigo.registrarAdotante(adotante);
                            }
                        }
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe");
                }else if(!adotanteExiste){
                    System.out.println("O adotante digitado não existe");
                }else{
                    System.out.println("O adotante foi registrado com sucesso!");
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 5){
                clrscr();
                String nome;
                int animal;
                String raca;
                String cor;
                int idade = 0;
                System.out.println("Digite o nome do animal");
                nome = teclado.next();
                System.out.println("Qual é o tipo do animal?");
                raca = teclado.next();
                System.out.println("Qual a cor do animal?");
                cor = teclado.next();
                System.out.println("Qual a idade do animal em anos? Se não souber deixe em branco (APENAS NUMEROS)");
                idade = teclado.nextInt();
                System.out.println("Qual a raça? Se não souber deixe em branco");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                animal = teclado.nextInt();
                if(animal == 1){
                    if(raca == "" && idade == 0){
                        animais.add(new Cachorro(nome, "Cachorro", cor));
                    }else if(raca == ""){
                        animais.add(new Cachorro(nome, "Cachorro", cor, idade));
                    }else if(idade == 0){
                        animais.add(new Cachorro(nome, "Cachorro", raca, cor));
                    }
                }else{
                    if(raca == "" && idade == 0){
                        animais.add(new Gato(nome, "Cachorro", cor));
                    }else if(raca == ""){
                        animais.add(new Gato(nome, "Cachorro", cor, idade));
                    }else if(idade == 0){
                        animais.add(new Gato(nome, "Cachorro", raca, cor));
                    }
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 6){
                clrscr();
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                String nomeAbrigo;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo para registrar o adotante");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do animal a ser registrado");
                nomeAnimal = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(abrigo.getNomeAbrigo() == nomeAbrigo){
                        abrigoExiste = true;
                        for(Animais animal : animais){
                            if(animal.getNome() == nomeAnimal){
                                animalExiste = true;
                                abrigo.registrarAnimal(animal);
                            }
                        }
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe");
                }else if(!animalExiste){
                    System.out.println("O animal digitado não existe");
                }else{
                    System.out.println("O animal foi registrado com sucesso!");
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 7){
                clrscr();
                boolean abrigoExiste = false;
                String nomeAbrigo;
                System.out.println("Digite o nome do abrigo para listar os animais");
                nomeAbrigo = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(abrigo.getNomeAbrigo() == nomeAbrigo){
                        abrigoExiste = true;
                        abrigo.listarAnimais();
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe");
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 8){
                clrscr();
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo onde o animal esta");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do adotante");
                nomeAdotante = teclado.next();
                System.out.println("Digite o nome do animal");
                nomeAnimal = teclado.next();
                for(Adotante adotante : adotantes){
                    if(adotante.getNome() == nomeAdotante){
                        adotanteExiste = true;
                        for(Abrigo abrigo : abrigos){
                            if(abrigo.getNomeAbrigo() == nomeAbrigo){
                                abrigoExiste = true;
                                for(Animais animal : abrigo.getAnimais()){
                                    if(animal.getNome() == nomeAnimal){
                                        animalExiste = true;
                                        abrigo.adotarAnimal(adotante, animal);
                                    }
                                }
                            }
                        }
                    }
                }
                if(!adotanteExiste){
                    System.out.println("O adotante digitado não existe");
                }else if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe");
                }else if(!animalExiste){
                    System.out.println("O animal digitado não esta nesse abrigo ou não existe");
                }else{
                    System.out.println("O animal foi adotado com sucesso!");
                }
                System.out.println("Aperte Enter para voltar ao menu");
                System.in.read();

            }else if(acao == 9){
                isRunning = false;
            }
        }
        teclado.close();
    }


    public static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    
}
