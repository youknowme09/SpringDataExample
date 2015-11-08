package tw.org.iii.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



/**
 * Created by ansonliu on 2015/10/27.
 */
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public Todo(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
