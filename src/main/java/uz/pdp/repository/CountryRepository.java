package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
}
