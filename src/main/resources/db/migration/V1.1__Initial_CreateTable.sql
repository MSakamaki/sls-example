DROP TABLE IF EXISTS pets_store;

CREATE TABLE pets_store
(
    pet_id INT NOT NULL,
    name TEXT NOT NULL,
    breeds TEXT NOT NULL,
    date_of_birth TEXT NOT NULL
)
    WITH (
        OIDS= FALSE
    );