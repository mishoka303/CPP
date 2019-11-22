package pg;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="\"Deliveries\"", schema = "PUBLIC")
public class Deliveries implements Serializable
{
    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"ProviderID\"", nullable=false) private int providerid;
    @Column(name = "\"CreatedByID\"", nullable=false) private int cbid;
    @Column(name = "\"Date\"", nullable=false, columnDefinition = "DATE") private Date date;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public int get_providerid() {return providerid;} public void set_providerid(int providerid) {this.providerid=providerid;}
    public int get_cbid() {return cbid;} public void set_cbid(int cbid) {this.cbid=cbid;}
    public Date get_date() {return date;} public void set_date(Date date) {this.date=date;}

}
