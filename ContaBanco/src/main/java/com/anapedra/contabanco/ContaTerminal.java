package com.anapedra.contabanco;

import com.anapedra.contabanco.model.Client;
import com.anapedra.contabanco.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContaTerminal implements CommandLineRunner {
    private static Scanner sc = new Scanner(System.in);

    private final ClientRepository clientRepository;
    public ContaTerminal(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public static void main(String[] args) {
            SpringApplication.run(ContaTerminal.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
         Client client = new Client();

        System.out.println("Digite seu nome: ");
        client.setName(sc.nextLine());
        System.out.println("Digite seu senha: ");
        client.setPassword(sc.nextLine());

        clientRepository.save(client);
        System.out.println("Nome: " + client.getName());
        System.out.println("Senha: " + client.getPassword());















     /*
        System.out.println("Digite  :\n" +
                "1 para saldo\n" +
                "2 para deṕosito\n" +
                "3 para saque\n" +
                "4 para sair\n");
        int x= sc.nextInt();
        Number number=new Number();
        String op="Sim";
        switch (x){
            case 1:
                while (op.equalsIgnoreCase("sim")){
                    Number n1=new Number();
                    Number n2=new Number();
                    Number res=new Number();
                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() + n2.getValue());
                    System.out.printf("%n%d + %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("A soma de %d e %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra adição digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!");
                    op=sc.next();
                }
                break;
            case 2:
                while (op.equalsIgnoreCase("sim")){
                    Number n1=new Number();
                    Number n2=new Number();
                    Number res=new Number();
                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() - n2.getValue());
                    System.out.printf("%n%d - %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("O resultado de %d menos %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra subtração digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!");
                    op=sc.next();

                }
                break;
            case 3:
                while (op.equalsIgnoreCase("sim")){
                    Number n1=new Number();
                    Number n2=new Number();
                    Number res=new Number();
                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() * n2.getValue());
                    System.out.printf("%n%d * %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("O resultado de %d vezes %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra mutiplicação digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!)");
                    op=sc.next();
                }
                break;
            case 4:
                while (op.equalsIgnoreCase("sim")){
                    Number n1=new Number();
                    Number n2=new Number();
                    Number res=new Number();
                    Number sobraDivisão=new Number();
                    Locale.setDefault(Locale.US);
                    System.out.println("Digite o primeiro valor: ");
                    n1.setValueDecimal(sc.nextDouble());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValueDecimal(sc.nextDouble());
                    res.setValueDecimal(n1.getValue());
                    sobraDivisão.setValueDecimal(n1.getValueDecimal() % n2.getValueDecimal());
                    res.setValueDecimal(n1.getValueDecimal() / n2.getValueDecimal());
                    System.out.printf("%n%.2f / %.2f = %.2f%nSOBRA DA DIVISÃO: %.2f%n",n1.getValueDecimal(),n2.getValueDecimal(),res.getValueDecimal(),
                            sobraDivisão.getValueDecimal());
                    System.out.printf("A divisão de %.2f por %.2f é igual a %.2f e resta %.2f%n%n ",n1.getValueDecimal(),n2.getValueDecimal(),res.getValueDecimal(),sobraDivisão.getValueDecimal());
                    System.out.println("Se deseja fazer outra divisão digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!)");
                    op=sc.next();

                }
            default:
                System.out.println("Opcão invalida!");

        }

    }



}

      */

        

    }
}
