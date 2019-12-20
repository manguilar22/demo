package guru.aguilar.demo.repo;

import guru.aguilar.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> { }
