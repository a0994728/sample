drop table if exists `tbl_country`;

CREATE TABLE `tbl_country` (
  `country_code` varchar(3) NOT NULL DEFAULT '',
  `country_name` char(52) NOT NULL DEFAULT '',
  `continent` enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') NOT NULL DEFAULT 'Asia',
  `region` char(26) NOT NULL DEFAULT '',
  `surface_area` decimal(10,2) NOT NULL DEFAULT '0.00',
  `indep_year` smallint DEFAULT NULL,
  `country_population` int NOT NULL DEFAULT '0',
  `life_expectancy` decimal(3,1) DEFAULT NULL,
  `GNP` decimal(10,2) DEFAULT NULL,
  `GNPOld` decimal(10,2) DEFAULT NULL,
  `local_name` char(45) NOT NULL DEFAULT '',
  `government_form` char(45) NOT NULL DEFAULT '',
  `head_of_state` char(60) DEFAULT NULL,
  `capital` int DEFAULT NULL,
  `code2` char(2) NOT NULL DEFAULT '',
  PRIMARY KEY (`country_code`)
);

INSERT INTO `tbl_country` VALUES ('ABW','Aruba','North America','Caribbean',193.00,NULL,103000,78.4,828.00,793.00,'Aruba','Nonmetropolitan Territory of The Netherlands','Beatrix',129,'AW');
INSERT INTO `tbl_country` VALUES ('AFG','Afghanistan','Asia','Southern and Central Asia',652090.00,1919,22720000,45.9,5976.00,NULL,'Afganistan/Afqanestan','Islamic Emirate','Mohammad Omar',1,'AF');
INSERT INTO `tbl_country` VALUES ('AGO','Angola','Africa','Central Africa',1246700.00,1975,12878000,38.3,6648.00,7984.00,'Angola','Republic','José Eduardo dos Santos',56,'AO');
INSERT INTO `tbl_country` VALUES ('AIA','Anguilla','North America','Caribbean',96.00,NULL,8000,76.1,63.20,NULL,'Anguilla','Dependent Territory of the UK','Elisabeth II',62,'AI');
INSERT INTO `tbl_country` VALUES ('ALB','Albania','Europe','Southern Europe',28748.00,1912,3401200,71.6,3205.00,2500.00,'Shqipëria','Republic','Rexhep Mejdani',34,'AL');
INSERT INTO `tbl_country` VALUES ('AND','Andorra','Europe','Southern Europe',468.00,1278,78000,83.5,1630.00,NULL,'Andorra','Parliamentary Coprincipality','',55,'AD');
INSERT INTO `tbl_country` VALUES ('ANT','Netherlands Antilles','North America','Caribbean',800.00,NULL,217000,74.7,1941.00,NULL,'Nederlandse Antillen','Nonmetropolitan Territory of The Netherlands','Beatrix',33,'AN');
INSERT INTO `tbl_country` VALUES ('ARE','United Arab Emirates','Asia','Middle East',83600.00,1971,2441000,74.1,37966.00,36846.00,'Al-Imarat al-´Arabiya al-Muttahida','Emirate Federation','Zayid bin Sultan al-Nahayan',65,'AE');
INSERT INTO `tbl_country` VALUES ('ARG','Argentina','South America','South America',2780400.00,1816,37032000,75.1,340238.00,323310.00,'Argentina','Federal Republic','Fernando de la Rúa',69,'AR');
INSERT INTO `tbl_country` VALUES ('ARM','Armenia','Asia','Middle East',29800.00,1991,3520000,66.4,1813.00,1627.00,'Hajastan','Republic','Robert Kotšarjan',126,'AM');
INSERT INTO `tbl_country` VALUES ('ASM','American Samoa','Oceania','Polynesia',199.00,NULL,68000,75.1,334.00,NULL,'Amerika Samoa','US Territory','George W. Bush',54,'AS');
INSERT INTO `tbl_country` VALUES ('ATA','Antarctica','Antarctica','Antarctica',13120000.00,NULL,0,NULL,0.00,NULL,'–','Co-administrated','',NULL,'AQ');
INSERT INTO `tbl_country` VALUES ('ATF','French Southern territories','Antarctica','Antarctica',7780.00,NULL,0,NULL,0.00,NULL,'Terres australes françaises','Nonmetropolitan Territory of France','Jacques Chirac',NULL,'TF');
INSERT INTO `tbl_country` VALUES ('ATG','Antigua and Barbuda','North America','Caribbean',442.00,1981,68000,70.5,612.00,584.00,'Antigua and Barbuda','Constitutional Monarchy','Elisabeth II',63,'AG');
INSERT INTO `tbl_country` VALUES ('AUS','Australia','Oceania','Australia and New Zealand',7741220.00,1901,18886000,79.8,351182.00,392911.00,'Australia','Constitutional Monarchy, Federation','Elisabeth II',135,'AU');
INSERT INTO `tbl_country` VALUES ('AUT','Austria','Europe','Western Europe',83859.00,1918,8091800,77.7,211860.00,206025.00,'Österreich','Federal Republic','Thomas Klestil',1523,'AT');
INSERT INTO `tbl_country` VALUES ('AZE','Azerbaijan','Asia','Middle East',86600.00,1991,7734000,62.9,4127.00,4100.00,'Azärbaycan','Federal Republic','Heydär Äliyev',144,'AZ');
INSERT INTO `tbl_country` VALUES ('BDI','Burundi','Africa','Eastern Africa',27834.00,1962,6695000,46.2,903.00,982.00,'Burundi/Uburundi','Republic','Pierre Buyoya',552,'BI');
INSERT INTO `tbl_country` VALUES ('BEL','Belgium','Europe','Western Europe',30518.00,1830,10239000,77.8,249704.00,243948.00,'België/Belgique','Constitutional Monarchy, Federation','Albert II',179,'BE');
INSERT INTO `tbl_country` VALUES ('BEN','Benin','Africa','Western Africa',112622.00,1960,6097000,50.2,2357.00,2141.00,'Bénin','Republic','Mathieu Kérékou',187,'BJ');
INSERT INTO `tbl_country` VALUES ('BFA','Burkina Faso','Africa','Western Africa',274000.00,1960,11937000,46.7,2425.00,2201.00,'Burkina Faso','Republic','Blaise Compaoré',549,'BF');
INSERT INTO `tbl_country` VALUES ('BGD','Bangladesh','Asia','Southern and Central Asia',143998.00,1971,129155000,60.2,32852.00,31966.00,'Bangladesh','Republic','Shahabuddin Ahmad',150,'BD');
INSERT INTO `tbl_country` VALUES ('BGR','Bulgaria','Europe','Eastern Europe',110994.00,1908,8190900,70.9,12178.00,10169.00,'Balgarija','Republic','Petar Stojanov',539,'BG');
INSERT INTO `tbl_country` VALUES ('BHR','Bahrain','Asia','Middle East',694.00,1971,617000,73.0,6366.00,6097.00,'Al-Bahrayn','Monarchy (Emirate)','Hamad ibn Isa al-Khalifa',149,'BH');
INSERT INTO `tbl_country` VALUES ('BHS','Bahamas','North America','Caribbean',13878.00,1973,307000,71.1,3527.00,3347.00,'The Bahamas','Constitutional Monarchy','Elisabeth II',148,'BS');
INSERT INTO `tbl_country` VALUES ('BIH','Bosnia and Herzegovina','Europe','Southern Europe',51197.00,1992,3972000,71.5,2841.00,NULL,'Bosna i Hercegovina','Federal Republic','Ante Jelavic',201,'BA');
INSERT INTO `tbl_country` VALUES ('BLR','Belarus','Europe','Eastern Europe',207600.00,1991,10236000,68.0,13714.00,NULL,'Belarus','Republic','Aljaksandr Lukašenka',3520,'BY');
INSERT INTO `tbl_country` VALUES ('BLZ','Belize','North America','Central America',22696.00,1981,241000,70.9,630.00,616.00,'Belize','Constitutional Monarchy','Elisabeth II',185,'BZ');
INSERT INTO `tbl_country` VALUES ('BMU','Bermuda','North America','North America',53.00,NULL,65000,76.9,2328.00,2190.00,'Bermuda','Dependent Territory of the UK','Elisabeth II',191,'BM');
INSERT INTO `tbl_country` VALUES ('BOL','Bolivia','South America','South America',1098581.00,1825,8329000,63.7,8571.00,7967.00,'Bolivia','Republic','Hugo Bánzer Suárez',194,'BO');
INSERT INTO `tbl_country` VALUES ('BRA','Brazil','South America','South America',8547403.00,1822,170115000,62.9,776739.00,804108.00,'Brasil','Federal Republic','Fernando Henrique Cardoso',211,'BR');
INSERT INTO `tbl_country` VALUES ('BRB','Barbados','North America','Caribbean',430.00,1966,270000,73.0,2223.00,2186.00,'Barbados','Constitutional Monarchy','Elisabeth II',174,'BB');
INSERT INTO `tbl_country` VALUES ('BRN','Brunei','Asia','Southeast Asia',5765.00,1984,328000,73.6,11705.00,12460.00,'Brunei Darussalam','Monarchy (Sultanate)','Haji Hassan al-Bolkiah',538,'BN');
INSERT INTO `tbl_country` VALUES ('BTN','Bhutan','Asia','Southern and Central Asia',47000.00,1910,2124000,52.4,372.00,383.00,'Druk-Yul','Monarchy','Jigme Singye Wangchuk',192,'BT');
INSERT INTO `tbl_country` VALUES ('BVT','Bouvet Island','Antarctica','Antarctica',59.00,NULL,0,NULL,0.00,NULL,'Bouvetøya','Dependent Territory of Norway','Harald V',NULL,'BV');
INSERT INTO `tbl_country` VALUES ('BWA','Botswana','Africa','Southern Africa',581730.00,1966,1622000,39.3,4834.00,4935.00,'Botswana','Republic','Festus G. Mogae',204,'BW');
INSERT INTO `tbl_country` VALUES ('CAF','Central African Republic','Africa','Central Africa',622984.00,1960,3615000,44.0,1054.00,993.00,'Centrafrique/Bê-Afrîka','Republic','Ange-Félix Patassé',1889,'CF');
INSERT INTO `tbl_country` VALUES ('CAN','Canada','North America','North America',9970610.00,1867,31147000,79.4,598862.00,625626.00,'Canada','Constitutional Monarchy, Federation','Elisabeth II',1822,'CA');
INSERT INTO `tbl_country` VALUES ('CCK','Cocos (Keeling) Islands','Oceania','Australia and New Zealand',14.00,NULL,600,NULL,0.00,NULL,'Cocos (Keeling) Islands','Territory of Australia','Elisabeth II',2317,'CC');
INSERT INTO `tbl_country` VALUES ('CHE','Switzerland','Europe','Western Europe',41284.00,1499,7160400,79.6,264478.00,256092.00,'Schweiz/Suisse/Svizzera/Svizra','Federation','Adolf Ogi',3248,'CH');
INSERT INTO `tbl_country` VALUES ('CHL','Chile','South America','South America',756626.00,1810,15211000,75.7,72949.00,75780.00,'Chile','Republic','Ricardo Lagos Escobar',554,'CL');

drop table if exists `tbl_city`;

CREATE TABLE `tbl_city` (
  `city_id` int NOT NULL default '1',
  `city_name` char(35) NOT NULL DEFAULT '',
  `country_code` char(3) NOT NULL DEFAULT '',
  `district` char(20) NOT NULL DEFAULT '',
  `city_population` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`city_id`)
);

INSERT INTO `tbl_city` VALUES (1,'Kabul','AFG','Kabol',1780000);
INSERT INTO `tbl_city` VALUES (2,'Qandahar','AFG','Qandahar',237500);
INSERT INTO `tbl_city` VALUES (3,'Herat','AFG','Herat',186800);
INSERT INTO `tbl_city` VALUES (4,'Mazar-e-Sharif','AFG','Balkh',127800);
INSERT INTO `tbl_city` VALUES (5,'Amsterdam','NLD','Noord-Holland',731200);
INSERT INTO `tbl_city` VALUES (6,'Rotterdam','NLD','Zuid-Holland',593321);
INSERT INTO `tbl_city` VALUES (7,'Haag','NLD','Zuid-Holland',440900);
INSERT INTO `tbl_city` VALUES (8,'Utrecht','NLD','Utrecht',234323);
INSERT INTO `tbl_city` VALUES (9,'Eindhoven','NLD','Noord-Brabant',201843);
INSERT INTO `tbl_city` VALUES (10,'Tilburg','NLD','Noord-Brabant',193238);
INSERT INTO `tbl_city` VALUES (11,'Groningen','NLD','Groningen',172701);
INSERT INTO `tbl_city` VALUES (12,'Breda','NLD','Noord-Brabant',160398);
INSERT INTO `tbl_city` VALUES (13,'Apeldoorn','NLD','Gelderland',153491);
INSERT INTO `tbl_city` VALUES (14,'Nijmegen','NLD','Gelderland',152463);
INSERT INTO `tbl_city` VALUES (15,'Enschede','NLD','Overijssel',149544);
INSERT INTO `tbl_city` VALUES (16,'Haarlem','NLD','Noord-Holland',148772);
INSERT INTO `tbl_city` VALUES (17,'Almere','NLD','Flevoland',142465);
INSERT INTO `tbl_city` VALUES (18,'Arnhem','NLD','Gelderland',138020);
INSERT INTO `tbl_city` VALUES (19,'Zaanstad','NLD','Noord-Holland',135621);
INSERT INTO `tbl_city` VALUES (20,'´s-Hertogenbosch','NLD','Noord-Brabant',129170);
INSERT INTO `tbl_city` VALUES (21,'Amersfoort','NLD','Utrecht',126270);
INSERT INTO `tbl_city` VALUES (22,'Maastricht','NLD','Limburg',122087);
INSERT INTO `tbl_city` VALUES (23,'Dordrecht','NLD','Zuid-Holland',119811);
INSERT INTO `tbl_city` VALUES (24,'Leiden','NLD','Zuid-Holland',117196);
INSERT INTO `tbl_city` VALUES (25,'Haarlemmermeer','NLD','Noord-Holland',110722);
INSERT INTO `tbl_city` VALUES (26,'Zoetermeer','NLD','Zuid-Holland',110214);
INSERT INTO `tbl_city` VALUES (27,'Emmen','NLD','Drenthe',105853);
INSERT INTO `tbl_city` VALUES (28,'Zwolle','NLD','Overijssel',105819);
INSERT INTO `tbl_city` VALUES (29,'Ede','NLD','Gelderland',101574);
INSERT INTO `tbl_city` VALUES (30,'Delft','NLD','Zuid-Holland',95268);
INSERT INTO `tbl_city` VALUES (31,'Heerlen','NLD','Limburg',95052);
INSERT INTO `tbl_city` VALUES (32,'Alkmaar','NLD','Noord-Holland',92713);
INSERT INTO `tbl_city` VALUES (33,'Willemstad','ANT','Curaçao',2345);
INSERT INTO `tbl_city` VALUES (34,'Tirana','ALB','Tirana',270000);
INSERT INTO `tbl_city` VALUES (35,'Alger','DZA','Alger',2168000);
INSERT INTO `tbl_city` VALUES (36,'Oran','DZA','Oran',609823);
INSERT INTO `tbl_city` VALUES (37,'Constantine','DZA','Constantine',443727);
INSERT INTO `tbl_city` VALUES (38,'Annaba','DZA','Annaba',222518);
INSERT INTO `tbl_city` VALUES (39,'Batna','DZA','Batna',183377);
INSERT INTO `tbl_city` VALUES (40,'Sétif','DZA','Sétif',179055);
INSERT INTO `tbl_city` VALUES (41,'Sidi Bel Abbès','DZA','Sidi Bel Abbès',153106);

