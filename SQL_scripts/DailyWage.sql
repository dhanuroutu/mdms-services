-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.7.36 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for mdms
CREATE DATABASE IF NOT EXISTS `mdms` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mdms`;

-- Dumping structure for table mdms.daily_wage
CREATE TABLE IF NOT EXISTS `daily_wage` (
  `wage_id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `num_of_units` float DEFAULT NULL,
  PRIMARY KEY (`wage_id`),
  UNIQUE KEY `UniqueKey` (`date`,`employee_id`)
) ENGINE=MyISAM AUTO_INCREMENT=125 DEFAULT CHARSET=latin1;

-- Dumping data for table mdms.daily_wage: 119 rows
/*!40000 ALTER TABLE `daily_wage` DISABLE KEYS */;
INSERT INTO `daily_wage` (`wage_id`, `date`, `employee_id`, `num_of_units`) VALUES
	(2, '2021-11-25', 2, 1223),
	(3, '2021-11-25', 1, 122),
	(4, '2021-11-26', 1, 1111),
	(5, '2021-11-26', 2, 2222),
	(124, '2021-11-26', 3, 1234);
/*!40000 ALTER TABLE `daily_wage` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
