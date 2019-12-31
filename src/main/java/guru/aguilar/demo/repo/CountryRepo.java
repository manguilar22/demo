package guru.aguilar.demo.repo;

import guru.aguilar.demo.domain.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepo extends CrudRepository<Country,Long> { }
