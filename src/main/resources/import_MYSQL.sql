INSERT INTO ubication (name)
VALUES ("Zaragoza"), ("Barcelona"), ("Madrid");

INSERT INTO department(dept_id, name)
VALUES (10, "Marketing"), (20, "RH"), (30, "Logistic");

INSERT INTO employee (name, ub_id, salary, dept_id)
VALUES ("Pepe", 1, 15000, 10), ("Paquita", 2, 17500, 10), ("Papadopoulos", 2, 13800, 30);

INSERT INTO ubication_department (ub_id, dept_id) 
VALUES (1, 10), (1, 30), (2, 10), (2, 20), (3, 20);




