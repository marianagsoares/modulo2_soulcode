-- Banco de dados de loja
-- Entidades: Vendedor, Produto, Endereço
-- Vendedor - Endereço (1:1); Vendedor - Produto (1:N);
-- CPF, NUMERO DE ENDERECO É INTERESSANTE COLOCAR COMO VARCHAR E NAO COMO INTEGER POIS INTEGER E INTEIRO E OS 0 A ESQUERDA SERAO DESCONSIDERADOS
-- CTRL + B FORMADA O CODIGO
-- DEFAULT SERVE PARA SE VOCE NAO INSERIR NENHUM VALOR, ELE CONSIDERA O QUE ESTA ENTRE PARENTESES
-- UNIQUE VOCE NAO PODE INSERIR O VALOR DE UM DOS ATRIBUTOS IGUAIS AOS OUTROS
CREATE DATABASE loja;
USE loja;
-- CRIAR TABELA VENDEDOR
CREATE TABLE vendedor(
	idVendedor INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL,
    dataNasc DATE NOT NULL
);
DROP TABLE vendedor;
-- CREATE TABLE PRODUTO
CREATE TABLE produto (
idProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (30) NOT NULL,
preco DECIMAL (10,2) NOT NULL,
desconto DECIMAL (4,2) DEFAULT (0),
descontoAte DATE,
quantidade INTEGER NOT NULL,
idVendedor INTEGER NOT NULL,
FOREIGN KEY (idVendedor) REFERENCES vendedor(idVendedor)
);

-- CRIANDO CADA LINHA DA TABELA VENDEDOR
INSERT INTO vendedor (idVendedor, nome, sobrenome, email, dataNasc)  VALUE  (NULL, "JUAREZ", "LIMA", "juarez@gmail.com", "1987-05-03");
INSERT INTO vendedor  VALUE  (NULL, "CARLA", "CORREIA", "carla@gmail.com", "1989-09-20");
INSERT INTO vendedor  VALUE  (NULL, "JULIA", "DIAS", "julia@gmail.com", "1980-07-07");

-- CRIANDO CADA LINHA DA TABELA PRODUTO
INSERT INTO produto VALUE(NULL, "Sofá", 2225.90, 5.90, "2022-09-12", 500, 2);
INSERT INTO produto VALUE(NULL, "Guarda-roupas", 989.99, 89.90, "2022-09-12", 70, 1);
INSERT INTO produto VALUE(NULL, "Abajur", 200.00, 0,0, 70, 1); -- PRODUTO NAO RECEBE DESCONTO

SELECT * FROM vendedor;
SELECT * FROM produto;
-- UPDATE produto SET quantidade = 100 WHERE idProduto = 3;
-- DESAFIO 1: Criar uma tabela endereco (uf, cidade, cep, rua, numero) que esta relacionada ao empregado (1:1)
-- DESAFIO 2: Criar uma tabela projeto (nome, prazo, orcamento, descricao). N:N (Gera uma tabela relacionamento)

