INSERT INTO legislation(ID, NAME, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'legislation',1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_legislation RESTART WITH 2;

INSERT INTO public_laboratories(ID, NAME, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'laboratorio publico',1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_public_laboratories RESTART WITH 2;

INSERT INTO role(ID, ROLE, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'role',1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_role RESTART WITH 2;

INSERT INTO authorityDGC(ID, DIRECTION_NAME, COMUNIDAD_AUTONOMA, CONCIERGE, ADDRESS, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'direccion general', 'comunidad autonoma', 'conserje', 'direccion', 1, LOCALTIMESTAMP, LOCALTIMESTAMP, 1, 1);

ALTER SEQUENCE seq_authorityDGC RESTART WITH 2;

INSERT INTO national_authority(ID, NAME, MINISTRY,MINISTRY_ACRONYM,GENERAL_DIRECTION,DEPUTY_DIRECTORATE,LEGISLATION_ID,AREA_RESPONSABILITY,COMMENTS_AREA_RESPONSABILITY,COMMITTEE,POSTAL_ADDRESS,WEB,LEGAL_REFER_FUNCT_AUTHORITY,ICSMS,TYPE_AUTHORITY,PUBLIC_LAB_ID,GENERAL_COMMENTS,ID_STATE,CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'authorityOEU', 'ministerio','acronimo','direccion general','subdireccion',1,'area de responsabilidad','comentarios area de responsabilidad','comite','direccion postal','link web','Referencia legal a las funciones de la autoridad',1234,'centralizada/descentralizada',1,'comentarios generales',1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_national_authority RESTART WITH 2;

INSERT INTO users(ID, NAME, FIRST_SURNAME, SECOND_SURNAME, NIF, POSITION, AREA_RESPONSABILITY, ROLE_ID, AUTHORITY_ID, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY, ID_STATE)
VALUES(1, 'jhon', 'rojas', 'silva', '123456789', 'position', 'area_respo', 1, 1, LOCALTIMESTAMP, LOCALTIMESTAMP, 1, 1, 1);

ALTER SEQUENCE seq_user RESTART WITH 2;

INSERT INTO email(ID, EMAIL, USERS_ID, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'jhon@correo.com',1,1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_email RESTART WITH 2;

INSERT INTO phone(ID, PHONE, USERS_ID, ID_STATE, CREATED_AT, UPDATED_AT, CREATED_BY, UPDATED_BY)
VALUES(1,'123456789',1,1,LOCALTIMESTAMP,LOCALTIMESTAMP,1,1);

ALTER SEQUENCE seq_phone RESTART WITH 2;




