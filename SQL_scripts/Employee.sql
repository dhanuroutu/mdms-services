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

-- Dumping structure for table mdms.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `contact_number` varchar(255) DEFAULT NULL,
  `employee_type` int(11) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `govt_id` varchar(255) DEFAULT NULL,
  `govt_id_proof_type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table mdms.employee: 6 rows
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`, `address`, `age`, `contact_number`, `employee_type`, `gender`, `govt_id`, `govt_id_proof_type`, `name`, `is_active`) VALUES
	(1, 'KJHJKHJK', NULL, '09912951395', 1, 'Male', 'HKHKJJKJ', 'LKJL', 'HANUMANTHA RAO', b'1'),
	(2, 'adf;lkajs;djf', NULL, '1324324132412', 1, 'Male', 'adsfa', 'addhar', 'Dhanu', b'1'),
	(3, 'asdfasdfasdf', NULL, '132432424', 1, 'Female', 'adsfasd', 'adsfas', 'DhanaLakshmi', b'1'),
	(4, 'KJHJKHJK', 45, '765778', 5, 'Male', 'HKHKJJKJ', 'JGHJGJG', 'HGGH', b'1'),
	(5, 'tyerteyte', 34, '2345678', 45, 'Male', '132432d', 'JGHJGJG', 'adsgfdsgsd', b'1'),
	(6, 'sfdsfasdasdfas', 34, '09505129519', 12, 'Female', 'adfasdf', 'adsfasdf', 'APPALA', b'1');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
