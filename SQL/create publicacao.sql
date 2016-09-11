CREATE TABLE IF NOT EXISTS publicacao (
	
	id int NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(255) NOT NULL,
	paginaInicial int NOT NULL,
	paginaFinal int NOT NULL,
	dataPublicacao DATETIME NOT NULL,

	PRIMARY KEY (id)
);