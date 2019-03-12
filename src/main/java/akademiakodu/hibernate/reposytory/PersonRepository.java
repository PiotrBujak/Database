package akademiakodu.hibernate.reposytory;

import akademiakodu.hibernate.Model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT p FROM Person p ORDER BY p.id")
    List<Person> findAllSortById();

    @Query("SELECT p FROM Person p ORDER BY p.name")
    List<Person> findAllSoryByName();

    @Query("SELECT p FROM Person p WHERE p.name=?1")
    List<Person> findByName(String name);

    @Query("SELECT p FROM Person p WHERE p.age=?1")
    List<Person> findByAge(Integer age);

    //Testowa ale nie podoba mi się to
    @Query("SELECT p FROM Person p WHERE p.name=?1 OR p.age=?1")
    List<Person> findByNameOrAge(String name, Integer age);
}
