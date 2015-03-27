BEGIN;

CREATE TABLE IF NOT EXISTS pessoa (
    idPessoa SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(45) NOT NULL,
    estadoCivil VARCHAR(45) NOT NULL,
    dataNascimento DATE NOT NULL,
    sexo CHAR NOT NULL,
    origemEtnica VARCHAR(45) NOT NULL,
    estado VARCHAR(45) NOT NULL,
    cidade VARCHAR(45) NOT NULL,
    bairro VARCHAR(45) NOT NULL,
    rua VARCHAR(45) NOT NULL,
    numero INT NOT NULL,
    complemento VARCHAR(45) NOT NULL,
    rg VARCHAR(45) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefoneResidencial VARCHAR(45) NOT NULL,
    telefoneCelular VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_pessoa_idPessoa ON pessoa(idPessoa);

CREATE TABLE IF NOT EXISTS crianca (
    possuiNecessidadeEspecial BOOLEAN NOT NULL DEFAULT FALSE,
    necessidadeEspecial VARCHAR(45),
    nomeMae VARCHAR(45),
    nomePai VARCHAR(45),
    outroResponsavel VARCHAR(45),
    certidaoNascimento VARCHAR(45)
) INHERITS(pessoa);

ALTER TABLE crianca ADD CONSTRAINT crt_crianca_idPessoa PRIMARY KEY (idPessoa);


COMMIT;