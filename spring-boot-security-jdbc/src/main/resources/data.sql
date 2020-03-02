
INSERT INTO my_users(username,password,enabled) values('user','pass',true);
INSERT INTO my_users(username,password,enabled) values('admin','pass',true);

INSERT INTO my_authorities(username,authority) values('user','ROLE_USER');
INSERT INTO my_authorities(username,authority) values('admin','ROLE_ADMIN');
