Use MyLib;
go

alter table dbo.BookInLib add foreign key (BookID) references dbo.Book(BookID);