package com.github.juliherms.sm.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * This class responsible to represent Product in the system
 */
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long code;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "short_price")
    private BigDecimal shortPrice;

    @Column(name="sell_price")
    private BigDecimal sellPrice;

    @Column(name = "observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "code_category",referencedColumnName = "code")
    private Category category;
}
