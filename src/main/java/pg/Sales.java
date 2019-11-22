package pg;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="\"Sales\"", schema = "PUBLIC")
public class Sales implements Serializable
{
    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClientID", nullable=false) private Integer clientid;
    @Column(name = "Date", nullable=false, columnDefinition = "DATE") private Date date;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public int get_clientid() {return clientid;} public void set_clientid(int clientid) {this.clientid=clientid;}
    public Date get_date() {return date;} public void set_mname(Date date) {this.date=date;}

}
