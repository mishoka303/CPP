package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"Providers\"", schema = "PUBLIC")
public class Providers implements Serializable
{

    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"FirstName\"", nullable=false) private String fname;
    @Column(name = "\"MiddleName\"", nullable=false) private String mname;
    @Column(name = "\"LastName\"", nullable=false) private String lname;
    @Column(name = "\"Company\"", nullable=false) private String company;
    @Column(name = "\"VatNumber\"", nullable=false) private int vatnumber;
    @Column(name = "\"IsActive\"", nullable=false) private String isactive;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public String get_fname() {return fname;} public void set_fname(String fname) {this.fname=fname;}
    public String get_mname() {return mname;} public void set_mname(String mname) {this.mname=mname;}
    public String get_lname() {return lname;} public void set_lname(String lname) {this.lname=lname;}
    public String get_company() {return company;} public void set_company(String company) {this.company=company;}
    public int get_vatnumber() {return vatnumber;} public void set_vatnumber(int vatnumber) {this.vatnumber=vatnumber;}
    public String get_isactive() {return isactive;} public void set_isactive(String isactive) {this.isactive=isactive;}

}
