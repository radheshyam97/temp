create table vehicle_type_tbl(
vehicle_type int primary key auto_increment,
vehile_desc varchar(30)
);

INSERT INTO vehicle_type_tbl(vehicle_type,vehile_desc) 
VALUES(101,'Two Vehiler'),(102,'Three Vehiler'),(103,'Four Vehiler');

create table vehicle_mnfg_comp_tbl(
comp_id int primary key auto_increment,
comp_name varchar(30)
);

 INSERT INTO vehicle_mnfg_comp_tbl(comp_id,comp_name)
 VALUES
 (201,'Hero'),
 (202,'Honda'),
 (203,'Bajaj'),
 (204,'Royal Enfield'),
 (205,'Suzuki');
 
 
create table vehicle_model_tbl(
model_id int primary key auto_increment,
vehicle_type int,
comp_id int,
model_name varchar(100),
model_desc varchar(200)
);

 
 
  
 
 