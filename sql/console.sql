CREATE SCHEMA `simple_memo`;

CREATE TABLE `simple_memo`.`memos`
(
    `index`      INT UNSIGNED  NOT NULL AUTO_INCREMENT COMMENT '메모 식별자(순번)',
    `writer`     VARCHAR(10)   NOT NULL COMMENT '작성자',
    `content`    VARCHAR(1000) NOT NULL COMMENT '내용',
    `created_at` DATETIME      NOT NULL DEFAULT NOW() COMMENT '작성 일시',
    CONSTRAINT PRIMARY KEY (`index`)
);
