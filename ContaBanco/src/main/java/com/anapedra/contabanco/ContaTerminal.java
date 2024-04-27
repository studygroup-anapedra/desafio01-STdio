package com.anapedra.contabanco;

import com.anapedra.contabanco.model.Account;
import com.anapedra.contabanco.model.Client;
import com.anapedra.contabanco.repositories.AccountRepository;
import com.anapedra.contabanco.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
public class ContaTerminal implements CommandLineRunner {
    private static Scanner sc = new Scanner(System.in);

    private final ClientRepository clientRepository;
    private final AccountRepository accountRepository;
    public ContaTerminal(ClientRepository clientRepository, AccountRepository accountRepository) {
        this.clientRepository = clientRepository;
        this.accountRepository = accountRepository;
    }

    public static void main(String[] args) {
            SpringApplication.run(ContaTerminal.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
         Client client = new Client();
         Account account = new Account();
        System.out.println();

        System.out.println("Digite seu nome: ");
        client.setName(sc.nextLine());
        System.out.println("Digite seu cpf: ");
        client.setCpf(sc.nextLine());
        clientRepository.save(client);

        System.out.println();


        System.out.println("Olá "+ client.getName() + ", está indo bem! Continue!" +
                "\nVocê deverá digitar os números da  conta e agencia sugeridos e em segida crie sua senha.\n" +
                "\nATENÇÃO: SUA SENHA DEVERÁ SER DE USO EXCLISIVO SEU! PARA SUA SEGURAÇA,NÃO COMPARTILHE INFORMAÇÕES SENSIVEIS DA SUA CONTA.!");

        System.out.println("\nDigite 067-8 para o número da agencia: ");
        account.setAgency(sc.nextLine());

        System.out.println("Digite  1021 para o número da conta: ");
        account.setNumber(sc.nextInt());

        System.out.println("Vamos lá, já está quase acabando! Para concluir digite sua senha: ");
         account.setPassword(sc.nextLine());

        account.setClient(client);
        account.setBalance(BigDecimal.ZERO);
        accountRepository.save(account);

        System.out.println("\nBanco Santander" +
                "\nTitular da conta...................."+ account.getClient().getName() +
                "\nCpf do titular...................."+ account.getClient().getCpf() +
                "\nNumero da conta..................."+ account.getNumber() +
                "\nNúmero da agencia................."+ account.getAgency() +
                "\nSaldo da conta...................."+ account.getBalance()
        );
        System.out.println("\nÓtimo, "+account.getClient().getName()+ " Vocẽ já é uma(o) Santander! Parabéns!" +
                "\nAgora você prescisa fazer um deposito de no mínimo $100\nEscolha a opção depositar: ");













    }
}
