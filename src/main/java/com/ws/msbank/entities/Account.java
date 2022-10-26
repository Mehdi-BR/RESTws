package com.ws.msbank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double balance;
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Enumerated(EnumType.ORDINAL)
    private AccountType accountType;
}
