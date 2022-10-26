package com.ws.msbank.web;


import com.ws.msbank.entities.Account;
import com.ws.msbank.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;

import java.util.List;


//@RestController
@RequestMapping("/bank")
public class AccountRestController {
    @Autowired
    private AccountRepository accountRepository;
 @GetMapping(path="/accounts",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<Account> accountList(){
        return accountRepository.findAll();
    }

    @GetMapping(path="/Account/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountRepository.findById(id).get();
    }
    @PostMapping(path="Accounts/save")
    public Account save(@RequestBody Account account){
        return accountRepository.save(account);
    }

   @PutMapping(path="Accounts/{id}")
    public Account update(@RequestBody Account account,@PathVariable Long id){
        account.setId(id);
        return accountRepository.save(account);
    }


   @DeleteMapping("Accounts/delete/{id}")
    public void delete(@PathVariable Long id){
          accountRepository.deleteById(id);
    }
}
