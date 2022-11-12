CREATE TABLE IF NOT EXISTS bank_account (
    id              INT NOT NULL AUTO_INCREMENT  PRIMARY KEY    ,
    client_name     VARCHAR(255)                                ,
    client_document VARCHAR(255)                                ,
    account_type    VARCHAR(255)                                ,
    created_at      DATETIME                                    ,
    balance         DECIMAL(12, 2)
) ENGINE = InnoDB;
