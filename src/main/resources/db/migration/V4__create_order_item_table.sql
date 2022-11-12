CREATE TABLE IF NOT EXISTS items (
id                    BIGINT    NOT NULL AUTO_INCREMENT PRIMARY KEY ,
order_id              BIGINT    NOT NULL                            ,
product_id            BIGINT    NOT NULL                            ,
price                 INT       NOT NULL                            ,
quantity              INT       NOT NULL                            ,
KEY        FK_items_order_id (order_id)                             ,
CONSTRAINT FK_items_order_id FOREIGN KEY (order_id) REFERENCES orders (id)
) ENGINE = InnoDB;
