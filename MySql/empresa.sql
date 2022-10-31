CREATE DATABASE empresa;

-- DESAFIO 1: Criar uma tabela endereco (uf, cidade, cep, rua, numero) que esta relacionada ao empregado (1:1)
-- DESAFIO 2: Criar uma tabela projeto (nome, prazo, orcamento, descricao). N:N (Gera uma tabela relacionamento)

CREATE TABLE empregado(
    idEmpregado INTEGER PRIMARY KEY AUTO_INCREMENT, -- o banco preenche automaticamente (identificar de maneira unica)
    nome VARCHAR(30) NOT NULL, -- torna nome obrigatório
    email VARCHAR(30) UNIQUE NOT NULL, -- email não pode ser repetido na tabela
    dataNasc DATE NOT NULL, -- "1999-02-01" - PADRÃO AMERICANO
    salario DECIMAL(10, 2) NOT NULL, -- 10 = TOTAL DIGITOS, 2 = PRECISÃO EM DIGITOS (APÓS)
    idDepartamento INTEGER NOT NULL -- Campo para guardar a chave do departamento
);

CREATE TABLE endereco(
idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
uf CHAR(2) NOT NULL,  -- COM O CHAR EU RESERVO DOIS ESPACOS OBRIGATORIAMENTE PARA GUARDAR 2 CARACTERES
cidade VARCHAR(12) NOT NULL,
cep INTEGER(8) NOT NULL,
rua VARCHAR (30) NOT NULL,
numero VARCHAR(5) NOT NULL, -- O campo numero pode conter letras tbm ex. 52-A
idEmpregado INTEGER UNIQUE NOT NULL, -- o id do empregado como UNIQUE garante que nao aceita o mesmo idEmpregado para dois enderecos
FOREIGN KEY (idEmpregado) REFERENCES empregado(idEmpregado)
);

CREATE TABLE projeto(
idProjeto INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(10) UNIQUE NOT NULL,
prazo DATE NOT NULL,
orcamento INTEGER NOT NULL,
descricao VARCHAR(30)
);

CREATE TABLE relacionamento(
idRelacionamento INTEGER PRIMARY KEY AUTO_INCREMENT, -- CHAVE PRIMARIA DA TABELA  RELACIONAMENTO
idEmpregado INTEGER NOT NULL, -- CHAVE ESTRANGEIRA DA TABELA EMPREGADO 
idProjeto INTEGER NOT NULL,-- CHAVE ESTRANGEIRA DA TABELA PROJETO
FOREIGN KEY (idEmpregado) REFERENCES empregado(idEmpregado),
FOREIGN KEY (idProjeto) REFERENCES projeto(idProjeto) 
);
SELECT * FROM relacionamento;


INSERT INTO empregado VALUES(NULL, "Carlos José", "carlos.jose@gmail.com", "1993-04-03", 3500.0, 1);
INSERT INTO empregado VALUES(NULL, "João Paulo", "joaopaulo@gmail.com", "1998-02-03", 4500.0, 2);
INSERT INTO empregado VALUES(NULL, "André Vieira", "andrevieira@gmail.com", "1978-01-03", 6500.0, 3);
SELECT * FROM empregado;

INSERT INTO endereco VALUES(NULL, "RJ", "Copacabana", 1222255, "Rua dos Famosos", 95, 1);
INSERT INTO endereco VALUES(NULL, "PE", "Recife", 8855555, "Rua da Felicidade", 25, 3);
INSERT INTO endereco VALUES(NULL, "SP", "Campinas",  9998889, "Rua Henrique", 88, 2);
SELECT * FROM endereco;

INSERT INTO projeto VALUES(NULL, "ARQUITETURA", "2022-08-20", 500000, "Arquitetura e Urbanismo da Estrada X");
INSERT INTO projeto VALUES(NULL, "ENGENHARIA", "2022-12-05", 2500000, "Engenharia do edifício Y");
INSERT INTO projeto VALUES(NULL, "GOODPAY", "2024-11-02", 35000, "GoodPay é um projeto Z");


-- COMO ASSOCIAR ENTIDADES? -----------

INSERT INTO relacionamento VALUES (NULL, 1, 2); -- CHAVE PRIMARIA DA TABELA RELACIONAMENTO / ID DO EMPREGADO // ID DO PROJETO CARLOS JOSE TRABALHA EM ENGENHARIA
INSERT INTO relacionamento VALUES (NULL, 1, 1); -- CARLOS JOSE TRABALHA EM ARQUITETURA
INSERT INTO relacionamento VALUES (NULL, 3, 2); -- ANDRE VIEIRA TRABALHA EM GOODPAY
INSERT INTO relacionamento VALUES (NULL, 2, 1);  -- JOAO PAULO TRABALHA EM ARQUITETURA