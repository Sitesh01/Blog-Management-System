INSERT INTO users (username, email, password, roles) VALUES
('john_doe', 'john@example.com', 'password1', 'ROLE_USER'),
('emma_watson', 'emma@example.com', 'password2', 'ROLE_USER'),
('raj_kumar', 'raj@example.com', 'password3', 'ROLE_USER'),
('admin', 'admin@example.com', 'adminpass', 'ROLE_ADMIN'),
('maria_gomez', 'maria@example.com', 'password4', 'ROLE_USER'),
('david_singh', 'david@example.com', 'password5', 'ROLE_USER'),
('li_wei', 'liwei@example.com', 'password6', 'ROLE_USER'),
('alex_jordan', 'alex@example.com', 'password7', 'ROLE_USER'),
('sita_sharma', 'sita@example.com', 'password8', 'ROLE_USER'),
('mohammed_ali', 'ali@example.com', 'password9', 'ROLE_USER');



INSERT INTO posts (title, content, created_at, updated_at, user_id) VALUES
('Spring Boot Basics', 'Introduction to Spring Boot for beginners.', NOW(), NOW(), 1),
('Understanding JPA', 'Deep dive into Hibernate and JPA.', NOW(), NOW(), 2),
('Java Collections', 'Complete guide to Java Collections Framework.', NOW(), NOW(), 3),
('Security in Spring', 'How to implement JWT in Spring Boot.', NOW(), NOW(), 4),
('REST API Design', 'Best practices for designing RESTful APIs.', NOW(), NOW(), 5),
('MySQL Optimization', 'Tips for writing efficient SQL queries.', NOW(), NOW(), 6),
('Error Handling in Spring', '@ControllerAdvice explained in detail.', NOW(), NOW(), 7),
('Docker for Java Devs', 'Containerizing Spring Boot applications.', NOW(), NOW(), 8),
('Deploying to AWS', 'EC2 + RDS + Load Balancer deployment.', NOW(), NOW(), 9),
('Unit Testing Basics', 'JUnit & Mockito for beginners.', NOW(), NOW(), 10);



INSERT INTO comments (text, created_at, user_id, post_id) VALUES
('Great article, helped a lot!', NOW(), 2, 1),
('Very well explained, thanks!', NOW(), 3, 2),
('I learned something new today.', NOW(), 1, 3),
('Can you share the source code?', NOW(), 5, 4),
('This is extremely useful.', NOW(), 6, 5),
('Nice breakdown of concepts.', NOW(), 7, 6),
('Waiting for the next tutorial.', NOW(), 8, 7),
('I tried this and it worked!', NOW(), 9, 8),
('Clear and concise explanation.', NOW(), 10, 9),
('Amazing content as always.', NOW(), 4, 10);


