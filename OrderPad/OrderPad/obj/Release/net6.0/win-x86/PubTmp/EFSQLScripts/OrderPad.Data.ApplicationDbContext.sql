IF OBJECT_ID(N'[__EFMigrationsHistory]') IS NULL
BEGIN
    CREATE TABLE [__EFMigrationsHistory] (
        [MigrationId] nvarchar(150) NOT NULL,
        [ProductVersion] nvarchar(32) NOT NULL,
        CONSTRAINT [PK___EFMigrationsHistory] PRIMARY KEY ([MigrationId])
    );
END;
GO

BEGIN TRANSACTION;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20220924044131_AddUser')
BEGIN
    CREATE TABLE [LoginRegistrations] (
        [Email] nvarchar(450) NOT NULL,
        [Name] nvarchar(max) NOT NULL,
        [UserName] nvarchar(max) NOT NULL,
        [Password] nvarchar(max) NOT NULL,
        CONSTRAINT [PK_LoginRegistrations] PRIMARY KEY ([Email])
    );
END;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20220924044131_AddUser')
BEGIN
    INSERT INTO [__EFMigrationsHistory] ([MigrationId], [ProductVersion])
    VALUES (N'20220924044131_AddUser', N'6.0.9');
END;
GO

COMMIT;
GO

BEGIN TRANSACTION;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20230310015233_addUserAndFoodTable')
BEGIN
    INSERT INTO [__EFMigrationsHistory] ([MigrationId], [ProductVersion])
    VALUES (N'20230310015233_addUserAndFoodTable', N'6.0.9');
END;
GO

COMMIT;
GO

BEGIN TRANSACTION;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20230310015456_addUserDetailsAndFoodItem')
BEGIN
    CREATE TABLE [Item] (
        [ID] int NOT NULL IDENTITY,
        [RestaurentID] int NULL,
        [Name] nvarchar(max) NULL,
        [Description] nvarchar(max) NULL,
        [Catagory] nvarchar(max) NULL,
        [Price] real NULL,
        CONSTRAINT [PK_Item] PRIMARY KEY ([ID])
    );
END;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20230310015456_addUserDetailsAndFoodItem')
BEGIN
    CREATE TABLE [UserDetails] (
        [UserName] nvarchar(450) NOT NULL,
        [RestaurentId] int NOT NULL,
        [BusinessName] nvarchar(max) NULL,
        [PhoneNumber] nvarchar(max) NULL,
        [AccessType] int NOT NULL,
        CONSTRAINT [PK_UserDetails] PRIMARY KEY ([UserName])
    );
END;
GO

IF NOT EXISTS(SELECT * FROM [__EFMigrationsHistory] WHERE [MigrationId] = N'20230310015456_addUserDetailsAndFoodItem')
BEGIN
    INSERT INTO [__EFMigrationsHistory] ([MigrationId], [ProductVersion])
    VALUES (N'20230310015456_addUserDetailsAndFoodItem', N'6.0.9');
END;
GO

COMMIT;
GO

