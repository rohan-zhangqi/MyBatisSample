CREATE DATABASE mybatis DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE country (
  id int NOT NULL AUTO_INCREMENT,
  countryname varchar(255) NULL,
  countrycode varchar(255) NULL,
  PRIMARY KEY (id)
);
insert country (countryname, countrycode)
values ('中国','CN'),('美国','us'),('俄罗斯','RU'),
  ('英国','GB'),('法国','FR');