CREATE TABLE IF NOT EXISTS orders (
    id                    BIGINT          NOT NULL AUTO_INCREMENT PRIMARY KEY   ,
    amount                INT             NOT NULL                              ,
    order_status          VARCHAR(30)     NOT NULL                              ,
    created_at            DATETIME        NOT NULL
) ENGINE = InnoDB;
