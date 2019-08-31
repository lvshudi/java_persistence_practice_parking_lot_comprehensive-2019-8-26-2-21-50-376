CREATE TABLE parkingboy (
  employee_id VARCHAR(32) PRIMARY KEY  NOT NULL
);

CREATE TABLE parkinglot (
  parkinglot_id VARCHAR(32) PRIMARY KEY  NOT NULL,
  employee_id varchar(32) 
);

insert into parkingboy values ('001');
insert into parkingboy values ('002');
insert into parkingboy values ('003');

insert into parkinglot values('001','001');
insert into parkinglot values('002','001');
insert into parkinglot values('003','001');
insert into parkinglot (parkinglot_id) values('004');
