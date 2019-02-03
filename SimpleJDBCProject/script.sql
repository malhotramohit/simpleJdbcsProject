
CREATE SEQUENCE UserData_id_seq;
 
CREATE TABLE UserData (
    user_id integer NOT NULL DEFAULT nextval('table_name_id_seq')
);
 
ALTER SEQUENCE UserData_id_seq
OWNED BY table_name.id;

CREATE TABLE UserData(
 user_id serial PRIMARY KEY,
 username VARCHAR (50) ,
 dateOfBirth TIMESTAMP NOT NULL
);



select * from UserData;

insert into UserData values (UserData.nextVal,'Mohit',2019-02-02)

select * from UserData where user_id = 8;

INSERT INTO UserData(user_id,username,dateOfBirth) 
VALUES (DEFAULT,'Mohit','2001-02-16 20:38:40');

