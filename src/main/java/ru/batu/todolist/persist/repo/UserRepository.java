package ru.batu.todolist.persist.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.batu.todolist.persist.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
