CREATE DATABASE empresas;
USE empresas; -- Seleciona o banco empresa para aplicar os comandos SQL
SHOW TABLES; -- Listar todas as tabelas presentes no banco empresa 

CREATE TABLE departamento(
	idDepartamento INTEGER PRIMARY KEY AUTO_INCREMENT, -- CHAVE PRIMÁRIA: Identifica unicamente um registro da tabela
    nome VARCHAR(30) NOT NULL, -- VARCHAR(limite): TEXTO VARIAVEL, NOT NULL = obrigatório
    salarioMax DECIMAL(10, 2) NOT NULL -- DECIMAL(digitos, precisao)
);

CREATE TABLE empregado(
    idEmpregado INTEGER PRIMARY KEY AUTO_INCREMENT, -- o banco preenche automaticamente (identificar de maneira unica)
    nome VARCHAR(30) NOT NULL, -- torna nome obrigatório
    email VARCHAR(30) UNIQUE NOT NULL, -- email não pode ser repetido na tabela
    dataNasc DATE NOT NULL, -- "1999-02-01" - PADRÃO AMERICANO
    salario DECIMAL(10, 2) NOT NULL, -- 10 = TOTAL DIGITOS, 2 = PRECISÃO EM DIGITOS (APÓS)
    idDepartamento INTEGER NOT NULL, -- Campo para guardar a chave do departamento
    FOREIGN KEY(idDepartamento) REFERENCES departamento(idDepartamento) -- Oficializa o relacionamento entre departamento - empregado
); -- O BANCO ESTÁ CIENTE DESSA RELAÇÃO ENTRE AS DUAS TABELAS

CREATE TABLE dependente(
    idDependente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    dataNasc DATE NOT NUll, -- NOT NULL NAO ACEITA QUE FIQUE VAZIO
    idResponsavel INTEGER NOT NULL, -- idEmpregado
    FOREIGN KEY(idResponsavel) REFERENCES empregado(idEmpregado) -- Torna o banco ciente do relacionamento
);
INSERT INTO departamento VALUES (NULL, "Recursos Humanos", 5500.0); -- SEGUE A ORDEM DAS COLUNAS
INSERT INTO departamento VALUES (NULL, "TI", 6900.0);
INSERT INTO departamento VALUES (NULL, "Suporte", 6000.0);
SELECT * FROM departamento; -- Listar os dados da tabela (departamento)

INSERT INTO empregado VALUES(NULL, "Carlos José", "carlos.jose@gmail.com", "1993-04-03", 3500.0, 1);
INSERT INTO empregado VALUES(NULL, "João Paulo", "joaopaulo@gmail.com", "1998-02-03", 4500.0, 2);
INSERT INTO empregado VALUES(NULL, "André Vieira", "andrevieira@gmail.com", "1978-01-03", 6500.0, 3);
SELECT * FROM empregado; -- Lista TODOS os empregados

-- NESSA FORMA, INDICA-SE QUAIS COLUNAS SERÃO PREENCHIDAS
INSERT INTO dependente (nome, dataNasc, idResponsavel) VALUES ("Carlin Jr.", "2010-05-01", 1);
INSERT INTO dependente (nome, dataNasc, idResponsavel) VALUES ("Maria Carla", "2015-03-02", 2);
INSERT INTO dependente (nome, dataNasc, idResponsavel) VALUES ("Pedro Antonio", "2013-02-02", 3);
INSERT INTO dependente (nome, dataNasc, idResponsavel) VALUES ("André Jr.", "2012-02-02", 1);
SELECT * FROM dependente;

-- Atualizar registros
-- UPDATE empregado
-- SET salario = 5000.0; -- TODOS OS EMPREGADOS RECEBERIAM SALARIO = 5000 (PERIGO)

UPDATE empregado
SET salario = 5000.0
WHERE idEmpregado = 1; -- MUDA O SALARIO DO EMPREGADO 1

UPDATE empregado
SET nome = "João Paulo Marques", salario = 5500.0, idDepartamento = 1
WHERE idEmpregado = 2; -- MUDA NOME, SALARIO, DEPARTAMENTO DO EMPREGADO 2

UPDATE departamento
SET salarioMax = 9000
WHERE idDepartamento = 2; -- MUDA O SALARIO MAXIMO DO DEPARTAMENTO 2

UPDATE dependente
SET idResponsavel = 2
WHERE idDependente = 3; -- MUDA O RESPONSAVEL DO DEPENDENTE 3

SELECT * FROM empregado;
SELECT * FROM departamento;
SELECT * FROM dependente;