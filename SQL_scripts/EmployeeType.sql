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

-- Dumping structure for table mdms.employee_type
CREATE TABLE IF NOT EXISTS `employee_type` (
  `emp_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_type` varchar(255) DEFAULT NULL,
  `type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table mdms.employee_type: 0 rows
/*!40000 ALTER TABLE `employee_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_type` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
