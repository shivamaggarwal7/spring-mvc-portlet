create table spring_Employee (
	empId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	empName VARCHAR(75) null,
	grade VARCHAR(75) null
);

create table spring_Foo (
	empId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	empName VARCHAR(75) null,
	grade VARCHAR(75) null
);