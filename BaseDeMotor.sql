create schema barcos;
use barcos;
create table de_motor(
    registro varchar (40) primary key,
	marca varchar (40),
    cantidad_motores int,
    propietario varchar(80),
    autonomia_horas int
);
INSERT INTO de_motor values('IR45678','Airbus Ships',1,'Ship Latina',200); 
INSERT INTO de_motor values('PA48679','BELL',2,'Delfines SA',300); 
INSERT INTO de_motor values('PE48679','JSC RUSSIAN',3,'Condores',350); 
INSERT INTO de_motor values('CO48679','SIKORSKY',2,'Velas de los Andes',280); 
INSERT INTO de_motor values('BR58219','BELL',2,'Pedro Torres',500); 
INSERT INTO de_motor (registro,marca,cantidad_motores,propietario,autonomia_horas) 
VALUES ('BR58245','BELL',3,'Velas de los Andes',190);
UPDATE de_motor SET cantidad_motores =5, autonomia_horas=500 WHERE registro='BR58245'; 
SELECT registro,marca,cantidad_motores,propietario,autonomia_horas FROM de_motor;