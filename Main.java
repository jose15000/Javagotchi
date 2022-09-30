
package com.mycompany.javagotchi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Javagotchi novoBichinho = new Javagotchi();//criando o objeto do bichinho
        
        //definindo os status:
        novoBichinho.setFome(10);
        novoBichinho.setEnergia(10);
        novoBichinho.setSaude(100);
        novoBichinho.setCarinho(30);
        novoBichinho.setHumor("Indiferente");
        
        
        //iniciando a interação:
        System.out.println("Olá, bem-vindo ao javagotchi, o bichinho virutal do java!");
         
        System.out.println("Qual será o nome do seu bichinho? ");
         
        String nome = entrada.next();
         
        novoBichinho.setNome(nome);
            
        System.out.println
           ("  /\\_/\\  (\n" +
            " ( ^.^ ) _)\n" +
            "   \\\"/  (\n" +
            " ( | | )\n" +
            "(__d b__)");
            
            System.out.println("Olá! meu nome é " + novoBichinho.getNome() + " o que deseja fazer comigo agora? ");
            System.out.println("1: Alimentar" + "\n" + "2: Colocar pra dormir: " + "\n" + "3: Fazer carinho" + "\n" + 
                    "4: Checar status: " + "\n" + "5: Brincar:" );
        
        //iniciando o loop com as opções do menu
        while(novoBichinho.saude > 0 && novoBichinho.fome < 100)
        {
           
           int escolha = entrada.nextInt();
            
            switch(escolha)
            {
                
                //caso 1: alimentar
                case 1:
                    //checa se o bichinho está com fome:
                    if(novoBichinho.fome == 0)
                    {
                        System.out.println("Já estou de barriga cheia, obrigado! ");
                    }
                   
                    //caso esteja, diminui 10 no status fome
                    else
                    {
                        novoBichinho.fome -= 10;
                        System.out.println("Fome reduzida em 10 pontos! obrigado!");
                    }
                    break;
                //caso 2: colocar para dormir: 
                case 2:
                    
                    if(novoBichinho.energia == 100)
                    {
                        System.out.println("Não estou com sono agora!");
                       
                    }
                    
                    else
                    {
                        novoBichinho.fome += 10;
                        novoBichinho.energia += 10;
                        System.out.println("Boa noite!");
                        System.out.println("      |\\      _,,,---,,_\n" +
                                           "ZZZzz /,`.-'`'    -.  ;-;;,_\n" +
                                           "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                                           "    '---''(_/--'  `-'\\_) ");
                    }
                    break;
                //caso 3: fazer carinho:  
                case 3:
                    
                    System.out.println("Deseja fazer carinho no seu bichinho? ");
                    
                    String resposta = entrada.next();
                    
                    if(resposta.equalsIgnoreCase("n"))
                    {
                        novoBichinho.carinho -= 10;
                        
                        System.out.println("Carinho -10 ;-;");
                    }
                    
                    
                    if(resposta.equalsIgnoreCase("s"))
                    {
                        novoBichinho.fome += 10;
                        
                        novoBichinho.carinho += 10;
                        
                        System.out.println("Carinho aumentado em +10!");
                    }
                    
                    if(novoBichinho.carinho >= 40)
                    {
                         novoBichinho.humor = "Feliz";
                         System.out.println("Estou feliz!");
                    }
                    
                    if(novoBichinho.carinho == 30)
                    {
                        System.out.println("Estou indiferente.");
                        novoBichinho.humor = "Indiferente";
                    }
                    
                    
                    if(novoBichinho.carinho <= 20)
                    {
                        novoBichinho.humor = "Triste";
                        novoBichinho.saude -=20;
                        System.out.println("Estou triste ;-; ");
                            
                    }
                    break;
                    
                //caso 4: checar status     
                case 4:
                    System.out.println("Fome: " + novoBichinho.getFome() + "\n" + "Saúde: " + novoBichinho.getSaude()
                    + "\n" + "Energia: " + novoBichinho.getEnergia()+ "\n" + "Humor: " + novoBichinho.getHumor()
                    + "\n" + "Carinho: " + novoBichinho.getCarinho());
                    
                    if(novoBichinho.fome > 50)
                    {
                        System.out.println("Estou com fome!");
                        novoBichinho.saude -= 10;
                    }
                    
                    if(novoBichinho.energia < 30)
                    {
                        System.out.println("Estou com sono!");
                    }
                    break;
                    
                //caso 5: brincar           
                case 5:
                    if(novoBichinho.energia < 30)
                    {
                        System.out.println(novoBichinho.nome + " está muito cansado para brincar agora.");
                    }
                    
                    else
                    {
                        System.out.println("Deseja brincar com o seu bichinho? (s/n)");
                    
                        resposta = entrada.next();
                    
                        if(resposta.equalsIgnoreCase("s"))
                        {
                            System.out.println("Você brincou com seu bichinho! ");
                            novoBichinho.energia -= 10;
                            novoBichinho.fome += 10;
                            novoBichinho.carinho += 10;
                        }   
                    
                        else
                        {
                            System.out.println("Você não brincou com o seu bichinho, ele pode ficar triste!");
                            novoBichinho.carinho -= 20;
                        }
                    }
                    break;   
            }
            
             System.out.println(" o que deseja fazer comigo agora?" + "\n" +
           "1: Alimentar" + "\n" + "2: Colocar pra dormir:" + "\n" + "3: fazer carinho"
            + "\n" + "4. Checar status: " + "\n" + "5. Brincar: ");
        }
       
        //se a fome do bichinho chegar a 100, ou a saúde a 0, ele morre e o jogo acaba '-'  
        if(novoBichinho.fome  == 100 || novoBichinho.saude == 0)
        {
            System.out.println("Você deixou seu bixhinho morrer.");
            System.out.println
           ("  /\\_/\\  (\n" +
            " ( X.X ) _)\n" +
            "   \\\"/  (\n" +
            " ( | | )\n" +
            "(__d b__)");
        }
    }
}
