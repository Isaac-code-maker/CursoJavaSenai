

CREATE DATABASE IF NOT EXISTS CLINICA2;

USE CLINICA2;

CREATE TABLE MEDICO(
	NUMEROCRM BIGINT NOT NULL,
    ESTADOCRM CHAR(2) NOT NULL,
    NOMEMED VARCHAR(100) NOT NULL,
    
    CONSTRAINT MEDICO_PK PRIMARY KEY (NUMEROCRM, ESTADOCRM)
)ENGINE =INNODB;

CREATE TABLE PACIENTE(
	ID INT NOT NULL AUTO_INCREMENT,
    SEXO ENUM('M','F') NOT NULL,
    CIDADE VARCHAR(30) NOT NULL,
    ESTADO CHAR(2) NOT NULL,
    COMPLEMENTO VARCHAR(100),
    CEP BIGINT NOT NULL,
    DATANASCIMENTO DATE NOT NULL,
    NOMEPACIENTE VARCHAR(100) NOT NULL,
    CONSTRAINT PACIENTE_PK PRIMARY KEY(ID)
)ENGINE = INNODB;

CREATE TABLE ESPECIALIDADE(
	NOMEESPECIALIDADE VARCHAR(30) NOT NULL,
    IDESPECIALIDADE INT NOT NULL AUTO_INCREMENT,
    CONSTRAINT ESPECILAIDA_PK PRIMARY KEY (IDESPECIALIDADE)
) ENGINE = INNODB;

CREATE TABLE POSSUIESPECIALIDADE(
	IDESPECIALIDADE INT NOT NULL,
    NUMEROCRM BIGINT NOT NULL,
    ESTADOCRM CHAR(2) NOT NULL,
    
    CONSTRAINT POSSUI_ESPECIALIDADE_UK UNIQUE(IDESPECIALIDADE, NUMEROCRM, ESTADOCRM),
    
    CONSTRAINT POSSUI_MEDICO_FK FOREIGN  KEY(NUMEROCRM, ESTADOCRM) 
		REFERENCES MEDICO(NUMEROCRM, ESTADOCRM)
			ON DELETE CASCADE,
	CONSTRAINT POSSUI_ESPECIALIDADE_FK FOREIGN KEY(IDESPECIALIDADE)
		REFERENCES ESPECIALIDADE(IDESPECIALIDADE)
			ON DELETE CASCADE
    
)ENGINE = INNODB;

CREATE TABLE CONSULTA(
	IDCONSULTA INT NOT NULL AUTO_INCREMENT,
    DATAHORA TIMESTAMP NOT NULL,
    NUMEROCRM BIGINT NOT NULL,
    ESTADOCRM CHAR(2) NOT NULL,
    IDPACIENTE INT NOT NULL,
    
    CONSTRAINT CONSULTA_PK PRIMARY KEY (IDCONSULTA),
    CONSTRAINT CONSULTA_MEDICO_FK FOREIGN  KEY(NUMEROCRM, ESTADOCRM) 
		REFERENCES MEDICO(NUMEROCRM, ESTADOCRM)
			ON DELETE CASCADE,
	CONSTRAINT CONSULTA_PACIENTE_FK FOREIGN KEY (IDPACIENTE)
		REFERENCES PACIENTE(ID)
			ON DELETE CASCADE
)ENGINE = INNODB;

CREATE TABLE TELEFONE(
	TELEFONE DECIMAL(11) NOT NULL,
    IDPACIENTE INT NOT NULL,
    
    CONSTRAINT TELEFONE_UK UNIQUE(TELEFONE, IDPACIENTE),
    
    CONSTRAINT TELEFONE_PACIENTE_FK FOREIGN KEY (IDPACIENTE)
		REFERENCES PACIENTE(ID)
			ON DELETE CASCADE
)ENGINE = INNODB;

CREATE TABLE RECEITA(
	IDCONSULTA INT NOT NULL,
    IDRECEITA INT NOT NULL AUTO_INCREMENT,
    DESCRICAO VARCHAR(200),
    
    CONSTRAINT IDRECEITA_PK PRIMARY KEY (IDRECEITA),
    CONSTRAINT IDCONSULTA_FK FOREIGN KEY (IDCONSULTA)
		REFERENCES CONSULTA(IDCONSULTA)
			ON DELETE CASCADE
)ENGINE = INNODB;

CREATE TABLE MEDICAMENTOPRES(
	MEDICAMENTO VARCHAR(50) NOT NULL,
    IDRECEITA INT NOT NULL,
    
    CONSTRAINT IDRECEITA_FK FOREIGN KEY (IDRECEITA)
		REFERENCES RECEITA(IDRECEITA)
			ON DELETE CASCADE
            
)ENGINE = INNODB;