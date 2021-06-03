create table posts
(
    id          serial primary key,
    name        varchar(2000),
    description text,
    created     timestamp without time zone not null default now()
);

CREATE TABLE users
(
    id       serial primary key,
    username VARCHAR(50)  NOT NULL unique,
    email    text         NOT NULL,
    password VARCHAR(100) NOT NULL,
    enabled  boolean default true

);

insert into users (username, email, password)
values ('maksimus', 'maksimsu.s@mail.ru', 'maksimus');

create table authorities
(
    id        serial primary key,
    authority VARCHAR(50) NOT NULL
);
ALTER TABLE users
    (
    ADD COLUMN authority_id INT
    REFERENCES authorities (id)
    );


insert into authorities (authority)
values ('ADMIN'),
       ('USER');


UPDATE users
SET authority_id = 1;

UPDATE users
SET authority_id = 2
WHERE id = 2;