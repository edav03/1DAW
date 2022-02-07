Create Table Alumnes
(Nexpd  char(4) Primary Key,
 Edat int2,
 Nom VarChar(30),
 Tlf char(9),
 Pes numeric(4,1));

Create Table Assignatures
( CodAssig char(4)  Primary Key,
  Descripcio varchar(56));

Create Table Notes
( Nexpd  char(4)  References Alumnes,
  CodAssig  char(4)  References Assignatures,
  Nota numeric(4,2),
  Primary Key (Nexpd, CodAssig) );

insert into Assignatures values ('PLE', 'Programacio llenguatges estructurats');
insert into Assignatures values ('SOP', 'Sistemes operatius');
insert into Assignatures values ('ANA1', 'Analisi i disseny detallat apl. infor.');
insert into Assignatures values ('ANA2', 'Desenvolupament aplic. entorns 4 gen.eines CASE');
insert into Assignatures values ('FOL', 'Formacio i orientacio laboral');
insert into Assignatures values ('RET', 'Relacions entorn de treball');
insert into Assignatures values ('DRPG', 'Disseny i realitzacio serveis presen.entorns grafics');

insert into Assignatures values ('SIMM', 'Sistemes informatics monousuari i multiusuari');
insert into Assignatures values ('XAL', 'Xarxes Area Local');
insert into Assignatures values ('FP', 'Fonaments de programacio');
insert into Assignatures values ('IAIG', 'Implantacio de aplicacions informatiques de gestio');
insert into Assignatures values ('DFSI', 'Desenvolupament de funcions en el sistema informatic');
insert into Assignatures values ('SGBD', 'Sistemes gestors de bases de dades');

insert into Assignatures values ('FCT', 'Relacions entorn de treball');

INSERT INTO Alumnes VALUES ('0001',20,'Lorenso','962871313',84);
INSERT INTO Alumnes VALUES ('0002',NULL,'Andreu','962866969',NULL);
INSERT INTO Alumnes VALUES ('0003',50,NULL,'962871313',70);
INSERT INTO Alumnes VALUES ('0004',34,'Pere','686999545',NULL);
INSERT INTO Alumnes VALUES ('0005',26,'Pau','962957524',85);
INSERT INTO Alumnes (Nexpd,Nom,Edat) VALUES('0006','Dolores',25);
INSERT INTO Alumnes (Nexpd,Nom,Pes) VALUES('0007','Sandalia',80.5);
INSERT INTO Alumnes (Nexpd,Nom,Pes) VALUES('0008',NULL,55.5);
INSERT INTO Alumnes (Nexpd,Nom,Pes,Tlf) VALUES('0009','Pepa',130.3,'962453659');
INSERT INTO Alumnes (Nexpd,Nom,Edat,Tlf,Pes) VALUES('0010','Carmen',29,'962453659',50);
INSERT INTO Alumnes (Nexpd,Nom,Edat) VALUES ('0011','Vicent',24);
INSERT INTO Alumnes (Nexpd,Nom,Tlf,Pes) VALUES ('0012','Josep',962820022,71.3);
INSERT INTO Alumnes (Nexpd,Nom,Edat,Tlf,Pes) VALUES ('0013','Pilar',24,962412132,54.3);
INSERT INTO Alumnes (Nexpd,Pes,Edat) VALUES ('0014',79.8,26);
INSERT INTO Alumnes (Nexpd,Nom,Pes) VALUES ('0015','Laura',56);
INSERT INTO Alumnes VALUES ('0016',22,'Anna',NULL,60);
INSERT INTO Alumnes VALUES ('0017',19,'Miquel','961234569',75);
INSERT INTO Alumnes VALUES ('0018',NULL,NULL,NULL,NULL);
INSERT INTO Alumnes VALUES ('0019',20,'Rosa',NULL,59);
INSERT INTO Alumnes VALUES ('0020',21,'Arnau','965571930',NULL);

insert into Notes values('0001', 'PLE', 8);
insert into Notes values('0001', 'SOP', 3.2);
insert into Notes values('0001', 'ANA2');
insert into Notes values('0001', 'FCT');
insert into Notes values('0002', 'SOP', 8);
insert into Notes values('0002', 'ANA1');
insert into Notes values('0002', 'FOL', 9.5);
insert into Notes values('0002', 'FCT');
insert into Notes values('0002', 'RET', 10);
insert into Notes values('0002', 'DRPG', 5.08);
insert into Notes values('0003', 'PLE', 8);
insert into Notes values('0003', 'DRPG', 2.1);
insert into Notes values('0005', 'PLE', 3);
insert into Notes values('0005', 'SOP', 4);
insert into Notes values('0005', 'FOL', 2.5);
insert into Notes values('0006', 'PLE');
insert into Notes values('0006', 'SOP', 7.69);
insert into Notes values('0006', 'ANA1', 5.05);
insert into Notes values('0006', 'ANA2', 8.5);
insert into Notes values('0006', 'FOL', 6.6);
insert into Notes values('0006', 'RET', 9.9);
insert into Notes values('0006', 'DRPG', 7.8);
insert into Notes values('0007', 'PLE');
insert into Notes values('0007', 'FOL');
insert into Notes values('0007', 'RET');
insert into Notes values('0008', 'PLE', 0);
insert into Notes values('0008', 'SOP', 0);
insert into Notes values('0009', 'PLE', 8);
insert into Notes values('0009', 'ANA1', 5.69);
insert into Notes values('0009', 'ANA2', 4.4);
insert into Notes values('0010', 'PLE', 10);
insert into Notes values('0010', 'SOP', 8);
insert into Notes values('0010', 'ANA1', 8);
insert into Notes values('0010', 'FOL', 6.00);
insert into Notes values('0010', 'DRPG', 7.99);
insert into Notes values('0011', 'FOL', 5.88);
insert into Notes values('0011', 'FCT', 5.88);
insert into Notes values('0011', 'RET', 1.9);
insert into Notes values('0013', 'PLE', 6.9);
insert into Notes values('0013', 'SOP', 08.06);
insert into Notes values('0013', 'DRPG', 007.1);
insert into Notes values('0014', 'PLE', 8.69);
insert into Notes values('0015', 'PLE', 9.70);
insert into Notes values('0016', 'XAL', 7.70);
insert into Notes values('0016', 'SIMM',3.6);
insert into Notes values('0016', 'FOL',NULL);
insert into Notes values('0016', 'RET',8.8);
insert into Notes values('0016', 'FP', 6);
insert into Notes values('0017', 'XAL', 7.70);
insert into Notes values('0017', 'SIMM',NULL);
insert into Notes values('0017', 'FOL',NULL);
insert into Notes values('0017', 'RET',NULL);
insert into Notes values('0017', 'FP', 6);
insert into Notes values('0018', 'XAL', NULL);
insert into Notes values('0018', 'FOL', 9);
insert into Notes values('0018', 'RET', 10);
insert into Notes values('0018', 'SIMM',4.2);
insert into Notes values('0018', 'FP', 7);
insert into Notes values('0019', 'DFSI', 6.5);
insert into Notes values('0019', 'SGBD',7);
insert into Notes values('0019', 'IAIG', 5);
insert into Notes values('0019', 'FCT', NULL);
insert into Notes values('0020', 'DFSI', 6.5);
insert into Notes values('0020', 'SGBD',7);
insert into Notes values('0020', 'IAIG', 5);
insert into Notes values('0020', 'FCT', NULL);

