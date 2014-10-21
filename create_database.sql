CREATE TABLE USER (
	id INT NOT NULL auto_increment,
	email VARCHAR(255) NOT NULL UNIQUE,
	password VARCHAR(255) NOT NULL,
	nickname VARCHAR(255) NOT NULL UNIQUE,
	gender VARCHAR(255) NOT NULL,
	firstName VARCHAR(255) NOT NULL,
	lastName VARCHAR(255) NOT NULL,
	country VARCHAR(255) NOT NULL,
	zipCode VARCHAR(255) NOT NULL,
	streetName VARCHAR(255) NOT NULL,
	streetNumber VARCHAR(255) NOT NULL,
	
	CONSTRAINT PK_ID PRIMARY KEY (id)
);


CREATE TABLE PROFILE (
	id INT NOT NULL,
	age VARCHAR(255),
	imageUrl VARCHAR(255),
	maritalStatus VARCHAR(255),
	hairColor VARCHAR(255),
	eyeColor VARCHAR(255),
	height VARCHAR(255),
	weight VARCHAR(255),
	profession VARCHAR(255),
	nationality VARCHAR(255),
	religion VARCHAR(255),
	hobbies VARCHAR(255),
	additionalInfo VARCHAR(1024),
	lng DOUBLE,
	lat DOUBLE,
	additionalInfo VARCHAR(255),
	
	CONSTRAINT PK_ID PRIMARY KEY (id)
);


CREATE TABLE INTERESTEDIN (
	id INT NOT NULL,
	maritalStatus VARCHAR(255),
	gender VARCHAR(255),
	hairColor VARCHAR(255),
	eyeColor VARCHAR(255),
	heightMin VARCHAR(255),
	heightMax VARCHAR(255),
	weightMin VARCHAR(255),
	weightMax VARCHAR(255),
	ageMin VARCHAR(255),
	ageMax VARCHAR(255),
	profession VARCHAR(255),
	nationality VARCHAR(255),
	religion VARCHAR(255),
	hobbies VARCHAR(255),
	
	
	CONSTRAINT PK_ID PRIMARY KEY (id)
);