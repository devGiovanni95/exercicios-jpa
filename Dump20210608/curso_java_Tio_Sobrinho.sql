-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: curso_java
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Tio_Sobrinho`
--

DROP TABLE IF EXISTS `Tio_Sobrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Tio_Sobrinho` (
  `tios_id` bigint NOT NULL,
  `sobrinhos_id` bigint NOT NULL,
  KEY `FK2mrff04i3o52mu0wp6l4yyfbw` (`sobrinhos_id`),
  KEY `FKgreuq3pwcrypeyp3xwb55ca3y` (`tios_id`),
  CONSTRAINT `FK2mrff04i3o52mu0wp6l4yyfbw` FOREIGN KEY (`sobrinhos_id`) REFERENCES `Sobrinho` (`id`),
  CONSTRAINT `FKgreuq3pwcrypeyp3xwb55ca3y` FOREIGN KEY (`tios_id`) REFERENCES `Tio` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tio_Sobrinho`
--

LOCK TABLES `Tio_Sobrinho` WRITE;
/*!40000 ALTER TABLE `Tio_Sobrinho` DISABLE KEYS */;
INSERT INTO `Tio_Sobrinho` VALUES (1,1),(1,2),(2,1),(2,2);
/*!40000 ALTER TABLE `Tio_Sobrinho` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-08  0:18:41
