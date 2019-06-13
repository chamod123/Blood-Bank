/*
SQLyog Ultimate v8.55 
MySQL - 5.5.8-log : Database - blood
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blood` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `blood`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `AdminId` int(5) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `Password` varchar(25) NOT NULL,
  `UserName` varchar(5) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`AdminId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`AdminId`,`Name`,`Password`,`UserName`,`email`) values (1,'chamod','1234','cwije','chamod@gmail.com'),(2,'ishara','1234','isha','kaisharaprasanna@gmail.com'),(3,'Indika Wijeweera','1234','indi','indineowijeweera@gmail.com'),(4,'Isuru Devinda','1234','issa','Isuru050@gmail.com');

/*Table structure for table `bloodtype` */

DROP TABLE IF EXISTS `bloodtype`;

CREATE TABLE `bloodtype` (
  `TypeId` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(5) NOT NULL,
  `RH` varchar(5) NOT NULL,
  PRIMARY KEY (`TypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `bloodtype` */

insert  into `bloodtype`(`TypeId`,`Type`,`RH`) values (1,'A','+'),(2,'A','-'),(3,'B','+'),(4,'B','-'),(5,'O','+'),(6,'O','-'),(7,'AB','+'),(8,'AB','-');

/*Table structure for table `doner_detail` */

DROP TABLE IF EXISTS `doner_detail`;

CREATE TABLE `doner_detail` (
  `DdetailId` int(5) NOT NULL AUTO_INCREMENT,
  `DonerId` int(5) NOT NULL,
  `StockId` int(5) NOT NULL,
  `Descreption` varchar(30) DEFAULT NULL,
  `InsertDate` datetime DEFAULT NULL,
  PRIMARY KEY (`DdetailId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `doner_detail` */

insert  into `doner_detail`(`DdetailId`,`DonerId`,`StockId`,`Descreption`,`InsertDate`) values (1,1,1,'Donation','2017-09-24 20:48:21'),(2,2,2,'Donation','2017-10-12 00:09:17'),(3,3,3,'Donation','2017-10-12 00:10:56'),(4,3,4,'Donation','2017-10-12 00:13:39'),(5,3,5,'Donation','2017-10-12 20:19:03'),(6,3,6,'Donation','2017-10-12 20:20:39'),(7,2,9,'Donation','2017-10-12 21:04:05'),(8,3,11,'Donation','2017-10-16 21:32:11'),(9,4,12,'Donation','2017-10-17 21:57:41'),(10,5,13,'Donation','2017-10-22 10:43:44'),(11,6,14,'Donation','2017-10-22 10:49:16'),(12,12,15,'test ','2017-10-29 21:50:34'),(13,1,16,'Birthday Donation','2017-11-03 11:37:16');

/*Table structure for table `donor` */

DROP TABLE IF EXISTS `donor`;

CREATE TABLE `donor` (
  `DonorId` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `barcodeNo` varchar(5) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `BirthDay` varchar(10) DEFAULT NULL,
  `type` varchar(5) NOT NULL,
  `contactNo1` int(10) DEFAULT NULL,
  `contactNo2` int(10) DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  PRIMARY KEY (`DonorId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `donor` */

insert  into `donor`(`DonorId`,`name`,`address`,`barcodeNo`,`gender`,`BirthDay`,`type`,`contactNo1`,`contactNo2`,`Weight`) values (1,'Chamod Wijesena','Panadura',NULL,'Male','2000-01-28','3',778458964,781265237,NULL),(2,'Kushan Perera','Kaluthara,\n Wadduwa',NULL,'Male','1999-05-06','1',775854125,729357823,NULL),(3,'Kamal Priyankara','Samagi mawatha,Gampaha	',NULL,'Male','1994-04-08','7',727465032,756984421,NULL),(4,'Ruwanthi Dilshani','Kalubovila, Dehiwala',NULL,'Female','1998-05-17','6',752930455,778568458,NULL),(5,'Sadali Piyumika','Pansala para, Kelaniya',NULL,'Female','1995-11-19','5',712804944,720832875,NULL),(6,'Sanjaya Jayasinghe','Uduwana, Homagama',NULL,'Male','1995-11-20','8',777443732,714437342,NULL),(7,'Pradeep Rangana','Thalagala, Moragahena',NULL,'Male','1992-10-03','2',715263296,775396821,NULL),(8,'Sangeeth Wijesooriya','Pannipitiya, Maharagama',NULL,'Male','1990-03-22','1',729034539,787653123,NULL),(9,'Sumedha Wanigarathne','Station Road, Homagama',NULL,'Female','1994-12-08','4',776521342,782131575,NULL),(10,'Lihini Kaushika','Stalion Road, Godagama',NULL,'Female','1998-05-28','4',719042364,712135413,NULL),(11,'Prabath Sankalpa','Diyagama, Homagama',NULL,'Male','1992-07-15','1',723042856,783675604,NULL),(12,'Sanweewani Perara','Dolahena, Kiriwattuduwa',NULL,'Female','1988-09-25','3',759302342,771231034,NULL),(13,'Kavindu Madhusanka','Hospital Road, Ragama',NULL,'Male','1990-06-01','8',776745213,759078313,NULL),(14,'Madhawa Sanjeewa','Puwakwatta, Godagama',NULL,'Male','1985-01-30','2',787532174,718634692,NULL),(15,'Tharindu Dilshan','Station Road, Awissawella',NULL,'Male','1990-12-29','5',776453214,771236537,NULL);

/*Table structure for table `hospital` */

DROP TABLE IF EXISTS `hospital`;

CREATE TABLE `hospital` (
  `HId` int(5) NOT NULL AUTO_INCREMENT,
  `HName` varchar(25) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Contact1` int(10) DEFAULT NULL,
  `Contact2` int(10) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`HId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `hospital` */

insert  into `hospital`(`HId`,`HName`,`Description`,`Contact1`,`Contact2`,`Address`) values (1,'Nawaloka','Welcome to tomorrow\'s health care',778565954,115965423,'colombo 8'),(2,'Asiri','Asiri Health, Live More',789654488,769854858,'Colombo 2'),(3,'Central ','Best hospital in Srilanka',774851520,115489625,'flower Road,\ncolombo 11.'),(4,'Lanka','Medical services that you can trust',112938432,115932641,'colombo 5'),(5,'Karapitiya','Genaral Hopital',915484414,778751244,'Karapitiya, Galle.'),(6,'Apeksha Hospital','Cancer Hospital',114587452,112548520,'Maharagama');

/*Table structure for table `pation` */

DROP TABLE IF EXISTS `pation`;

CREATE TABLE `pation` (
  `IDNumber` int(10) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `Gender` char(6) DEFAULT NULL,
  `age` int(3) NOT NULL,
  `Type` varchar(5) NOT NULL,
  `weight` int(3) NOT NULL,
  `contactNo1` int(10) NOT NULL,
  `ContactNo2` int(10) DEFAULT NULL,
  PRIMARY KEY (`IDNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pation` */

insert  into `pation`(`IDNumber`,`Name`,`address`,`Gender`,`age`,`Type`,`weight`,`contactNo1`,`ContactNo2`) values (75845896,'Sathsarani Perera','Maliban juntion, Rathmalana','Female',23,'4',56,789587451,789562104),(123456789,'Chamod wijesena','Panadura, Kaluthara','Male',21,'2',45,778954612,778784510),(134514254,'Vidura Perera 1','Pitipana south, Godagama','Female',25,'8',55,720342143,776532414),(546783442,'Dammika Wasanthi','Temple Road, Kadawata','Female',23,'3',63,776342420,713243458),(973292815,'shrimalka','kadawatha','Female',18,'2',35,778956412,789568452),(982345131,'Geeth Anjana','Uduwana Homagama','Male',50,'1',80,782135234,751239323),(983274663,'Hirumal Kumara','Station Road, Welawatta','Male',30,'6',60,714904325,782135411);

/*Table structure for table `request` */

DROP TABLE IF EXISTS `request`;

CREATE TABLE `request` (
  `RequestID` int(5) NOT NULL AUTO_INCREMENT,
  `PationId` int(5) DEFAULT '0',
  `HId` int(5) DEFAULT '0',
  `Date` datetime DEFAULT NULL,
  `TypeId` int(2) DEFAULT NULL,
  `Description` varchar(25) DEFAULT NULL,
  `RequestVol` int(5) DEFAULT NULL,
  `ConsultentName` varchar(25) DEFAULT NULL,
  `Settled` char(1) DEFAULT '0',
  `SettledDate` datetime DEFAULT NULL,
  PRIMARY KEY (`RequestID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `request` */

insert  into `request`(`RequestID`,`PationId`,`HId`,`Date`,`TypeId`,`Description`,`RequestVol`,`ConsultentName`,`Settled`,`SettledDate`) values (1,0,1,'2017-09-17 10:07:09',4,'Need Blood ',45,'Chamod Wijesena','0',NULL),(2,0,2,'2017-05-23 00:00:00',3,'Need Blood ',50,'Vidya Kalpani','1','2017-05-08 00:00:00'),(3,0,2,'2017-05-27 00:00:00',8,'Need Blood ',50,'Dilhan Pathirana','1','2017-10-22 10:52:11'),(4,0,1,'2017-05-05 00:00:00',6,'Need Blood ',3,'Deshan Perara','1','2017-10-17 22:04:29'),(5,0,1,'2017-08-28 00:00:00',4,'Need Blood ',65,'Ishara Prasanna','0',NULL),(6,0,2,'2017-05-08 00:00:00',2,'Need Blood ',4,'Isuru Devinda','1','2017-10-17 21:33:38'),(7,0,3,'2017-08-28 00:00:00',7,'Need Blood ',8,'Docter Silva','1','2017-10-17 22:36:14'),(8,0,2,'2017-09-04 00:00:00',7,'Need Blood ',5,'DR. Punchihewa','1','2017-10-17 22:39:34'),(9,0,3,'2017-10-10 00:00:00',7,'Need Blood ',12,'Nipuni Awarjana','1','2017-10-17 22:43:37'),(10,0,3,'2017-05-18 00:00:00',7,'Need Blood ',2,'Saranga Disasekara','1','2017-10-22 10:40:13'),(11,0,2,'2017-10-25 00:00:00',7,'Need Blood ',10,'Praveen Sandeepa','1','2017-10-22 11:52:52'),(12,0,4,'2017-10-26 00:00:00',1,'Need Blood ',2,'Nimal Jayasooriya','0',NULL),(13,0,1,'2017-10-26 00:00:00',2,'Need Blood',8,'Vinu Deelaka','0',NULL),(14,0,4,'2017-10-27 00:00:00',3,'Need Blood',20,'Thineth Sankalpa','0',NULL),(15,0,3,'2017-10-28 00:00:00',5,'Need Blood',40,'Sahan Nelaka','0',NULL),(16,0,1,'2017-00-03 00:00:00',1,'Donation',2,'Chamod wijesena','1','2017-10-28 14:44:53'),(17,0,2,'2017-00-07 00:00:00',2,'Need Blood fast',5,'Wijesooriya','1','2017-11-03 11:07:52'),(18,0,2,'2017-00-05 00:00:00',5,'Blood Reqest',15,'Demion ','0',NULL);

/*Table structure for table `respond` */

DROP TABLE IF EXISTS `respond`;

CREATE TABLE `respond` (
  `RespondId` int(5) NOT NULL AUTO_INCREMENT,
  `ResMas` int(5) NOT NULL,
  `StockID1` int(5) DEFAULT NULL,
  `StockID2` int(5) DEFAULT NULL,
  `StockID3` int(5) DEFAULT NULL,
  `StockID4` int(5) DEFAULT NULL,
  PRIMARY KEY (`RespondId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `respond` */

insert  into `respond`(`RespondId`,`ResMas`,`StockID1`,`StockID2`,`StockID3`,`StockID4`) values (1,1,1,0,0,0),(2,3,6,0,0,0),(3,4,11,0,0,0),(4,5,7,0,0,0),(5,6,4,0,0,0),(6,7,4,0,0,0),(7,1,7,0,0,0),(8,1,13,0,0,0),(9,1,5,0,0,0),(10,1,3,0,0,0),(11,1,1,0,0,0);

/*Table structure for table `respondmaster` */

DROP TABLE IF EXISTS `respondmaster`;

CREATE TABLE `respondmaster` (
  `ResMas` int(5) NOT NULL AUTO_INCREMENT,
  `RequestId` int(5) NOT NULL,
  `BType` int(5) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `ResVol` int(5) DEFAULT NULL,
  `Ishued` int(2) DEFAULT '0',
  `ishuedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ResMas`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `respondmaster` */

insert  into `respondmaster`(`ResMas`,`RequestId`,`BType`,`Date`,`ResVol`,`Ishued`,`ishuedDate`) values (1,1,4,'2017-10-08 00:28:21',5,1,'2017-10-09 21:14:22'),(2,2,3,'2017-10-09 21:14:22',7,1,'2017-10-15 12:03:48'),(3,6,2,'2017-10-17 21:33:37',6,0,NULL),(4,4,6,'2017-10-17 22:04:28',3,0,NULL),(5,7,7,'2017-10-17 22:36:14',8,0,NULL),(6,8,7,'2017-10-17 22:39:34',5,0,NULL),(7,9,7,'2017-10-17 22:43:37',12,0,NULL),(8,10,7,'2017-10-22 10:40:12',2,1,'2017-11-03 11:19:23'),(9,3,8,'2017-10-22 10:52:11',5,0,NULL),(10,11,7,'2017-10-22 11:52:52',10,0,NULL),(11,16,1,'2017-10-28 14:44:53',2,0,NULL),(12,17,2,'2017-11-03 11:07:52',5,0,NULL);

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `StockId` int(5) NOT NULL AUTO_INCREMENT,
  `AddedDate` datetime NOT NULL,
  `Vol` int(5) DEFAULT NULL,
  `expierDate` datetime NOT NULL,
  `TypeId` int(5) DEFAULT NULL,
  PRIMARY KEY (`StockId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

insert  into `stock`(`StockId`,`AddedDate`,`Vol`,`expierDate`,`TypeId`) values (1,'2017-09-24 22:33:07',0,'2017-11-04 00:00:00',2),(2,'2017-10-01 12:12:07',8,'2017-12-01 12:12:07',3),(3,'2017-10-12 00:09:17',23,'2017-10-12 00:09:17',1),(4,'2017-10-12 00:10:56',3,'2017-10-12 00:10:56',7),(5,'2017-10-12 00:13:39',3,'2017-10-12 00:13:39',7),(6,'2017-10-12 20:19:03',34,'2017-10-12 20:19:03',2),(7,'2017-10-12 20:20:39',28,'2017-10-12 20:20:39',7),(8,'2017-10-12 20:39:21',7,'2017-10-12 20:39:21',1),(9,'2017-10-12 21:04:05',5,'2017-10-12 21:04:05',1),(10,'2017-10-16 21:32:10',32,'2017-10-16 21:32:10',7),(11,'2017-10-17 21:57:41',32,'2017-10-17 21:57:41',6),(12,'2017-10-22 10:43:44',2,'2017-10-22 10:43:44',5),(13,'2017-10-22 10:49:16',0,'2017-10-22 10:49:16',8),(14,'2017-10-29 21:50:33',12,'2017-10-29 21:50:33',3),(15,'2017-11-03 11:37:16',2,'2017-11-03 11:37:16',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
