package vergilius.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import vergilius.Os;


public interface OsRepository extends CrudRepository<Os, Integer> {

    @Query("select u from Os u where u.osname = :osname")
    Os findByOsname(@Param("osname") String osname);

}