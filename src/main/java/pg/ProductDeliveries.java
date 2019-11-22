package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"ProductDeliveries\"", schema = "PUBLIC")
public class ProductDeliveries implements Serializable
{
    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"ProductID\"", nullable=false) private int productid;
    @Column(name = "\"DeliveryPrice\"", nullable=false) private double deliveryprice;
    @Column(name = "\"Quantity\"", nullable=false) private int quantity;
    @Column(name = "\"DeliveryID\"", unique=true) private int deliveryid;
    @Column(name = "\"ProviderID\"", unique=true) private int providerid;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public int get_productid() {return productid;} public void set_productid(int productid) {this.productid=productid;}
    public double get_deliveryprice() {return deliveryprice;} public void set_deliveryprice(double deliveryprice) {this.deliveryprice=deliveryprice;}
    public int get_quantity() {return quantity;} public void set_quantity(int quantity) {this.quantity=quantity;}
    public int get_deliveryid() {return deliveryid;} public void set_deliveryid(int deliveryid) {this.deliveryid=deliveryid;}
    public int get_providerid() {return providerid;} public void set_providerid(int providerid) {this.providerid=providerid;}

}
