package com.ws.msbank.repositories;


import com.ws.msbank.MsBankApplication;
import com.ws.msbank.entities.Account;

import org.springframework.boot.SpringApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface  AccountRepository extends JpaRepository<Account,Long> {
    public static void main(String[] args){
        SpringApplication.run(MsBankApplication.class,args);
    }

}
