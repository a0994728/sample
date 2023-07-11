drop table if exists `tbl_city`;
drop table if exists `tbl_country_language`;
drop table if exists `tbl_country`;

CREATE TABLE `tbl_country` (
  `country_code` varchar(3) DEFAULT '',
  `country_name` varchar(52) DEFAULT '',
  `continent` enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') DEFAULT 'Asia',
  `region` varchar(26) DEFAULT '',
  `surface_area` decimal(10,2) DEFAULT '0.00',
  `indep_year` smallint DEFAULT NULL,
  `country_population` int DEFAULT '0',
  `life_expectancy` decimal(3,1) DEFAULT NULL,
  `GNP` decimal(10,2) DEFAULT NULL,
  `GNPOld` decimal(10,2) DEFAULT NULL,
  `local_name` varchar(45) DEFAULT '',
  `government_form` varchar(45) DEFAULT '',
  `head_of_state` varchar(60) DEFAULT NULL,
  `capital` int DEFAULT NULL,
  `code2` varchar(2) DEFAULT '',
  PRIMARY KEY (`country_code`)
);

CREATE TABLE `tbl_city` (
  `city_id` int default '1',
  `city_name` varchar(35) DEFAULT '',
  `country_code` varchar(3) NOT NULL DEFAULT '',
  `district` varchar(20) DEFAULT '',
  `city_population` int DEFAULT '0',
  PRIMARY KEY (`city_id`)
);

CREATE TABLE `tbl_country_language` (
  `country_code` varchar(3) DEFAULT '',
  `language` varchar(30) DEFAULT '',
  `is_official` enum('T','F') DEFAULT 'F',
  `percentage` decimal(4,1) DEFAULT '0.0',
  PRIMARY KEY (`country_code`,`language`)
);