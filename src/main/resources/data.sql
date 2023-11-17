INSERT INTO Author (ID, name, surname) VALUES (1, 'n1', 's1');

INSERT INTO Book (ID, title, author) VALUES (1, 't1', 1);
INSERT INTO Book (ID, title, author) VALUES (2, 't2', 1);

INSERT INTO Profile (ID, name, surname) VALUES (1, 'n1', 's1');
INSERT INTO Profile (ID, name, surname) VALUES (2, 'n2', 's2');

INSERT INTO User_Account (ID, profile, username) VALUES (1, 1, 'u1');
INSERT INTO User_Account (ID, profile, username) VALUES (2, 2, 'u2');

INSERT INTO BORROW (ID, book, user_account, borrow_date, return_date) VALUES (1, 1, 1, NOW(), NOW()+7);
INSERT INTO BORROW (ID, book, user_account, borrow_date, return_date) VALUES (2, 2, 2, NOW(), NOW()+7);