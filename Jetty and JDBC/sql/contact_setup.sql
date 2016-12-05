# create table of professors
CREATE TABLE contact_names (
usfid   CHAR(10)    NOT NULL PRIMARY KEY,
first   VARCHAR(20) NOT NULL,
last    VARCHAR(20) NOT NULL
);

# insert professors into table
# official usf email will be usfid@usfca.edu
INSERT INTO contact_names
(usfid, first, last)
VALUES
('apjoshi',   'Alark',   'Joshi'  ),
('benson',    'Greg',    'Benson' ),
('ejung2',    'EJ',      'Jung'   ),
('galles',    'David',   'Galles' ),
('peter',     'Peter',   'Pacheco'),
('sjengle',   'Sophie',  'Engle'  ),
('snrollins', 'Sami',    'Rollins'),
('tjparr',    'Terence', 'Parr'   ),
('wolberd',   'David',   'Wolber' ),
('byuksel',   'Beste',   'Yuksel' );

# create table of professors' twitter accounts
CREATE TABLE contact_twitter (
twitterid   CHAR(15) NOT NULL PRIMARY KEY,
usfid       CHAR(10) NOT NULL,
FOREIGN KEY (usfid)
REFERENCES  contact_names (usfid)
);

# insert known twitter accounts
INSERT INTO contact_twitter
(usfid, twitterid)
VALUES
('benson',    'gregorydbenson'),
('sjengle',   'sjengle'),
('apjoshi',   'alark'),
('tjparr',    'the_antlr_guy'),
('snrollins', 'samirollins'),
('wolberd',   'wolberd'),
('byuksel',   'BesteFYuksel');

# create table of professors' recent undergraduate courses
CREATE TABLE contact_courses (
courseid INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
usfid    CHAR(10) NOT NULL,
course   CHAR(10) NOT NULL,
FOREIGN KEY (usfid)
REFERENCES  contact_names (usfid)
);

# insert recent undergraduate courses
INSERT INTO contact_courses
(usfid, course)
VALUES
('ejung2',    'CS 480' ),
('galles',    'CS 420' ),
('galles',    'CS 411' ),
('sjengle',   'CS 360' ),
('tjparr',    'CS 345' ),
('ejung2',    'CS 333' ),
('benson',    'CS 326' ),
('peter',     'CS 315' ),
('galles',    'CS 245' ),
('peter',     'CS 220' ),
('sjengle',   'CS 212' ),
('snrollins', 'CS 212' ),
('snrollins', 'CS 112' ),
('ejung2',    'CS 112' ),
('apjoshi',   'CS 112' ),
('apjoshi',   'CS 110' ),
('tjparr',    'CS 110' ),
('benson',    'CS 110' ),
('wolberd',   'CS 107' ),
('snrollins', 'CS 107' ),
('apjoshi',   'CS 107' ),
('byuksel',   'CS 107' );
