create table if not exists templates
(
    id               bigserial primary key,
    channel_id       bigint not null,
    type_id          bigint not null,
    title_template   varchar(50),
    message_template varchar(255),
    foreign key (channel_id) references channels (id),
    foreign key (type_id) references types (id)
)