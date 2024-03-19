package jwtspring3.repository;



import jwtspring3.model.Role;
import jwtspring3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    Iterable<User> findAllByRoles(Role role);
}