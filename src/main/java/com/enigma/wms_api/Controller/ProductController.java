package com.enigma.wms_api.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Size(max = 11)
    private Integer productCode;
    @Size(max = 255)
    private String productName;
    @Size(max = 11)
    private Long price;
}
