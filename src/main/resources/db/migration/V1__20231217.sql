CREATE TABLE IF NOT EXISTS users
(
    id         SERIAL PRIMARY KEY,
    username   VARCHAR(64)   NOT NULL UNIQUE,
    password   VARCHAR(2048) NOT NULL,
    role       VARCHAR(32)   NOT NULL,
    status     VARCHAR(10)   NOT NULL,
    created_at TIMESTAMP     NOT NULL,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS files
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(64) NOT NULL,
    location   VARCHAR     NOT NULL,
    status     VARCHAR(10) NOT NULL,
    created_at TIMESTAMP   NOT NULL,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS events
(
    id         SERIAL PRIMARY KEY,
    type       VARCHAR(10) NOT NULL,
    user_id    BIGINT      NOT NULL,
    file_id    BIGINT      NOT NULL,
    status     VARCHAR(10) NOT NULL,
    created_at TIMESTAMP   NOT NULL,
    deleted_at TIMESTAMP
);