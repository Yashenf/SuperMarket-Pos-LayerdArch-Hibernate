/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 02:02 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements SuperEntity{
    @Id
    @Column(
            name = "ord_id"
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double total;
    //------------------
    @ManyToOne() // mapped with product
    @JoinColumn(name = "customer") // mapped with customer
    private Customer customer;

    @OneToMany(mappedBy = "order") //mapped with order_details
    private List<OrderDetails> orderDetails;

    //------------------
}
