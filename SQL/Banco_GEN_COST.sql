Create database LPII_EC6
Go

USE LPII_EC6
GO

create table tbUsuario (
ID			int IDENTITY(1,1),
Nome		varchar(180),
Nickname	varchar(30) NOT NULL,
Senha		varchar(30) NOT NULL,
CONSTRAINT PK_ID_USR PRIMARY KEY (ID)
)
GO

create table tbGrupo (
ID			int IDENTITY(1,1),
NomeGrupo	varchar(100),
Descricao	varchar(max),
CONSTRAINT PK_ID_GRP PRIMARY KEY (ID)
)
GO

create table tbUsuarioGrupo (
IDUsuario	int CONSTRAINT FK_ID_USR FOREIGN KEY REFERENCES tbUsuario(ID),
IDGrupo		int CONSTRAINT FK_ID_GRP FOREIGN KEY REFERENCES tbGrupo(ID)
)
GO

create table tbDespesa (
ID			int IDENTITY(1,1),
Descricao	varchar(120),
Valor		money,
CustoFixo	binary,
Pagamento	binary,
CONSTRAINT PK_ID_DSP PRIMARY KEY (ID)
)
GO

create table tbDespesaUsuario (
IDDespesa	int CONSTRAINT FK_ID_DSP FOREIGN KEY REFERENCES tbDespesa(ID),
IDGrupo		int CONSTRAINT FK_ID_GRP_DSP FOREIGN KEY REFERENCES tbGrupo(ID)
)
GO