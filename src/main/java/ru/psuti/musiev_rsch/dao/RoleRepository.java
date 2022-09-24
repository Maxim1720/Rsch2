package ru.psuti.musiev_rsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.psuti.musiev_rsch.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
