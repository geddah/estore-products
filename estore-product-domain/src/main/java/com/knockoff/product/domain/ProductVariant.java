package com.knockoff.product.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductVariant {

    @Id
    private Long variantId;

    private String barcode;
    private BigDecimal compareAtPrice;
    private Timestamp createdAt;
    private String fulfillmentService ;
    private BigDecimal weight;

    @OneToMany
    private List<ProductImage> image;
    private BigDecimal inventoryItemId;
    private String inventoryManagement;
    private String inventoryPolicy;
    private Integer inventoryQuantity;
    private String options;
    private BigDecimal price;

    @ManyToOne
    private Product productId;
    private String title;
    private Timestamp updatedAt;
    private String weightUnit;
}
