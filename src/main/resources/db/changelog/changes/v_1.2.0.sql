--liquibase formatted sql

--changeset fedehipper:2
CREATE TABLE materia (
    id BIGSERIAL PRIMARY KEY,
    codigo VARCHAR,
    nombre VARCHAR
);
--rollback drop table materia;