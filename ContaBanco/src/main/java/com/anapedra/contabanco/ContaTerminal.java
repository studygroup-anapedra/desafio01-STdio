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
        System.out.println();

        System.out.println("Digite seu nome: ");
        client.setName(sc.nextLine());
        System.out.println("Digite seu cpf: ");
        client.setCpf(sc.nextLine());
        clientRepository.save(client);

        System.out.println();


        System.out.println("Nome: " + client.getName());
        System.out.println("CPF: " + client.getCpf());




    }
}
