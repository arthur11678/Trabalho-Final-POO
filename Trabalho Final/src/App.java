import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int acao;
        ArrayList<Abrigo> abrigos = new ArrayList<Abrigo>();
        ArrayList<Adotante> adotantes = new ArrayList<Adotante>();
        ArrayList<Animais> animais = new ArrayList<Animais>();
        boolean isRunning = true;
        while(isRunning){
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
                String nomeAbrigo;
                String nomeDono;
                System.out.println("Digite o nome do abrigo");
                nomeAbrigo = teclado.nextLine();
                System.out.println("Digite o nome do dono");
                nomeDono = teclado.nextLine();
                abrigos.add(new Abrigo(nomeAbrigo, nomeDono));
                System.out.println("Abrigo cadastrado com sucesso!");

            }else if(acao == 2){
                int i = 1;
                for(Abrigo abrigo : abrigos){
                    System.out.println(Integer.toString(i) + " - " + abrigo.getNomeAbrigo());
                }
            }else if(acao == 3){
                String nome;
                String cpf;
                String endereço;
                System.out.println("Digite o nome do adotante");
                nome = teclado.nextLine();
                System.out.println("Digite o CPF");
                cpf = teclado.nextLine();
                System.out.println("Digite o endereço");
                endereço = teclado.nextLine();
                adotantes.add(new Adotante(nome, cpf, endereço));
            }else if(acao == 4){
                boolean abrigoExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                System.out.println("Digite o nome do abrigo para registrar o adotante");
                nomeAbrigo = teclado.nextLine();
                System.out.println("Digite o nome do adotante a ser registrado");
                nomeAdotante = teclado.nextLine();
                for(Abrigo abrigo : abrigos){
                    if(abrigo.getNomeAbrigo() == nomeAbrigo){
                        abrigoExiste = true;
                        for(Adotante adotante : adotantes){
                            if(adotante.getNome() == nomeAdotante){
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

            }else if(acao == 5){
                String nome;
                String animal;
                String raça;
                String cor;
                int idade = 0;
                System.out.println("Digite o nome do animal");
                nome = teclado.nextLine();
                System.out.println("Qual é o tipo do animal?");
                raça = teclado.nextLine();
                System.out.println("Qual a cor do animal?");
                cor = teclado.nextLine();
                System.out.println("Qual a idade do animal? Se não suber deixe em branco");
                idade = teclado.nextInt();
                System.out.println("Qual a raça? Se não souber deixe em branco");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                animal = teclado.nextLine();
                if(animal == "1"){
                    if(raça == "" && idade == 0){
                        animais.add(new Cachorro(nome, "Cachorro", cor));
                    }else if(raça == ""){
                        animais.add(new Cachorro(nome, "Cachorro", cor, idade));
                    }else if(idade == 0){
                        animais.add(new Cachorro(nome, "Cachorro", raça, cor));
                    }
                }else{
                    if(raça == "" && idade == 0){
                        animais.add(new Gato(nome, "Cachorro", cor));
                    }else if(raça == ""){
                        animais.add(new Gato(nome, "Cachorro", cor, idade));
                    }else if(idade == 0){
                        animais.add(new Gato(nome, "Cachorro", raça, cor));
                    }
                }
            }else if(acao == 6){
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                String nomeAbrigo;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo para registrar o adotante");
                nomeAbrigo = teclado.nextLine();
                System.out.println("Digite o nome do animal a ser registrado");
                nomeAnimal = teclado.nextLine();
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

            }else if(acao == 7){
                boolean abrigoExiste = false;
                String nomeAbrigo;
                System.out.println("Digite o nome do abrigo para listar os animais");
                nomeAbrigo = teclado.nextLine();
                for(Abrigo abrigo : abrigos){
                    if(abrigo.getNomeAbrigo() == nomeAbrigo){
                        abrigoExiste = true;
                        abrigo.listarAnimais();
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe");
                }
            }else if(acao == 8){
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo onde o animal esta");
                nomeAbrigo = teclado.nextLine();
                System.out.println("Digite o nome do adotante");
                nomeAdotante = teclado.nextLine();
                System.out.println("Digite o nome do animal");
                nomeAnimal = teclado.nextLine();
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

            }else if(acao == 9){
                isRunning = false;
            }
        }
        teclado.close();
    }
    
}
