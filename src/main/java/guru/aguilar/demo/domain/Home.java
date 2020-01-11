package guru.aguilar.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Home {

    @Id
    @GeneratedValue
    private Long id;
    private String streetAddress;
    private Double price;
    private Boolean sold;


    protected Home(){}

    public Home(String streetAddress, Double price, Boolean sold){
        this.streetAddress = streetAddress;
        this.price = price;
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", streetAddress='" + streetAddress + '\'' +
                ", price=" + price +
                ", sold=" + sold +
                '}';
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getSold() {
        return sold;
    }
}
