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