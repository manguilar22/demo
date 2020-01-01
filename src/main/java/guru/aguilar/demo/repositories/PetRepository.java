package guru.aguilar.demo.repositories;

import guru.aguilar.demo.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> { }
