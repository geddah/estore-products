package com.knockoff.product.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private String bodyHtml;
	private Timestamp createdAt;
	private String handle;
	@Id
	private Long productId;
	@OneToMany
	private List<ProductImage> productImages;
	private BigDecimal optionId;
	private String productType;
	private Timestamp publishedAt;
	private String publishedScope;
	private String status;
	private String tags;
	private String templateSuffix;
	private String title;
	private Timestamp updatedAt;

	@OneToMany
	private List<ProductVariant> variantId;
	private String vendor;

}
