package tw.org.iii.todo.respository;

import java.util.List;
import tw.org.iii.todo.model.Todo;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ansonliu on 2015/10/27.
 */
@RepositoryRestResource(collectionResourceRel = "todo", path = "todo")
public interface TodoRepository extends PagingAndSortingRepository<Todo, String>{

    List<Todo> findByMessage(@Param("message")String message);


}
