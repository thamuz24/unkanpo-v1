package jwtspring3.service;



import jwtspring3.model.Role;

import java.util.Optional;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);

    Optional<Role> findById(Long id);
}
