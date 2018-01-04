INSERT INTO Course(title, course_code, description) VALUES('Algorithms and Data Structures','NTR0390',
'Introduce the important algorithms and data structures. Give an understanding of the complexity of the algorithms and operations on data structures. 
Help to how find the creative and efficient algorithmic solutions to the computational problems');
INSERT INTO Course(title, course_code, description) VALUES('Logic and Programming','RAA0050',
'To raise interest for intellectual activity. To motivate students to connect their further studies and work with natural and exact sciences.');
INSERT INTO Course(title, course_code, description) VALUES('Fundamentals of Electronics','RAA0070',
'To develop skills to solve problems related to analysis and synthesis of simple electronic circuits. Experimental verification of the principal concepts.');
INSERT INTO Course(title, course_code, description) VALUES('Business English','RAH0970',
'To acquire Business English at the level B2; to develop reading, writing, listening and speaking skills necessary for bussiness communication.');


INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('vladimir','$2a$10$w9IJDw5..ZhAPNlKc40FFuvrPqIA15FfW49Xtobtpu9T2MAzAl1tS', '1', 'ROLE_USER', 'vladimir@gmail.com','Vladimir','Andrianov','152345');
INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('andrei','$2a$10$w9IJDw5..ZhAPNlKc40FFuvrPqIA15FfW49Xtobtpu9T2MAzAl1tS', '1', 'ROLE_USER', 'andrei@gmail.com','Andreir','Gavrilov','156743');
INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('janar','$2a$10$w9IJDw5..ZhAPNlKc40FFuvrPqIA15FfW49Xtobtpu9T2MAzAl1tS', '1', 'ROLE_USER', 'janar@gmail.com','Yanar','Tomband','153564');
INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('ivan','$2a$10$w9IJDw5..ZhAPNlKc40FFuvrPqIA15FfW49Xtobtpu9T2MAzAl1tS', '1', 'ROLE_USER', 'ivan@gmail.com','Ivan','Panas','153454');
INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('user','$2a$10$C7uVV0EHXdOkJlOrpQ12tOC37PVThx1Y9MEnVaUgXqVSEbgWez5c6', '1', 'ROLE_USER', 'user@gmail.com','user','user','111111');
INSERT INTO User(user_name, password,token, role, email, first_name, last_name, student_code) VALUES ('admin','$2a$10$UJlP.8OJ/bx.DWdEPeGu5ux0Pmpdvu6KyQMYT/b.elhXVBKIC3cd.', '1', 'ROLE_ADMIN', 'admin@gmail.com','admin','admin','222222');



INSERT INTO Courses_Users(courses_id,users_id) VALUES (1,1);
INSERT INTO Courses_Users(courses_id,users_id) VALUES (2,2);
INSERT INTO Courses_Users(courses_id,users_id) VALUES (3,3);
INSERT INTO Courses_Users(courses_id,users_id) VALUES (4,4);