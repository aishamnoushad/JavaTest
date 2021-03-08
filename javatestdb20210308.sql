-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: javatestdb
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `ID` tinyint DEFAULT NULL,
  `account_type` varchar(7) DEFAULT NULL,
  `account_number` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'current',12250016001),(2,'savings',12250016002),(3,'current',12250016003),(4,'current',12250016004),(5,'savings',12250016005);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_statements`
--

DROP TABLE IF EXISTS `account_statements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_statements` (
  `id` int NOT NULL,
  `account_id` int NOT NULL,
  PRIMARY KEY (`id`,`account_id`),
  UNIQUE KEY `UK_5w6n3widr37a4477um1w1nt4u` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_statements`
--

LOCK TABLES `account_statements` WRITE;
/*!40000 ALTER TABLE `account_statements` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_statements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `search_detail`
--

DROP TABLE IF EXISTS `search_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `search_detail` (
  `account_id` int NOT NULL,
  `from_date` varchar(255) DEFAULT NULL,
  `to_date` varchar(255) DEFAULT NULL,
  `from_amount` double NOT NULL,
  `to_amount` double NOT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `search_detail`
--

LOCK TABLES `search_detail` WRITE;
/*!40000 ALTER TABLE `search_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `search_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spring_session`
--

DROP TABLE IF EXISTS `spring_session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `spring_session` (
  `PRIMARY_ID` char(36) NOT NULL,
  `SESSION_ID` char(36) NOT NULL,
  `CREATION_TIME` bigint NOT NULL,
  `LAST_ACCESS_TIME` bigint NOT NULL,
  `MAX_INACTIVE_INTERVAL` int NOT NULL,
  `EXPIRY_TIME` bigint NOT NULL,
  `PRINCIPAL_NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PRIMARY_ID`),
  UNIQUE KEY `SPRING_SESSION_IX1` (`SESSION_ID`),
  KEY `SPRING_SESSION_IX2` (`EXPIRY_TIME`),
  KEY `SPRING_SESSION_IX3` (`PRINCIPAL_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spring_session`
--

LOCK TABLES `spring_session` WRITE;
/*!40000 ALTER TABLE `spring_session` DISABLE KEYS */;
/*!40000 ALTER TABLE `spring_session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spring_session_attributes`
--

DROP TABLE IF EXISTS `spring_session_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `spring_session_attributes` (
  `SESSION_PRIMARY_ID` char(36) NOT NULL,
  `ATTRIBUTE_NAME` varchar(200) NOT NULL,
  `ATTRIBUTE_BYTES` blob NOT NULL,
  PRIMARY KEY (`SESSION_PRIMARY_ID`,`ATTRIBUTE_NAME`),
  CONSTRAINT `SPRING_SESSION_ATTRIBUTES_FK` FOREIGN KEY (`SESSION_PRIMARY_ID`) REFERENCES `spring_session` (`SESSION_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spring_session_attributes`
--

LOCK TABLES `spring_session_attributes` WRITE;
/*!40000 ALTER TABLE `spring_session_attributes` DISABLE KEYS */;
/*!40000 ALTER TABLE `spring_session_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statement`
--

DROP TABLE IF EXISTS `statement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statement` (
  `ID` smallint DEFAULT NULL,
  `account_id` tinyint DEFAULT NULL,
  `datefield` varchar(10) DEFAULT NULL,
  `amount` decimal(16,13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statement`
--

LOCK TABLES `statement` WRITE;
/*!40000 ALTER TABLE `statement` DISABLE KEYS */;
INSERT INTO `statement` VALUES (1,3,'09.08.2020',535.1978750270540),(2,4,'15.11.2020',967.4103086377910),(3,3,'03.09.2020',623.4618042952620),(4,3,'03.02.2020',330.4550045879240),(5,3,'19.05.2020',125.5157304433200),(6,4,'12.03.2020',256.2923960324040),(7,3,'15.09.2020',87.8901139771573),(8,4,'22.06.2020',386.9081216861130),(9,1,'14.10.2020',196.8019059459030),(10,5,'25.03.2020',997.7401294081440),(11,5,'18.04.2020',292.4512734024340),(12,5,'06.08.2020',909.7564516223440),(13,1,'01.07.2020',869.9664703736830),(14,1,'05.05.2020',578.9317563662430),(15,4,'30.10.2019',798.0905761284340),(16,3,'30.12.2019',760.8851244747760),(17,2,'18.06.2019',841.6089787473790),(18,5,'18.11.2019',332.6600367812360),(19,5,'19.10.2020',809.6290161151090),(20,2,'16.02.2020',724.4783646432630),(21,2,'22.06.2018',59.0315005915503),(22,4,'05.07.2018',501.9219108918480),(23,3,'16.07.2020',320.1133189917090),(24,3,'24.01.2021',564.9828905058240),(25,3,'29.11.2020',350.7936827414830),(26,2,'25.08.2020',565.3938145451840),(27,4,'05.11.2020',546.1837130808650),(28,2,'20.02.2020',203.4819302944870),(29,1,'26.05.2020',191.6080984474290),(30,4,'29.04.2019',704.4967968987770),(31,4,'10.02.2013',45.2525260642709),(32,2,'19.01.2017',166.4705416081440),(33,2,'02.08.2017',590.9766485473840),(34,5,'05.03.2018',43.6814104471397),(35,4,'22.09.2020',506.2205997375490),(36,3,'15.07.2020',971.6531491806700),(37,5,'30.09.2020',120.9607017066290),(38,5,'08.01.2021',75.6675618542309),(39,1,'18.10.2016',304.3757742834140),(40,3,'22.12.2016',369.4076700608820),(41,3,'30.11.2018',736.6460210287100),(42,2,'11.06.2019',911.6106188880860),(43,1,'21.10.2019',113.6193299015740),(44,4,'16.06.2019',619.2456842188560),(45,1,'14.05.2019',957.2728499513910),(46,1,'31.05.2019',376.6723529723690),(47,1,'13.01.2012',893.0619763814440),(48,1,'03.03.2012',373.9506065585060),(49,4,'22.04.2012',361.6425494538910),(50,4,'19.11.2012',328.8716555466370),(51,3,'15.10.2012',744.5911082442520),(52,2,'28.04.2012',521.4076015837210),(53,1,'20.02.2012',387.6711041466570),(54,5,'15.08.2012',281.3125843539480),(55,4,'29.10.2012',132.6210524818630),(56,3,'21.07.2012',960.1963779099060),(57,1,'14.03.2012',332.5880242935280),(58,1,'05.05.2012',803.3049174111430),(59,4,'25.02.2012',440.6738499589050),(60,4,'29.06.2012',156.5892508552570),(61,1,'31.07.2012',828.2457469806520),(62,3,'27.11.2012',859.5114970531730),(63,5,'18.12.2012',160.4473453985010),(64,1,'08.10.2012',396.8095869595550),(65,1,'30.12.2012',811.4427411862150),(66,3,'25.03.2012',14.9269187221028),(67,4,'02.05.2012',726.8398503925650),(68,4,'11.07.2012',468.9688605360630),(69,1,'08.01.2012',161.8035065183580),(70,4,'31.07.2012',15.5828245024958),(71,4,'25.08.2012',692.4579799570400),(72,1,'12.08.2012',427.3780348961900),(73,4,'18.11.2012',527.2813648491030),(74,5,'29.04.2012',885.2260133432660),(75,5,'13.09.2012',516.5076308743500),(76,2,'02.01.2012',844.6051122856530),(77,3,'09.09.2012',637.7368539845920),(78,2,'29.07.2012',218.0830708838130),(79,5,'18.08.2012',35.0736664520792),(80,5,'02.09.2012',907.3702842178040),(81,1,'20.06.2012',258.6690103752040),(82,1,'29.08.2012',537.2637395102250),(83,4,'13.02.2012',651.9934295331350),(84,3,'17.01.2012',242.2164500963820),(85,1,'04.05.2012',289.2790825768020),(86,3,'09.03.2012',165.9756668283400),(87,3,'11.04.2012',777.1150145682590),(88,1,'13.07.2012',585.2692548171540),(89,1,'19.11.2012',10.4978134308631),(90,5,'27.12.2012',779.4248091357790),(91,3,'18.06.2012',327.2663230231210),(92,1,'05.09.2012',968.1204716162010),(93,2,'03.10.2012',951.6351188940350),(94,1,'04.07.2012',113.4052996331340),(95,4,'21.12.2012',372.0911810390370),(96,2,'13.12.2012',630.4930642534730),(97,5,'26.08.2012',502.8310362059050),(98,5,'04.03.2012',922.4432410153510),(99,5,'04.10.2012',821.4308323866950),(100,2,'18.05.2012',502.0960165182600),(101,2,'24.12.2012',493.1399172986290),(102,5,'30.01.2012',498.1838156592230),(103,4,'26.02.2012',390.0984166133210),(104,5,'19.07.2012',186.8510269019410),(105,3,'23.03.2012',557.5338820766570),(106,3,'19.08.2012',995.4991771858680),(107,3,'19.12.2012',617.6148725395740),(108,4,'24.09.2012',612.4329433217570),(109,2,'29.10.2012',148.8243325492360),(110,4,'20.08.2012',363.7358223637350),(111,5,'21.05.2012',667.8850352061110),(112,1,'15.01.2012',732.7854753996350),(113,3,'16.12.2012',602.3364318721390),(114,2,'12.02.2012',542.0602382185980),(115,5,'22.01.2011',191.1765684163340),(116,5,'04.10.2012',241.2723384793150),(117,1,'28.06.2012',35.4587802498303),(118,5,'17.08.2012',674.9997620467670),(119,4,'20.03.2012',998.8634372974210),(120,5,'24.04.2012',420.0779612812350),(121,1,'08.04.2012',452.2208412460410),(122,2,'18.06.2012',791.9297741990440),(123,5,'23.10.2016',23.7245894349440),(124,2,'30.08.2012',311.7818858757400),(125,4,'14.10.2012',473.9909130749530),(126,5,'06.01.2012',363.3429676421280),(127,4,'27.03.2012',447.1213348625740),(128,3,'10.09.2012',808.1569482173750),(129,5,'13.05.2012',508.0896339094630),(130,1,'14.11.2012',376.9176026819290),(131,4,'27.07.2012',497.5929014556200),(132,5,'11.04.2012',110.3874387399130),(133,3,'25.06.2012',314.4294951986560),(134,3,'27.04.2012',899.9982784692500),(135,3,'08.08.2019',518.4206204418230),(136,1,'23.11.2019',103.4226154736590),(137,5,'28.06.2020',248.2181830868770),(138,1,'24.05.2020',301.4759148045490),(139,5,'28.10.2020',183.4806882274740),(140,3,'12.06.2020',626.9746330720680),(141,3,'05.07.2020',38.6996920187093),(142,5,'29.09.2020',684.7015285906190);
/*!40000 ALTER TABLE `statement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
  `user_id` bigint NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  UNIQUE KEY `UK_5q4rc4fh1on6567qk69uesvyf` (`role_id`),
  CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `FKrhfovtciq1l558cw6udg0h0d3` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (2,1),(1,2);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `userpassword` varchar(255) DEFAULT NULL,
  `login_status` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'$2a$10$wpJgbhbYY.u4vMUY0T7AYesQlo3bK7pajNpbxJlgALRcydBLFv4pe','not-login','user'),(2,'$2a$10$EoV3.dz5xZlV1nvKJsQ7kOJUuQ0qMTw17d/VEW7hKQCsYyAHc3Axi','not-login','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-08 16:55:23
