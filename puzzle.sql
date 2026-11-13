CREATE DATABASE IF NOT EXISTS puzzle;
USE puzzle;

CREATE TABLE puzzle_sv (
    puzzle_estructura VARCHAR(2000) NOT NULL;
    image LONGTEXT NOT NULL

);

INSERT INTO puzzle_sv (
    puzzle_estructura,
    image
)VALUES('','');

SELECT * FROM puzzle_sv