--liquibase formatted sql

--changeset fedehipper:3
ALTER TABLE materia ADD COLUMN especialidad VARCHAR DEFAULT NULL;
--rollback ALTER TABLE materia DROP COLUMN especialidad;