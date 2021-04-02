/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.6-MariaDB : Database - gelaro_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gelaro_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `gelaro_db`;

/*Table structure for table `categories_tb` */

DROP TABLE IF EXISTS `categories_tb`;

CREATE TABLE `categories_tb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cateory_name` varchar(100) NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `categories_tb` */

insert  into `categories_tb`(`id`,`cateory_name`,`created_at`) values 
(1,'Category A','2020-10-26 11:07:55'),
(2,'Category B','2020-10-26 11:07:55'),
(3,'Category C','2020-10-26 11:07:55'),
(4,'Category D','2020-10-26 11:07:55'),
(5,'Category E','2020-10-26 11:07:55');

/*Table structure for table `contributors_tb` */

DROP TABLE IF EXISTS `contributors_tb`;

CREATE TABLE `contributors_tb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `kind` enum('vendor','venue') NOT NULL DEFAULT 'vendor',
  `category_id` bigint(20) NOT NULL,
  `email_address` varchar(200) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `password_access` varchar(200) NOT NULL,
  `token` varchar(100) NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `contributors_tb` */

insert  into `contributors_tb`(`id`,`title`,`user_name`,`kind`,`category_id`,`email_address`,`phone`,`address`,`password_access`,`token`,`created_at`) values 
(1,'PT. Alat Pesta Jakarta','Pebri','vendor',1,'juri@pebriant.uni.my','081510193960','JL. Jakarta Raya','password','d960b2da3b882c5456909a9dc43a159f','2020-10-26 05:52:33');

/*Table structure for table `users_tb` */

DROP TABLE IF EXISTS `users_tb`;

CREATE TABLE `users_tb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(200) NOT NULL,
  `email_address` varchar(200) NOT NULL,
  `password_user` varchar(200) DEFAULT NULL,
  `token` varchar(100) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `users_tb` */

insert  into `users_tb`(`id`,`full_name`,`email_address`,`password_user`,`token`,`created_at`) values 
(1,'Pebrian','juri@pebriant.uni.me','5f4dcc3b5aa765d61d8327deb882cf99','d2339391a9cb2ae64b325ab670075079','2020-10-26 04:55:53'),
(2,'pebri','pebri@gmail.com',NULL,NULL,'2021-03-29 16:01:32'),
(3,'nama satu','nama@gmail.com',NULL,NULL,'2021-03-29 16:02:28'),
(4,'aaa','aaaa@gmail.com',NULL,NULL,'2021-03-29 16:04:30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
