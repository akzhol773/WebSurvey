create table if not exists product
(
    id          bigint generated by default as identity
    primary key,
    description varchar(255),
    name        varchar(255)
    );

alter table product
    owner to "user";