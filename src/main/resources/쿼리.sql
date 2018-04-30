

use mydb;

create table stdtable(
	stdId int(20) primary key auto_increment,
	stdName varchar(20) not null,
    major varchar(20) not null,
    grade varchar(20),
    joindate date
);
insert into stdtable values('1','1st','20170101','computer science','최성찬');

insert into stdtable values('2','4th','20150201','computer science','이민교');

insert into stdtable values('3','2th','20140103','computer science','김동현');

insert into stdtable values('4','3th','20110102','Jounalism','손민정');

insert into stdtable values('5','3th','20170401','accounting','박수연');

insert into stdtable values('6','3th','20170401','computer science','이경민');

commit;

select * from stdtable;


drop table stdtable;





