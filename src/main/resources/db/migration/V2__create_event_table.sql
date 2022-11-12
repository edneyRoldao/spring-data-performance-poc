CREATE TABLE IF NOT EXISTS event (
    id          INT NOT NULL AUTO_INCREMENT  PRIMARY KEY    ,
    status      VARCHAR(255)                                ,
    created_at  DATETIME
) ENGINE = InnoDB;
