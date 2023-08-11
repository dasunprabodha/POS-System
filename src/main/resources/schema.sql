CREATE TABLE IF NOT EXISTS customer
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    address VARCHAR(250) NOT NULL,
    contact VARCHAR(20)  NOT NULL
);
CREATE TABLE IF NOT EXISTS item
(
    code        VARCHAR(50) PRIMARY KEY,
    description VARCHAR(200)   NOT NULL,
    qty         INT            NOT NULL,
    unit_price  DECIMAL(10, 2)
);