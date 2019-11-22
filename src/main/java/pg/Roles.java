package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"Roles\"")
public class Roles implements Serializable
{
    @Column(name = "\"ID\"", unique=true, nullable = false) @Id private int id;
    @Column(name = "\"Name\"", nullable=false) private String name;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public String get_name() {return name;} public void set_name(String name) {this.name=name;}
}
