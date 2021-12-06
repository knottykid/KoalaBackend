DROP TABLE IF EXISTS TBL_PROFILES;

CREATE TABLE TBL_PROFILES (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               first_name VARCHAR(250) NOT NULL,
                               last_name VARCHAR(250) NOT NULL,
                               email VARCHAR(250) DEFAULT NULL,
                               join_date VARCHAR NOT NULL,
                               location VARCHAR(250) NOT NULL,
                               bio CLOB NOT NULL,
                               role VARCHAR(250) NOT NULL,
                               team VARCHAR(250) DEFAULT NULL,
                               photo VARCHAR DEFAULT NULL

);