package pl.sda.ristoretoCoffeeShop.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import pl.sda.ristoretoCoffeeShop.model.enums.OrderPaymentMethod;
import pl.sda.ristoretoCoffeeShop.model.enums.OrderStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private OrderStatus status;
    private double total;
    private Date date;
    private OrderPaymentMethod paymentMethod;

}
