/* DROP TABLE */

DROP TABLE product;



/* CREATE TABLE */

CREATE TABLE product
(
  body_html varchar(200),
  created_at timestamp,
  handle varchar(20),
  product_id bigint unsigned NOT NULL,
  image_id bigint unsigned,
  option_id bigint unsigned,
  product_type varchar(20),
  published_at timestamp,
  published_scope varchar(20),
  status varchar(20),
  tags varchar(200),
  template_suffix varchar(20),
  title varchar(100) NOT NULL,
  updated_at timestamp,
  variant_id bigint unsigned,
  vendor varchar(30),
  CONSTRAINT product_id PRIMARY KEY (product_id)
);


/* DROP TABLE */

DROP TABLE product_variant;



/* CREATE TABLE */

CREATE TABLE product_variant
(
  barcode varchar(20),
  compare_at_price decimal(10,2),
  created_at timestamp,
  fulfillment_service varchar(30),
  weight bigint unsigned,
  variant_id bigint unsigned NOT NULL,
  image_id bigint unsigned,
  inventory_item_id bigint unsigned,
  inventory_management varchar(20),
  inventory_policy varchar(20),
  inventory_quantity bigint unsigned,
  options varchar(200),
  price decimal(10,2) unsigned NOT NULL DEFAULT 0,
  product_id bigint unsigned,
  title varchar(100),
  updated_at timestamp,
  weight_unit varchar(10),
  CONSTRAINT variant_id PRIMARY KEY (variant_id)
);


/* DROP TABLE */

DROP TABLE product_image;



/* CREATE TABLE */

CREATE TABLE product_image
(
  created_at timestamp,
  image_id bigint unsigned NOT NULL,
  position bigint unsigned,
  product_id bigint unsigned,
  variant_id bigint unsigned,
  src blob,
  width bigint unsigned,
  height bigint unsigned,
  updated_at timestamp,
  CONSTRAINT image_id PRIMARY KEY (image_id)
);
