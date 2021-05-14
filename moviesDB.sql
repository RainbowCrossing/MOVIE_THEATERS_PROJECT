create table Movies (
moviesId integer not null,
title varchar(50) not null,
description varchar(1000),
duartion varchar(10),
poster varchar(200),
time1 varchar(10),
time2 varchar(10),
time3 varchar(10),
time4 varchar(10),
time5 varchar(10),
primary key (moviesId));

create table Theaters (
theatersId integer not null,
theaterName varchar(50) not null,
address varchar(50) not null,
city varchar(20) not null,
states varchar(2) not null,
zipCode varchar(5) not null,
primary key (theatersId));

create table theatersMovies (
theatersId integer not null,
moviesId integer not null,
primary key (theatersId, moviesId));

insert into Movies (moviesId, title, description, duartion, poster, time1, time2, time3, time4, time5)
	values (1, 'Dolittle', 'Dr. John Dolittle lives in solitude behind the high walls of his lush manor in 19th-century England. His only companionship comes from an array of exotic animals that he speaks to on a daily basis. But when young Queen Victoria becomes gravely ill, the eccentric doctor and his furry friends embark on an epic adventure to a mythical island to find the cure.', '101 min', 'doliitle.jpg', '10:00', '11:15', '12:30', '14:45', '17:00');
insert into Movies (moviesId, title, description, duartion, poster, time1, time2, time3, time4, time5)
	values (2, 'Frozen 2', 'Anna, Elsa, Kristoff, Olaf and Sven leave Arendelle to travel to an ancient, autumn-bound forest of an enchanted land. They set out to find the origin of Elsas powers in order to save their kingdom.', '103 min', 'frozen.jpg', '12:00', '13:15', '15:30', '16:45', '17:00');
insert into Movies (moviesId, title, description, duartion, poster, time1, time2, time3, time4, time5)
	values (3, 'Jumanji: Welcome to the Jungle', 'Four teenagers are sucked into a magical video game, and the only way they can escape is to work together to finish the game.', '119 min', 'jumanji.jpg', '10:00', '11:00', '12:00', '17:00', '18:00');
insert into Movies (moviesId, title, description, duartion, poster, time1, time2, time3, time4, time5)
	values (4, 'The Spongebob Movie: Sponge on the Run', 'After SpongeBobs beloved pet snail Gary is snail-napped, he and Patrick embark on an epic adventure to The Lost City of Atlantic City to bring Gary home.', '100 min', 'spongebob.jpg', '09:00', '10:30', '12:15', '13:00', '15:30');
insert into Movies (moviesId, title, description, duartion, poster, time1, time2, time3, time4, time5)
	values (5, 'Toy Story 4', 'When a new toy called "Forky" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.', '100 min', 'toystory.jpg', '10:15', '11:15', '12:00', '12:45', '14:00');
	
insert into Theaters (theatersId, theaterName, address, city, states, zipCode)
	values (1, 'Cinemark 15', '2401 S. Stemmons Freeway', 'Lewisville', 'TX', '75067');
insert into Theaters (theatersId, theaterName, address, city, states, zipCode)
	values (2, 'Cinemark 14', '850 E. Hwy 114', 'Roanoke', 'TX', '76262');
insert into Theaters (theatersId, theaterName, address, city, states, zipCode)
	values (3, 'Tinseltown Movies 17', '911 State Hwy. 114 West', 'Grapevine', 'TX', '76051');
insert into Theaters (theatersId, theaterName, address, city, states, zipCode)
	values (4, 'Moviehouse & Eatery', '951 Long Prairie Road', 'Flower Mound', 'TX', '75022');
insert into Theaters (theatersId, theaterName, address, city, states, zipCode)
	values (5, 'Studio Movie Grill', '4800 State Hwy. 121', 'The Colony', 'TX', '75056');
	
insert into theatersMovies (theatersId, moviesId)
	values (1, 1);
insert into theatersMovies (theatersId, moviesId)
	values (1, 2);
insert into theatersMovies (theatersId, moviesId)
	values (1, 3);
insert into theatersMovies (theatersId, moviesId)
	values (1, 4);
insert into theatersMovies (theatersId, moviesId)
	values (1, 5);
insert into theatersMovies (theatersId, moviesId)
	values (2, 1);
insert into theatersMovies (theatersId, moviesId)
	values (3, 2);
insert into theatersMovies (theatersId, moviesId)
	values (4, 3);
insert into theatersMovies (theatersId, moviesId)
	values (5, 4);