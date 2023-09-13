create index IX_A47E1062 on EmployeeList_ElectroEmployee (etype);
create index IX_F3AF9A07 on EmployeeList_ElectroEmployee (uuid_[$COLUMN_LENGTH:75$]);

create index IX_3F70CA7B on EmployeeList_ElectroType (uuid_[$COLUMN_LENGTH:75$]);

create index IX_7ADAAFE5 on EmployeeList_Electronics (etype);
create index IX_CA0C398A on EmployeeList_Electronics (uuid_[$COLUMN_LENGTH:75$]);

create index IX_C37E9C4 on EmployeeList_Employee (position);
create index IX_E2F02F2D on EmployeeList_Employee (uuid_[$COLUMN_LENGTH:75$]);

create index IX_B16A6F8 on EmployeeList_PositionType (uuid_[$COLUMN_LENGTH:75$]);

create index IX_C5DED5BD on EmployeeList_Purchase (electroId);
create index IX_9BC4C7D7 on EmployeeList_Purchase (employeeId);
create index IX_E24BBE5B on EmployeeList_Purchase (type_);
create index IX_FFB7E3A on EmployeeList_Purchase (uuid_[$COLUMN_LENGTH:75$]);

create index IX_B1E83A20 on EmployeeList_PurchaseType (uuid_[$COLUMN_LENGTH:75$]);