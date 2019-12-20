package guru.aguilar.demo.repo;

import guru.aguilar.demo.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {}
