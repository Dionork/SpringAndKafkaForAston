drop table all_connection;
CREATE TABLE all_connection(
	id BIGINT NOT NULL PRIMARY KEY,
	site VARCHAR (256) NOT NULL,
	dates VARCHAR (256) NOT NULL,
	users VARCHAR (256) NOT NULL);
