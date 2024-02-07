CREATE TABLE t4_post
(
    id int PRIMARY KEY AUTO_INCREMENT,
    user varchar(20) NOT NULL,
    subject varchar(200) NOT NULL,
    content longtext,
    viewcnt int DEFAULT 0,
    regdate datetime DEFAULT now()
);

SELECT * from t4_post;