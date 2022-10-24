package pl.sda.ristoretoCoffeeShop.model;

import lombok.Data;


import pl.sda.ristoretoCoffeeShop.model.enums.OrderPaymentMethod;
import pl.sda.ristoretoCoffeeShop.model.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private OrderStatus status;
    private double total;
    private Date date;
    private OrderPaymentMethod paymentMethod;

}
