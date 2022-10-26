package com.ws.msbank;

import com.ws.msbank.entities.Account;
import com.ws.msbank.entities.AccountType;
import com.ws.msbank.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MsBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBankApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountRepository accountRepository){
        return args -> {
            accountRepository.save(new Account(0,Math.random()*8555,new Date(), AccountType.CURRENT));
            accountRepository.save(new Account(0,Math.random()*8555,new Date(), AccountType.SAVING));
            accountRepository.save(new Account(0,Math.random()*8555,null, AccountType.CURRENT));
            accountRepository.findAll().forEach(c->{System.out.println(c.toString());});
        };
    }

}
