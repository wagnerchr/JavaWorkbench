CREATE DATABASE compromissos;
USE compromissos;
# DROP DATABASE compromissos;

# ---------- CADASTRO ----------

CREATE TABLE cadastro (

  id int NOT NULL AUTO_INCREMENT,
  login VARCHAR(45) UNIQUE  NOT NULL,
  
  nome varchar(90) NOT NULL,
  data_nasc DATE NOT NULL,
  endereco varchar(90) NOT NULL,
  telefone varchar(45) UNIQUE NOT NULL,
  email varchar(45) UNIQUE NOT NULL,
  senha varchar(45) NOT NULL,
  
  PRIMARY KEY (id)
);

CREATE TABLE compromisso (

  id int NOT NULL AUTO_INCREMENT,
  
  nome varchar(90) NOT NULL,
  descricao varchar(150) DEFAULT NULL,
  data_inicio datetime NOT NULL,
  data_fim datetime NOT NULL,
  
  PRIMARY KEY (id)
);

CREATE TABLE  cadastro_compromisso(
	cadastro_id int DEFAULT NULL,
    compromisso_id int DEFAULT NULL,
    
    FOREIGN KEY (cadastro_id) REFERENCES cadastro(id),
    FOREIGN KEY (compromisso_id) REFERENCES compromisso(id)
);

##

# ---------- Contato ----------

CREATE TABLE contato (

  id int NOT NULL AUTO_INCREMENT,
  
  nome varchar(90) NOT NULL,
  data_nasc date NOT NULL,
  endereco varchar(90) NOT NULL,
  
  PRIMARY KEY (id)
); 

CREATE TABLE cadastro_contato(
	
    cadastro_id int DEFAULT NULL,
    contato_id int DEFAULT NULL,
    
    FOREIGN KEY(cadastro_id) REFERENCES cadastro(id),
    FOREIGN KEY(contato_id) REFERENCES contato(id)
);


CREATE TABLE contato_compromisso (
  contato_id int DEFAULT NULL,
  compromisso_id int DEFAULT NULL,

  FOREIGN KEY (contato_id) REFERENCES contato(id),
  FOREIGN KEY (compromisso_id) REFERENCES compromisso(id)
);

CREATE TABLE contato_email (
  email varchar(45) NOT NULL,
  
  contato_id int DEFAULT NULL,
  
  FOREIGN KEY (contato_id) REFERENCES contato(id)
);

CREATE TABLE contato_telefone (
  telefone varchar(45) NOT NULL,
  contato_id int DEFAULT NULL,
  
  FOREIGN KEY (contato_id) REFERENCES contato(id)
);

# ---------- GRUPOS ----------

CREATE TABLE grupo (
  id int NOT NULL AUTO_INCREMENT,
  nome varchar(45) NOT NULL,
  
  PRIMARY KEY (id)
);

CREATE TABLE cadastro_grupo(
	cadastro_id int,
    grupo_id int,
    
    FOREIGN KEY(cadastro_id) REFERENCES cadastro(id),
    FOREIGN KEY(grupo_id) REFERENCES grupo(id)
);

CREATE TABLE contato_grupo (
  contato_id int,
  grupo_id int,
  
  FOREIGN KEY (contato_id) REFERENCES contato(id),
  FOREIGN KEY (grupo_id) REFERENCES grupo(id)
);




/*
INSERT INTO `grupo` VALUES (1,'Grupo da faculdade'),(2,'Grupo do ZAP'),(3,'Grupo do Academia');
INSERT INTO `compromisso_contato` VALUES (1,1);
*/

/*
INSERT INTO `cadastro` VALUES (1,'Wagner','2001-01-17','AVENIDA SEI LÁ','123456','email@email.com','1233455',NULL),(2,'Christos','2001-01-17','AVENIDA SEI LÁ','123456','email@email.com','1233455',NULL),(3,'Korres','3213-12-12','dsadas','23131231','321','321321',NULL),(4,'Korres','3213-12-12','dsadas','23131231','321','321321',NULL),(5,'Wagzin','2222-11-12','Wagzin','12','12','12',NULL);
INSERT INTO `compromisso` VALUES (1,'FESTA DO JAPA','SIM, [E A FESTA DO JEPRA','2000-12-12 12:12:12','2000-12-12 12:13:12');
*/

#INSERT INTO `contato` VALUES (1,'WAGNER','2001-12-12','SEI LÁ',NULL),(2,'WAGNER','2001-12-12','SEI LÁ',NULL),(3,'christos','2001-12-12','SEI LÁ',NULL),(4,'korres','2001-12-12','SEI LÁ',NULL);


# ----------- INSERTS ----------

DESCRIBE cadastro;

INSERT INTO cadastro VALUES(NULL, "WAqRR", "Wagner Christos", "1978-12-12", "Uma avenida ai", "1233322", "email@email", "senha daora");
INSERT INTO cadastro VALUES(NULL, "aaaaaa", "Nome nome nome", "2000-10-12", "Uma avenida ai", "12333222", "email2@email", "senha daora");
INSERT INTO cadastro VALUES(NULL, "'-'", "Wagner Christos", "1978-12-12", "Uma avenida ai", "123332222", "email3@email", "senha daora");

DESCRIBE compromisso;

INSERT INTO compromisso VALUES(NULL, "Faculdade", "É O GRUPO DA FACULDADE po", "2022-11-10 23:24:24", "2024-06-01 00:30:02");
INSERT INTO compromisso VALUES(NULL, "Família", "aaaaaaaaaaaaa", "2023-11-10 23:24:24", "2024-06-01 00:30:02");
INSERT INTO compromisso VALUES(NULL, "dos cria", NULL, "2022-11-10 23:24:24", "2024-06-01 00:30:02");

SELECT * FROM compromisso;

DESCRIBE cadastro_compromisso;

INSERT INTO cadastro_compromisso VALUES(1, 4);

SELECT * FROM cadastro_compromisso;

SELECT * from compromisso cm 
	INNER JOIN cadastro_compromisso cc ON cm.id = cc.compromisso_id
    INNER JOIN cadastro c ON cc.cadastro_id = c.id
		WHERE cc.cadastro_id = 1;


