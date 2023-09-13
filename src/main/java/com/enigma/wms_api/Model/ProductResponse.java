package com.enigma.wms_api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductResponse {

    @Id
    private Long id;
    @Column(name = "product_name")
    private String ProductName;
}
