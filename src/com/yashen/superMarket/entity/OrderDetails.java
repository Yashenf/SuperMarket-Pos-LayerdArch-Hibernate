/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 02:56 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetails implements SuperEntity{
    @Id
    @Column(name = "no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(
            name = "qty",
            nullable = false
    )
    private int qty;
    @Column(
            name = "unit_price",
            nullable = false
    )
    private double unitPrice;

    //------------------------
    @ManyToOne()// mapped with order
    @JoinColumn(
            name = "order_id",
            nullable = false,
            updatable = false,
            insertable = false,
            foreignKey = @ForeignKey(
                    name = "fk_ord_id"
            )
    )
    private Order order;

    @ManyToOne()//mapped with product
    @JoinColumn(
            name = "product",
            nullable = false,
            updatable = false,
            insertable = false,
            foreignKey = @ForeignKey(
                    name = "fk_code"
            )
    )
    private Product product;

    //------------------------

}
