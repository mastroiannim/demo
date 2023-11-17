/*create table IF NOT EXISTS AUTHOR(
  ID int not null AUTO_INCREMENT,
  name varchar(100) not null,
  surname varchar(100) not null,
  PRIMARY KEY ( ID )
);

create table IF NOT EXISTS BOOK(
  ID int not null AUTO_INCREMENT,
  title varchar(100) not null,
  author int not null,
  PRIMARY KEY ( ID ),
  FOREIGN KEY ( author ) REFERENCES AUTHOR ( ID )
);
*/