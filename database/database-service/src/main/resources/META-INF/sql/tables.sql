create table EmployeeList_ElectroEmployee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	etype LONG
);

create table EmployeeList_ElectroType (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(100) null
);

create table EmployeeList_Electronics (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(150) null,
	etype LONG,
	price LONG,
	count INTEGER,
	inStock BOOLEAN,
	archive BOOLEAN,
	description TEXT null
);

create table EmployeeList_Employee (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	lastname VARCHAR(100) null,
	firstname VARCHAR(100) null,
	patronymic VARCHAR(100) null,
	birthdate DATE null,
	position LONG,
	gender BOOLEAN
);

create table EmployeeList_PositionType (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(100) null
);

create table EmployeeList_Purchase (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	electroId LONG,
	employeeId LONG,
	purchaseDate DATE null,
	type_ LONG
);

create table EmployeeList_PurchaseType (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(100) null
);