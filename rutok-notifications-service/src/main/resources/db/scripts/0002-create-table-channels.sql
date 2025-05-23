create table if not exists channels
(
    id   bigserial primary key,
    name varchar(50) not null unique
)