INSERT INTO USERS(ID, NAME, NIF, FIRST_SURNAME, SECOND_SURNAME, EMAIL, PASSWORD,CREATED_AT, UPDATE_AT, CREATED_BY,UPDATE_BY,ID_STATE)
VALUES(1,'jhon', '123456789', 'rojas', 'silva', 'jprojas.ext@serikat.com','serikat1','2023-06-10','2023-06-10',1,1 ,1);

INSERT INTO USERS(ID, NAME, NIF,  FIRST_SURNAME, SECOND_SURNAME, EMAIL, PASSWORD, CREATED_AT, UPDATE_AT, CREATED_BY,UPDATE_BY,ID_STATE)
VALUES(2,'juan', '123456788',  'aponte', 'caceres', 'jacaceres.ext@serikat.com','serikat1','2023-06-10','2023-06-10',1,1 ,1);

INSERT INTO USERS(ID, NAME, NIF,  FIRST_SURNAME, SECOND_SURNAME, EMAIL, PASSWORD, CREATED_AT, UPDATE_AT, CREATED_BY,UPDATE_BY,ID_STATE)
VALUES(3,'luis', '123456787',  'mora', 'rey', 'lmrey.ext@serikat.com', 'serikat1','2023-06-10','2023-06-10',1,1 ,1);

INSERT INTO USERS(ID, NAME, NIF,  FIRST_SURNAME, SECOND_SURNAME, EMAIL, PASSWORD, CREATED_AT, UPDATE_AT, CREATED_BY,UPDATE_BY,ID_STATE)
VALUES(4,'denys', '123456786',  'moreno', 'rodriguez', 'dmrodriguez.ext@serikat.com', 'serikat1','2023-06-10','2023-06-10',1,1 ,1);

INSERT INTO USERS(ID, NAME, NIF,  FIRST_SURNAME, SECOND_SURNAME, EMAIL, PASSWORD, CREATED_AT, UPDATE_AT, CREATED_BY,UPDATE_BY,ID_STATE)
VALUES(5,'pedro', '123456785',  'rojas', 'soto', 'prsoto.ext@serikat.com', 'serikat1','2023-06-10','2023-06-10',1,1 ,1);

ALTER SEQUENCE seq_users RESTART WITH 6;