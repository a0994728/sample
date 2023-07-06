drop table if exists `tbl_city`;
drop table if exists `tbl_country`;

CREATE TABLE `tbl_country` (
  `country_code` char(3) DEFAULT '',
  `country_name` char(52) DEFAULT '',
  `continent` enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') DEFAULT 'Asia',
  `region` char(26) DEFAULT '',
  `surface_area` decimal(10,2) DEFAULT '0.00',
  `indep_year` smallint DEFAULT NULL,
  `country_population` int DEFAULT '0',
  `life_expectancy` decimal(3,1) DEFAULT NULL,
  `GNP` decimal(10,2) DEFAULT NULL,
  `GNPOld` decimal(10,2) DEFAULT NULL,
  `local_name` char(45) DEFAULT '',
  `government_form` char(45) DEFAULT '',
  `head_of_state` char(60) DEFAULT NULL,
  `capital` int DEFAULT NULL,
  `code2` char(2) DEFAULT '',
  PRIMARY KEY (`country_code`)
);


CREATE TABLE `tbl_city` (
  `city_id` int default '1',
  `city_name` char(35) DEFAULT '',
  `country_code` char(3) NOT NULL DEFAULT '',
  `district` char(20) DEFAULT '',
  `city_population` int DEFAULT '0',
  PRIMARY KEY (`city_id`)
);