DROP DATABASE mydb;
CREATE DATABASE mydb;
USE mydb;
CREATE TABLE STUDENT(
	  `Id` INT NOT NULL  AUTO_INCREMENT,
	  `Name` VARCHAR(250) NOT NULL,
	  `Course` VARCHAR(150),
	  `Email` VARCHAR(255),
	  PRIMARY KEY (`Id`) );

INSERT INTO mydb.STUDENT VALUE ("1", "Tony Blair", "Algebra","peru@peru.com" );
INSERT INTO mydb.STUDENT VALUE ("2", "Carlos Alcantara", "Razonamiento Matematico","ecuador@ecuador.com" );
INSERT INTO mydb.STUDENT VALUE ("3", "Maria PaloAlto", "Ingles","tumbes@peru.com" );
INSERT INTO mydb.STUDENT VALUE ("4", "Romel Castillo", "Historia","lima@peru.com" );
INSERT INTO mydb.STUDENT VALUE ("5", "Carla Tarazona", "Psicologia","chiclayo@peru.com" );
