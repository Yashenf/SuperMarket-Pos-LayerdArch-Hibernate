/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 02:05 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    @Column(
            name = "description",
            nullable = false
    )
    private String description;
    @Column(
            name = "unit_price",
            nullable = false
    )
    private double unitPrice;
    @Column(
            name = "qty_on_hand",
            nullable = false
    )
    private int qtyOnHand;

    //-------------------------
    @OneToMany(
            mappedBy = "product"
    )
    private List<OrderDetails>orderDetailsList;
    //-------------------------
}
