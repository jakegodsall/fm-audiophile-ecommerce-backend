package com.jakegodsall.audiophilerestapi.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false, unique = true)
    private String slug;
    private String description;
    private String features;
    private boolean isNew = false;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private int quantity;
    private String pathToImageDirectory;
    private String mobileImagePath;
    private String tabletImagePath;
    private String desktopImagePath;
    private String galleryImage1Path;
    private String galleryImage2Path;
    private String galleryImage3Path;
//    private Set<Product> others;
}
