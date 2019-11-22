package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"ProviderProducts\"", schema = "PUBLIC")
public class ProviderProducts implements Serializable
{

    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"ProviderID\"", nullable=false) private int providerid;
    @Column(name = "\"ProductID\"", nullable=false) private int productid;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public int get_providerid() {return providerid;} public void set_providerid(int providerid) {this.providerid=providerid;}
    public int get_productid() {return productid;} public void set_productid(int productid) {this.productid=productid;}
}
