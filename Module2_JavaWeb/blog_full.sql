create database blog;
use blog;

create table category (
	id_category int auto_increment primary key,
    name_category varchar(255) not null
);

create table blog (
	id_blog int auto_increment primary key,
    title varchar(255) not null,
    recapitulate varchar(255) not null,
    content varchar(255) not null,
    date_post date not null,
    id_category int,
    foreign key (id_category) references category(id_category) on delete cascade
);

drop database blog;