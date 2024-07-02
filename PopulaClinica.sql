-- clinicaPOPULA

USE CLINICA2;

INSERT INTO MEDICO(NUMEROCRM, ESTADOCRM, NOMEMED)
VALUES	(857795,'PE', 'JOÃO JOSE'),
		(745674, 'BA', 'ANA MARIA');
        
INSERT INTO PACIENTE(SEXO, CIDADE, ESTADO, COMPLEMENTO, CEP, DATANASCIMENTO, NOMEPACIENTE)
VALUES ('M', 'Gama', 'DF', '', '72145000', 1990-05-05, 'Andre'),
		('F', 'Gama', 'DF', '', '72145111', 2003-03-12, 'Maria');

INSERT INTO ESPECIALIDADE(NOMEESPECIALIDADE)
VALUES('Clinico geral'),
		('Pediatra'),
        ('Cirurgião');
        
INSERT INTO POSSUIESPECIALIDADE(IDESPECIALIDADE, NUMEROCRM, ESTADOCRM)
VALUES (2, 745674, 'BA'),
		(2, 857795, 'PE'); 
        
INSERT INTO CONSULTA(DATAHORA, NUMEROCRM, ESTADOCRM, IDPACIENTE)
VALUES ('2024-12-14 13:00:30', 857795, 'PE', 3);

INSERT INTO TELEFONE(TELEFONE, IDPACIENTE)
VALUES (61874567234, 3),
		(61247609341, 2);


        
