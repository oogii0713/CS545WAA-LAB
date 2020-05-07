INSERT INTO ROLE(role_id, role) VALUES (1, 'ROLE_USER');
INSERT INTO ROLE(role_id, role) VALUES (2, 'ROLE_ADMIN');

INSERT into USER (user_id, username, password, active) values (1, 'user', '$2a$10$9ApPhLvCiogWxuArMV.MU.TpvydUpk6gkBQF2bKF7Y7.zs0YpG8ni', 1);
INSERT into USER (user_id, username, password, active) values (2, 'admin', '$2a$10$QcejBumgBsKyjSLgsYN2keimlWBPyfnhQr.pjQwQiTfjnDGWSO.yi', 1);

insert into user_role(user_id, role_id) values (1, 1);
insert into user_role(user_id, role_id) values (2, 2);

INSERT INTO ADDRESS (id, city, state, street, zip_code) VALUES (102, 'FairField', 'IA', '1000 N 4th', '52577');
INSERT INTO EMPLOYEE (ID, BIRTH_DATE, EMPLOYEE_NUMBER, FIRST_NAME, LAST_NAME, SALARY_LEVEL, ADDRESS_ID) VALUES (101, '1999-12-27', 1, 'Otgonbayar', 'Mijiddorj', 2, 102);
INSERT INTO ADDRESS (id, city, state, street, zip_code) VALUES (104, 'FairField', 'IA', '1000 N 4th', '52577');
INSERT INTO EMPLOYEE (ID, BIRTH_DATE, EMPLOYEE_NUMBER, FIRST_NAME, LAST_NAME, SALARY_LEVEL, ADDRESS_ID) VALUES (103, '1987-12-27', 2, 'Oogii', 'M', 1, 104);
INSERT INTO ADDRESS (id, city, state, street, zip_code) VALUES (106, 'FairField', 'IA', '1000 N 5th', '52576');
INSERT INTO EMPLOYEE (ID, BIRTH_DATE, EMPLOYEE_NUMBER, FIRST_NAME, LAST_NAME, SALARY_LEVEL, ADDRESS_ID) VALUES (105, '1983-12-27', 3, 'Bat-Uya', 'BayUya', 2, 106);