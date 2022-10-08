
-- 交易表
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
                               `id` int(11) NOT NULL AUTO_INCREMENT,
                               `user_id` int(11) DEFAULT NULL,
                               `amount` varchar(255) DEFAULT NULL,
                               `time` datetime DEFAULT NULL,
                               `status` varchar(255) DEFAULT NULL,
                               PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


-- 商品表
DROP TABLE IF EXISTS `thing`;
CREATE TABLE `thing` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `thing_name` varchar(255) DEFAULT NULL,
                         `thing_block` varchar(255) DEFAULT NULL,
                         `thing_img` varchar(255) DEFAULT NULL,
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


-- 商品用户表
DROP TABLE IF EXISTS `user_thing`;
CREATE TABLE `user_thing` (
                              `id` int(11) NOT NULL AUTO_INCREMENT,
                              `thing_id` int(11) DEFAULT NULL,
                              `user_id` int(11) DEFAULT NULL,
                              `time` datetime DEFAULT NULL,
                              `status` varchar(255) DEFAULT NULL,
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
