/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 01:47 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.entity;

import com.yashen.superMarket.entity.embedded.CustomerName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements SuperEntity{
    @Id
    @Column(name = "cus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cus_name",
            nullable = false
    )
    private CustomerName name;
    private String city;
    private String email;

    //-----------------------
    @OneToMany(
            mappedBy = "customer"
    )
    private List<Order> orders;
    //-----------------------
}
