DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250) DEFAULT '',
  done boolean DEFAULT false,
  index INT NOT NULL
);

INSERT INTO todo (title, description, done, index) VALUES ('Todo 1', 'This is just a test.', false, 0);
INSERT INTO todo (title, description, done, index) VALUES ('Todo 2', 'This is just a test.', false, 1);
INSERT INTO todo (title, description, done, index) VALUES ('Todo 3', 'This is just a test.', false, 2);
INSERT INTO todo (title, description, done, index) VALUES ('Todo 4', 'This is just a test.', false, 3);