This is a sample project for generating random strings in a web application.
I have used spring boot 3. 
Spring data jpa for data operations
For HTML pages, I have used thymleaf templates.

MySQL database is used.

Below is the sql script that must be executed on the mysql databse before starting the web  app:

CREATE SCHEMA randomdata;

CREATE TABLE randomdata.randomstrings (
    id INT NOT NULL AUTO_INCREMENT,
    randomstring VARCHAR(2000),
    insert_time TIMESTAMP,
    PRIMARY KEY (id)
);



