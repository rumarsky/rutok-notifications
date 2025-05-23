create table if not exists user_settings
(
    user_id    bigint not null,
    type_id    bigint not null ,
    is_enabled boolean,
    foreign key (type_id) references types (id),
    primary key (user_id, type_id)
)