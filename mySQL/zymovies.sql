/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : zymovies

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2022-05-24 16:48:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `cid` int(32) NOT NULL AUTO_INCREMENT,
  `uid` int(32) DEFAULT NULL,
  `mid` int(32) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `touid` (`uid`),
  KEY `tomid` (`mid`),
  CONSTRAINT `tomid` FOREIGN KEY (`mid`) REFERENCES `t_movie` (`mid`),
  CONSTRAINT `touid` FOREIGN KEY (`uid`) REFERENCES `t_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES ('7', '4', '1', '1111111111111111111111111111111', '2022-05-16');
INSERT INTO `t_comment` VALUES ('8', '19', '3', '好看', '2022-05-16');
INSERT INTO `t_comment` VALUES ('9', '4', '3', '2222', '2022-05-16');
INSERT INTO `t_comment` VALUES ('10', '19', '5', '42543245', '2022-05-16');

-- ----------------------------
-- Table structure for t_movie
-- ----------------------------
DROP TABLE IF EXISTS `t_movie`;
CREATE TABLE `t_movie` (
  `mid` int(16) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) NOT NULL,
  `director` varchar(32) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `rate` int(16) DEFAULT NULL,
  `country` varchar(32) DEFAULT NULL,
  `image` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_movie
-- ----------------------------
INSERT INTO `t_movie` VALUES ('1', '霸王别姬', '陈凯歌', '剧情/爱情/同性', '1993-07-26', '9', '中国香港', 'awdf');
INSERT INTO `t_movie` VALUES ('2', '肖申克的救赎', ' 弗兰克·德拉邦特', '剧情 / 犯罪', '1994-09-10', '9', '美国', 'a');
INSERT INTO `t_movie` VALUES ('3', '阿甘正传', '罗伯特·泽米吉斯', '剧情 / 爱情', '1994-06-23', '9', '美国', 'b');
INSERT INTO `t_movie` VALUES ('4', '这个杀手不太冷', '吕克·贝松', '剧情 / 动作 / 犯罪', '1994-09-14', '8', '法国/美国', 'c');
INSERT INTO `t_movie` VALUES ('5', '美丽人生', '罗伯托·贝尼尼', '剧情 / 喜剧 / 爱情 / 战争', '1997-12-20', '9', '意大利', 'd');
INSERT INTO `t_movie` VALUES ('6', '千与千寻', '宫崎骏', '剧情 / 动画 / 奇幻', '2001-07-20', '9', '日本', null);
INSERT INTO `t_movie` VALUES ('7', '辛德勒的名单', ' 史蒂文·斯皮尔伯格', '剧情 / 历史 / 战争', '1994-02-04', '9', '美国', null);
INSERT INTO `t_movie` VALUES ('8', '盗梦空间', '克里斯托弗·诺兰', '剧情 / 科幻 / 悬疑 / 冒险', '2010-07-16', '9', '美国', null);
INSERT INTO `t_movie` VALUES ('9', '楚门的世界', '彼得·威尔', '剧情 / 科幻', '1998-06-05', '9', '美国', null);
INSERT INTO `t_movie` VALUES ('10', '海上钢琴师', '朱塞佩·托纳多雷', '剧情 / 音乐', '1998-10-28', '9', '意大利', null);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` char(32) DEFAULT NULL,
  `salt` char(36) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('2', 'bob', '3333333', '20c38752-4c10-4474-be3a-9560dd727f30', '17863528372', '178672@qq.com', '2');
INSERT INTO `t_user` VALUES ('4', 'cici', 'd0a2788c9efc3b5fd655581f0f4017f7', 'c663b377-c4a5-4ef0-989a-79568da25d29', '18765372637', '82394378@gmail.com', '1');
INSERT INTO `t_user` VALUES ('6', 'cici1', 'a8ce593f3d46e492ea2ef6e8006c814f', '2945c500-3660-4e5d-af4b-e7c9a4f3751b', null, null, null);
INSERT INTO `t_user` VALUES ('8', 'cici3', '5f4a1e6ac19aafb3693f6b94d5d7d105', '6b7007d2-71e3-4107-b7e5-d8a6328b5b58', null, null, null);
INSERT INTO `t_user` VALUES ('9', 'cici2', '552d86ceb407900bc69594d900f0a4e5', 'df11d050-acad-414f-bbd7-126bad08e5c2', null, null, null);
INSERT INTO `t_user` VALUES ('10', 'cici4', '1609f8166d41d2332f034a56215f03e2', '7d63956c-f5b4-4e99-84eb-0e8c482d78e0', null, null, null);
INSERT INTO `t_user` VALUES ('11', 'cici5', '7ec075d5b620a611041671c8c66e330b', 'c36b1f65-b165-4d36-9a63-5e497233c422', null, null, null);
INSERT INTO `t_user` VALUES ('12', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('13', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('14', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('15', 'bob1', '6eed314b10529a43b472f83e19975bdd', '73a9163e-b027-4f57-8dd4-1a212566c2fb', null, null, null);
INSERT INTO `t_user` VALUES ('16', 'cici111', '8ad6c9a653dd159274256c1de15c6255', '38e50c90-05fa-41bd-b221-079ae95d1120', null, null, null);
INSERT INTO `t_user` VALUES ('17', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('18', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('19', 'dude', 'de30bcbdf1ac85b0e01cdf66cf04b0a6', 'dd8ed892-94fc-4166-8b2d-c78eed9c9fd5', null, null, null);
INSERT INTO `t_user` VALUES ('20', 'dude2', 'e12bd5873e129469e3bddcd9bdc76686', '560f5898-32fe-425b-a035-63a522cc8811', null, null, null);
INSERT INTO `t_user` VALUES ('21', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('22', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('23', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('24', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('25', 'zhangyi', '123456', null, null, null, null);
INSERT INTO `t_user` VALUES ('26', 'postman', '850329ffa1248ea45d99cac962da0268', 'e4e10735-28be-4f05-84be-d7c813c99469', null, null, null);

-- ----------------------------
-- Table structure for t_want
-- ----------------------------
DROP TABLE IF EXISTS `t_want`;
CREATE TABLE `t_want` (
  `want_id` int(32) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `uid` int(32) DEFAULT NULL,
  `mid` int(32) DEFAULT NULL,
  PRIMARY KEY (`want_id`),
  KEY `userWant` (`uid`),
  KEY `movieWant` (`mid`),
  CONSTRAINT `movieWant` FOREIGN KEY (`mid`) REFERENCES `t_movie` (`mid`),
  CONSTRAINT `userWant` FOREIGN KEY (`uid`) REFERENCES `t_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_want
-- ----------------------------
INSERT INTO `t_want` VALUES ('29', '2022-05-15', '1', '1');
INSERT INTO `t_want` VALUES ('31', '2022-05-15', '1', '1');
INSERT INTO `t_want` VALUES ('33', '2022-05-15', '4', '4');
INSERT INTO `t_want` VALUES ('35', '2022-05-15', '4', '10');
INSERT INTO `t_want` VALUES ('36', '2022-05-16', '19', '7');
INSERT INTO `t_want` VALUES ('37', '2022-05-16', '1', '1');
INSERT INTO `t_want` VALUES ('39', '2022-05-16', '4', '5');

-- ----------------------------
-- Table structure for t_watched
-- ----------------------------
DROP TABLE IF EXISTS `t_watched`;
CREATE TABLE `t_watched` (
  `watchedId` int(32) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `myrate` int(32) DEFAULT NULL,
  `mid` int(32) DEFAULT NULL,
  `uid` int(32) DEFAULT NULL,
  PRIMARY KEY (`watchedId`),
  KEY `userWatch` (`uid`),
  KEY `movieWatch` (`mid`),
  CONSTRAINT `movieWatch` FOREIGN KEY (`mid`) REFERENCES `t_movie` (`mid`),
  CONSTRAINT `userWatch` FOREIGN KEY (`uid`) REFERENCES `t_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_watched
-- ----------------------------
INSERT INTO `t_watched` VALUES ('22', '2022-05-15', '99', '6', '4');
INSERT INTO `t_watched` VALUES ('23', '2022-05-16', '99', '5', '19');
INSERT INTO `t_watched` VALUES ('24', '2022-05-16', '1', '3', '4');
INSERT INTO `t_watched` VALUES ('25', '2022-05-16', '0', '4', '4');
