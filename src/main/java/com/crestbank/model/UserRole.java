package com.crestbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserRole implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private User user;

    private Role role;

}
