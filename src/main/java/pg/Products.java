package pg;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="\"Products\"")
public class Products implements Serializable
{

    @Column(name = "\"ID\"", unique=true, nullable=false) @Id private int id; @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "\"Name\"", nullable=false) private String name;
    @Column(name = "\"Price\"", nullable=false) private Double price;
    @Column(name = "\"Stock\"", nullable=false) private int stock;
    @Column(name = "\"IsActive\"", nullable=false) private String isactive;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public String get_name() {return name;} public void set_name(String name) {this.name=name;}
    public double get_price() {return price;} public void set_price(double price) {this.price=price;}
    public int get_stock() {return stock;} public void set_stock(int stock) {this.stock=stock;}
    public String get_isactive() {return isactive;} public void set_isactive(String isactive) {this.isactive=isactive;}
}
