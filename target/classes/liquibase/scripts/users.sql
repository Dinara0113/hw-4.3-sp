--liquibase formatted sql
--changeset dallanazarova:1
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email TEXT
);


--changeset dallanazarova:2
ALTER TABLE users
ADD COLUMN name TEXT;


--changeset dallanazarova:3
CREATE INDEX users_name_index ON users (name);
