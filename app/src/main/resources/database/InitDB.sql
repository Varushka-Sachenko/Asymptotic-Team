CREATE TYPE MARITAL_STATUS AS ENUM ('MARRIED', 'NEVER_MARRIED', 'DIVORSED');
CREATE TYPE ROLE_ AS ENUM ('DEBTOR', 'CO_DEBTOR', 'GUARANTOR');
CREATE TABLE IF NOT EXISTS client
(
    id INT PRIMARY KEY,
    birth_date DATETIME,
    city VARCHAR(200),
    marital_status MARITAL_STATUS,
    children_amount INT,
    role_ ROLE_,
    dsti INT,
    abc TEXT,
    is_client_of_the_bank BIT
);
CREATE TYPE INCOME_TYPE AS ENUM ('SALARY', 'ENTREPRENEURSHIP', 'PENSION', 'OTHER');
CREATE TABLE IF NOT EXISTS income_source
(
    id INT PRIMARY KEY,
    client_id INT,
    sum MONEY,
    income_type INCOME_TYPE,
    is_docs_ok BIT,
    work_term DATETIME,
    is_main BIT,
    position VARCHAR(200),
    FOREIGN KEY (client_id) REFERENCES client (id)
);