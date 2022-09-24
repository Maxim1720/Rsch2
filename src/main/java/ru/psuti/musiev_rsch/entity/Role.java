package ru.psuti.musiev_rsch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    private String name;
}
