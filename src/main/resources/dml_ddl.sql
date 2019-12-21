drop table if exists students;
create table students
(
	id bigserial not null,
	name varchar(20) not null,
	sex varchar(4) not null,
	birthday date not null,
	department varchar(20) not null,
	birthplace varchar(20) not null
);
alter table students owner to postgres;


INSERT INTO students VALUES( 901,'张老大', '男', to_date('1989-12-02', 'yyyy-mm-dd'),'计算机系', '北京市海淀区');
INSERT INTO students VALUES( 902,'张老二', '男', '1991-02-01'::date,'中文系', '北京市昌平区');
INSERT INTO students VALUES( 903,'张三', '女',date '1990-03-01','中文系', '湖南省永州市');
INSERT INTO students VALUES( 904,'李四', '男',date '1991-03-02','英语系', '辽宁省沈阳市');
INSERT INTO students VALUES( 905,'王五', '女',date '1990-09-02','英语系', '福建省厦门市');
INSERT INTO students VALUES( 906,'王六', '男',date '1989-08-02','计算机系', '湖南省长沙市');


create table score
(
	id bigserial not null,
	stu_id bigint not null,
	c_name varchar(128) not null,
	grade integer not null
);
comment on table score is '分数';
comment on column score.c_name is '课程名称';
alter table score owner to postgres;


INSERT INTO score(stu_id, c_name, grade) VALUES(901, '计算机',98);
INSERT INTO score(stu_id, c_name, grade) VALUES(901, '英语', 80);
INSERT INTO score(stu_id, c_name, grade) VALUES(902, '计算机',65);
INSERT INTO score(stu_id, c_name, grade) VALUES(902, '中文',88);
INSERT INTO score(stu_id, c_name, grade) VALUES(903, '中文',95);
INSERT INTO score(stu_id, c_name, grade) VALUES(904, '计算机',70);
INSERT INTO score(stu_id, c_name, grade) VALUES(904, '英语',92);
INSERT INTO score(stu_id, c_name, grade) VALUES(905, '英语',94);
INSERT INTO score(stu_id, c_name, grade) VALUES(906, '计算机',90);
INSERT INTO score(stu_id, c_name, grade) VALUES(906, '英语',85);