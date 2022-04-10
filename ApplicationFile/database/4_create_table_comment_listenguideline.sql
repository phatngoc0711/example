use toieconline;

CREATE TABLE listenguideline (
                                 listenguidelineid bigint(20) NOT NULL AUTO_INCREMENT,
                                 title varchar(100) NULL,
                                 image varchar(100) NULL,
                                 content text NULL,
                                 createddate timestamp NULL,
                                 modifieddate timestamp NULL,
                                 PRIMARY KEY (listenguidelineid),
                                 UNIQUE KEY title (title)
);

CREATE TABLE comment (
                         commentid bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                         content text null ,
                         userid bigint NULL,
                         listenguidelineid bigint NULL,
                         createddate timestamp NULL

) ;
