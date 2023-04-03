Use [MyLib];
go

create table [dbo].[Book](
	[BookId] int IDENTITY(1,1) PRIMARY KEY,
	[Author] varchar(100), 
	[Title] varchar(255) NOT NULL,
	[Publisher] varchar(50),
	[BookYear] smallint)

go 

create table dbo.BookStatus(
	StatusID int IDENTITY(1,1) PRIMARY KEY,
	StatusName varchar(50) NOT NULL UNIQUE);


go

create table dbo.BoookInLib(
	LibID int PRIMARY KEY,
	BookID int NOT NULL,
	StatusID int NOT NULL)
go