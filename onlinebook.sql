/*
Navicat MySQL Data Transfer

Source Server         : db
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : onlinebook

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2015-03-19 15:43:22
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookSN` char(7) NOT NULL COMMENT '书籍编号',
  `bookName` varchar(30) default NULL COMMENT '书籍名',
  `bookAuthor` varchar(20) default NULL COMMENT '书籍作者',
  `pubName` varchar(20) default NULL COMMENT '出版社',
  `bookPrice` decimal(10,2) default NULL COMMENT '书籍价格',
  `createDate` datetime default NULL COMMENT '上市时间',
  PRIMARY KEY  (`bookSN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO Book VALUES ('001', '解忧杂货铺', '东野圭吾', '南海出版公司', '23.70', '2015-03-19 00:00:00');
INSERT INTO Book VALUES ('002', '乖,摸摸头', '大冰', '湖南文艺出版社', '21.60', '2014-10-01 00:00:00');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cusId` varchar(3) NOT NULL,
  `cusName` varchar(20) default NULL,
  `cusPassword` varchar(13) default NULL,
  PRIMARY KEY  (`cusId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `ordId` char(10) NOT NULL default '' COMMENT '订单编号',
  `cusId` varchar(3) default NULL COMMENT '顾客编号',
  `createDate` datetime default NULL COMMENT '下单日',
  `ordStatus` bit(1) default NULL COMMENT '订单状态 0:未处理，1:处理',
  PRIMARY KEY  (`ordId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
