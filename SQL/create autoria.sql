CREATE TABLE IF NOT EXISTS autoria (
	
	id_pub int NOT NULL,
    id_autor int NOT NULL,

	PRIMARY KEY (id_pub, id_autor),
    FOREIGN KEY (id_pub) REFERENCES publicacao(id),
    FOREIGN KEY (id_autor) REFERENCES autor(id)
);