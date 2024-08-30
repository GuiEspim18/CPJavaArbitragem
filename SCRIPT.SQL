CREATE DATABASE arbitragem_sa;

USE arbitragem_sa;

CREATE TABLE arbitro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) PRIMARY KEY,
    nome VAR CHAR(45) PRIMARY KEY,
    sobrenome VARCHAR(255) PRIMARY KEY,
    serie VARCHAR(255) PRIMARY KEY,
    esporte VARCHAR(255) PRIMARY KEY,
    data_nascimento DATE NOT NULL,
    experiencia INT NOT NULL,
    telefone VARCHAR(8) NOT NULL,
    estado VARCHAR(60) NOT NULL,
    status_carreira INT NOT NULL,
    administrador_id INT NOT NULL,

    FOREIGN KEY (administrador_id) REFERENCES administrador(id) ON DELETE SET NULL
);

CREATE TABLE partida (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_partida DATE PRIMARY KEY,
    local_partida VARCHAR(255) PRIMARY KEY,
    serie VARCHAR(255) PRIMARY KEY,
    horario TIME NOT NULL,
    time_a VARCHAR(255) NOT NULL,
    time_b VARCHAR(255) NOT NULL,
    duracao TIME NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    fase VARCHAR(255)
    arbitro_id;

    FOREIGN KEY (arbitro_id) REFERENCES arbitro(id) ON DELETE SET NULL
);

CREATE TABLE administrador (
    email VARCHAR(255) PRIMARY KEY,
    senha VARCHAR(8),
    nome VARCHAR(45) NOT NULL,
    sobrenome VARCHAR(255) NOT NULL
);