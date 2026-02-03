CREATE TABLE artist(id UUID PRIMARY KEY,name VARCHAR(150),type VARCHAR(20));
CREATE TABLE album(id UUID PRIMARY KEY,title VARCHAR(200),release_year INT);
CREATE TABLE artist_album(artist_id UUID,album_id UUID);
