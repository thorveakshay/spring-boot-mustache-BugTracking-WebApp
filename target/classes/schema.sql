DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  created_date DATE NOT NULL,
  PRIMARY KEY (id));
  
  