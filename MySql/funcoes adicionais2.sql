
-- Banco de dados de loja
-- Entidades: Vendedor, Produto, Endereço
-- Vendedor - Endereço (1:1); Vendedor - Produto (1:N);

CREATE DATABASE loja;

USE loja;

CREATE TABLE vendedor(
    idVendedor INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL,
    dataNasc DATE NOT NULL
);

CREATE TABLE produto(
    idProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    desconto DECIMAL(4, 2) DEFAULT(0), -- Caso não forneça valor p/ desconto ele irá utilizar 0, 99.99%
    descontoAte DATE,
    quantidade INTEGER NOT NULL,
    idVendedor INTEGER NOT NULL,
    FOREIGN KEY(idVendedor) REFERENCES vendedor(idVendedor)
);

CREATE TABLE endereco(
    idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
    cidade VARCHAR(30) NOT NULL, -- Ubajara, São Paulo, -- VARCHAR = COMPRIMENTO VARIÁVEL
    uf CHAR(2) NOT NULL, -- CE, SP, PE, -- CHAR = COMPRIMENTO FIXO
    rua VARCHAR(30) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    numero VARCHAR(15) NOT NULL,
    complemento VARCHAR(30) NOT NULL,
    idVendedor INTEGER UNIQUE NOT NULL, -- COM UNIQUE GARANTIMOS O RELACIONAMENTO 1:1
    FOREIGN KEY(idVendedor) REFERENCES vendedor(idVendedor)
);

SELECT * FROM vendedor;
SELECT * FROM produto;
SELECT * FROM endereco;

-- PROJEÇÃO: o que se quer ver/mostrar
SELECT NOW() AS agora;
SELECT 1 + 1 AS resultado; -- ALIAS = apelido
SELECT nome AS nomeVendedor FROM vendedor; -- Podemos escolher quais colunas ver da tabela
SELECT nome, sobrenome FROM vendedor;
SELECT dataNasc AS aniversario FROM vendedor;
SELECT nome AS nomeProduto, preco FROM produto;

-- SELEÇÃO: É filtrar os registros/linhas da tabela
SELECT idVendedor, nome, sobrenome FROM vendedor WHERE idVendedor = 1; -- Lista vendedor com id = 1
SELECT * FROM vendedor WHERE idVendedor != 1; -- Lista todos menos o vendedor com id = 1
SELECT * FROM vendedor WHERE idVendedor = 1 OR idVendedor = 2; -- Lista todas as linhas, onde vendedor 1 ou 2
SELECT * FROM vendedor WHERE idVendedor != 1 AND idVendedor != 2; -- Lista todas as linhas, onde vendedor é diferente 1 e 2
SELECT * FROM vendedor WHERE email = "jr@gmail.com"; -- RESULTADO VAZIO, sem registros

SELECT * FROM produto WHERE preco > 300;
SELECT * FROM produto WHERE preco >= 300;
SELECT * FROM produto WHERE preco < 100;
SELECT * FROM produto WHERE preco <= 100;
SELECT * FROM produto WHERE preco >= 100 AND preco <= 500; -- Listando produtos da faixa preco 100 - 500
SELECT * FROM produto WHERE desconto > 0.0 AND descontoAte < CURRENT_DATE(); -- Lista produtos com desconto, mas com data expirada
SELECT * FROM produto WHERE quantidade < 20; -- Lista produtos abaixo do estoque de 20
SELECT * FROM produto WHERE quantidade = 0; -- Lista produtos sem estoque
SELECT * FROM vendedor WHERE YEAR(dataNasc) < 2000; -- Lista vendedores que nasceram antes dos anos 2000
SELECT * FROM produto WHERE quantidade >= 20 AND quantidade <= 100; -- Lista produtos com quantidade entre 20 e 100;
SELECT * FROM produto WHERE quantidade BETWEEN 20 AND 100; -- Lista produtos com quantidade entre 20 e 100;
SELECT * FROM vendedor WHERE idVendedor IN(1, 25, 30, 80, 90); -- Evita usar OR excessivamente
SELECT COUNT(*) FROM vendedor; -- Quantidade de linhas
SELECT * FROM produto WHERE descontoAte IS NULL; -- Lista produtos em que a data é nula
SELECT * FROM produto WHERE descontoAte IS NOT NULL; -- Lista produtos em que a data não é nula

SELECT * FROM vendedor WHERE nome = "Devante";
SELECT * FROM vendedor WHERE nome LIKE "De%"; -- % = QUALQUER TEXTO EM SEGUIDA
SELECT * FROM vendedor WHERE sobrenome LIKE "%ann";
SELECT * FROM vendedor WHERE nome LIKE "%an%"; -- Buscar "an" em qualquer lugar do nome
SELECT * FROM vendedor WHERE email LIKE "%@gmail.com"; -- Busca o @gmail.com no final
SELECT * FROM vendedor WHERE email LIKE "%.org"; -- Busca o .org no final
SELECT * FROM vendedor WHERE dataNasc LIKE "%-10-%"; -- Busca os vendedores com aniversario no mês 10;

-- Ordenação
SELECT * FROM produto ORDER BY preco; -- ASC = crescente (padrão) vs DESC
SELECT * FROM produto ORDER BY preco DESC;
SELECT * FROM produto WHERE quantidade BETWEEN 20 AND 100 ORDER BY preco;
SELECT * FROM vendedor ORDER BY nome; -- Ordem alfabetica
SELECT * FROM vendedor ORDER BY nome, sobrenome; -- Se os nomes forem iguais, usa o sobrenome para desempate
SELECT * FROM vendedor LIMIT 10;

SELECT * FROM vendedor WHERE nome LIKE "J%" LIMIT 5;
SELECT * FROM vendedor WHERE idVendedor BETWEEN 10 AND 30 LIMIT 10;

SELECT nome, preco, desconto, descontoAte
FROM produto 
WHERE desconto > 0.0 AND descontoAte > CURRENT_DATE() 
ORDER BY preco DESC 
LIMIT 50; -- podemos quebrar linha para organizar melhor
-- LIMIT 50 => OS 50 PRIMEIROS RESULTADOS DA QUERY

SELECT idVendedor FROM endereco WHERE uf = "CE"; -- Listar o id dos vendedores do CE
SELECT idVendedor, uf FROM endereco WHERE uf IN("SP", "RJ", "PI");
SELECT * FROM vendedor WHERE YEAR(dataNasc) > 2000; -- Lista os vendedores que nasceram após 2000
SELECT * FROM vendedor WHERE MONTH(dataNasc) = 10; -- Lista os vendedores que nasceram em outubro
SELECT * FROM vendedor WHERE MONTH(dataNasc) = MONTH(CURRENT_DATE()); -- Lista os vendedores que nasceram no mês atual da query

-- JUNÇÃO
SELECT idVendedor FROM endereco WHERE uf = "CE";
SELECT * FROM vendedor WHERE idVendedor IN(23, 26, 74, 78);

SELECT * FROM vendedor 
    INNER JOIN endereco -- JUNTA A LINHA DO VENDEDOR COM SEU RESPECTIVO ENDEREÇO
    ON vendedor.idVendedor = endereco.idVendedor; -- COMPARA CHAVE PRIMARIA COM A CHAVE ESTRANGEIRA

SELECT nome, sobrenome, uf, cidade 
FROM vendedor 
    INNER JOIN endereco 
    ON vendedor.idVendedor = endereco.idVendedor
WHERE uf = "CE"; -- uf IN("SP", "CE", "PI");

SELECT * FROM vendedor
    INNER JOIN produto -- JUNTA CADA VENDEDOR COM SEU PRODUTO
    ON vendedor.idVendedor = produto.idVendedor; 

SELECT vendedor.nome, produto.nome AS produtoNome, preco FROM vendedor
    INNER JOIN produto
    ON vendedor.idVendedor = produto.idVendedor
    INNER JOIN endereco
    ON vendedor.idVendedor = endereco.idVendedor;
    
-- LISTAR OS PRODUTOS EM PROMOÇÃO VENDIDOS NO CEARÁ
SELECT produto.nome AS produtoNome, preco, desconto, descontoAte 
FROM vendedor
    INNER JOIN produto
    ON vendedor.idVendedor = produto.idVendedor
    INNER JOIN endereco
    ON vendedor.idVendedor = endereco.idVendedor
WHERE desconto > 0.0 AND descontoAte > CURRENT_DATE() AND uf = "CE"; -- uf IN("SP", "CE", "PI")

-- LISTAR OS PRODUTOS COM 50% DE DESCONTO EM SP
SELECT *
FROM vendedor
    INNER JOIN produto
    ON vendedor.idVendedor = produto.idVendedor
    INNER JOIN endereco
    ON vendedor.idVendedor = endereco.idVendedor
WHERE desconto > 0.5 AND uf = "SP";

-- LISTAR OS PRODUTOS DE UM VENDEDOR DE ID = 1
SELECT * FROM produto WHERE idVendedor = 1;

SELECT vendedor.nome AS nomeVendedor, produto.nome AS nomeProduto, preco
FROM vendedor
    INNER JOIN produto
    ON vendedor.idVendedor = produto.idVendedor
WHERE vendedor.idVendedor = 1;

SELECT * FROM produto;

-- ADICIONAR NOVAS COLUNAS SEM DROPAR
ALTER TABLE produto
ADD COLUMN precoMinimo DECIMAL(10, 2) NOT NULL DEFAULT(1); -- ADICIONO UMA NOVA COLUNA, AS LINHAS ATUAIS RECEBEM VALOR 1 POR PADRÃO

ALTER TABLE produto
CHANGE precoMinimo preco_Minimo DECIMAL(8, 2) NOT NULL DEFAULT(2); -- VOCÊ PODE RENOMEAR E ALTERAR TOTALMENTE A COLUNA

ALTER TABLE produto
DROP COLUMN preco_Minimo; -- REMOVE A COLUNA E OS DADOS DELA COMPLETAMENTE

DESC produto;