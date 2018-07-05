--removes any table named people if they already exist, clearing the way for a new table
DROP TABLE people IF EXISTS;

--obviously creates a new table
CREATE TABLE people (

    --new column named person_id, BIGINT variable type, cannot by null, is the primary key
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    --new column named first_name, at variable character with a 20 character limit
    first_name VARCHAR(20),
    --new column named last_name, at variable character with a 20 character limit
    last_name VARCHAR(20)
);