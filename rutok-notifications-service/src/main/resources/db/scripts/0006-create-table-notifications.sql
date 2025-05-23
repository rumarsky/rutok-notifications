create table if not exists notifications
(
    id          bigserial primary key,
    user_id     bigint      not null,
    type_id bigint      not null,
    title       varchar(50) not null,
    message     varchar(255),
    status      varchar(50) not null,
    sent_at     timestamptz not null,
    foreign key(type_id) references types(id)
)