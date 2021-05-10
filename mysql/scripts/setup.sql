drop database if exists central;

create database if not exists central;

use central;

create table colleges
(college_id int primary key auto_increment,
short_name varchar(5) not null unique,
full_name varchar(50) not null unique,
join_date date not null);

insert into colleges (short_name, full_name, join_date) values
('LGA', 'LaGuardia Community College', '1990-01-01'),
('BKC', 'Brooklyn College', '1991-01-01'),
('BXC', 'Bronx Community College', '1993-05-01'),
('CSI', 'College of Staten Island', '1996-01-01'),
('JJCC', 'John Jay College of Criminal Justice', '1991-03-01');