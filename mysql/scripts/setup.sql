drop schema if exists central;

create schema if not exists central;

use central;

create table colleges
(college_id int primary key auto_increment,
short_name varchar(5) not null unique,
full_name varchar(50) not null unique,
join_date date not null);

create table catalogs
(catalog_id int primary key auto_increment,
catalog_name varchar(5) not null unique,
description varchar(500) not null unique);

insert into colleges (short_name, full_name, join_date) values
('LGA', 'LaGuardia Community College', '1990-01-01'),
('BKC', 'Brooklyn College', '1991-01-01'),
('BXC', 'Bronx Community College', '1993-05-01'),
('CSI', 'College of Staten Island', '1996-01-01'),
('JJCC', 'John Jay College of Criminal Justice', '1991-03-01');

insert into catalogs (catalog_name, description) values
('CSCI', 'Any course under this catalog must courses in relation to computer science and its related fields and technology.'),
('MAT', 'Any course under this catalog must courses in relation to mathematics and its related fields.'),
('BIO', 'Any course under this catalog must courses in relation to biology and its related fields.');