package ru.psuti.musiev_rsch.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "UserAccount")
@Table(name = "users")
public class User implements Serializable {

    @Id
    private UUID id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "role_name")
    private Role role;

}
