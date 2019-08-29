CREATE TABLE parkingboy (
  employee_id VARCHAR(32) PRIMARY KEY  NOT NULL
);

CREATE TABLE parkinglot (
  parkinglot_id VARCHAR(32) PRIMARY KEY  NOT NULL,
  employee_id varchar(32) 
);
