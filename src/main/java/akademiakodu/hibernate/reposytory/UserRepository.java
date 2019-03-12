package akademiakodu.hibernate.reposytory;

import akademiakodu.hibernate.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
