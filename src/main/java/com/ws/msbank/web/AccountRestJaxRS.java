package com.ws.msbank.web;


import com.ws.msbank.entities.Account;
import com.ws.msbank.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@Path("Bank")
public class AccountRestJaxRS {
    @Autowired
    private AccountRepository accountRepository;
    @Path("/Accounts")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Account> accountList(){
        return accountRepository.findAll();
    }

    @Path("/Account/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Account getAccount(@PathParam(value = "id") Long id){
        return accountRepository.findById(id).get();
    }
    @Path("/Accounts/save")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Account save(Account account){
        return accountRepository.save(account);
    }

    @Path("/Accounts/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Account update(Account account,@PathParam(value="id")Long id){
        account.setId(id);
        return accountRepository.save(account);
    }


    @Path("/Delete/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam(value = "id") Long id){
          accountRepository.deleteById(id);
    }
}
