/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : goods

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2013-03-14 23:10:29
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(20) NOT NULL,
  `goodsPrice` float(20,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO goods VALUES ('1', '西红柿', '12');
INSERT INTO goods VALUES ('2', '苹果', '23');
INSERT INTO goods VALUES ('3', '李子', '3');
INSERT INTO goods VALUES ('4', '橘子', '43');
INSERT INTO goods VALUES ('5', '香蕉', '23');
INSERT INTO goods VALUES ('6', '木瓜', '13');
INSERT INTO goods VALUES ('7', '糖果', '33');
