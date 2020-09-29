/*
Navicat MySQL Data Transfer

Source Server         : VirtualMachine
Source Server Version : 50565
Source Host           : 192.168.137.21:3306
Source Database       : sentinel-ms

Target Server Type    : MYSQL
Target Server Version : 50565
File Encoding         : 65001

Date: 2020-09-29 17:45:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_no` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `create_dt` date DEFAULT NULL,
  `product_no` varchar(255) DEFAULT NULL,
  `product_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('1', 'xx', '2020-09-10', '25', '165415646');

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_no` varchar(255) NOT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_store` varchar(255) DEFAULT NULL,
  `product_price` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`product_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('25', 'dsa', 'deadsa', '15456.00');
