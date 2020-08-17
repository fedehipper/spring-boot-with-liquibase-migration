--liquibase formatted sql

--changeset fedehipper:1 
CREATE TABLE persona (
    id BIGSERIAL PRIMARY KEY,
    nombre_completo VARCHAR,
    edad INT
);
--rollback drop table persona;  