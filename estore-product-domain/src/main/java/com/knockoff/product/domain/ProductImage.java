package com.knockoff.product.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

    @Id
    private Long imageId;

    @ManyToOne
    private Product product;
    private Integer position;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Integer width;
    private Integer height;
    private String source;

    @ManyToOne
    private ProductVariant productVariants;
}
