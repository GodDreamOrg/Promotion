SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for t_prmt_customer_group
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_customer_group`;
CREATE TABLE `t_prmt_customer_group` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `CUSTOMER_GROUP_CODE` varchar(20) DEFAULT NULL COMMENT '客户群编号',
  `CUSTOMER_GROUP_NAME` varchar(50) DEFAULT NULL COMMENT '客户群名称',
  `SOURCE_TYPE` tinyint(4) DEFAULT NULL COMMENT '来源类型. 1=人工创建; 2=活动产生 ',
  `CUSTOMER_GROUP_DESC` varchar(200) DEFAULT NULL COMMENT '客户群描述',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户群信息';

-- ----------------------------
-- Table structure for t_prmt_customer_group_item
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_customer_group_item`;
CREATE TABLE `t_prmt_customer_group_item` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `CUSTOMER_GROUP_CODE` varchar(20) DEFAULT NULL COMMENT '客户群编号',
  `USER_ID` tinyint(1) DEFAULT NULL COMMENT '用户标号',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户群会员关系';

-- ----------------------------
-- Table structure for t_prmt_customer_group_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_customer_group_rel`;
CREATE TABLE `t_prmt_customer_group_rel` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `REWARD_COLLECTION_CODE` varchar(20) DEFAULT NULL COMMENT '奖励集编码',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `CUSTOMER_GROUP_CODE` bigint(20) DEFAULT NULL COMMENT '客户群_ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动对象关联表';

-- ----------------------------
-- Table structure for t_prmt_cycle
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_cycle`;
CREATE TABLE `t_prmt_cycle` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `CYCLE_TYPE` varchar(4) DEFAULT NULL COMMENT '周期类型.W：每周；M：每月；D：每天',
  `CYCLE_EFFECTIVE_TIME` int(11) DEFAULT NULL COMMENT '生效时间秒数. 多个值，以_间隔,每周:(周日)1~7(周六),每月:1~31',
  `CYCLE_START_TIME` datetime DEFAULT NULL COMMENT '每天开始时间',
  `CYCLE_END_TIME` datetime DEFAULT NULL COMMENT '每天截止时间',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销活动周期时间表';

-- ----------------------------
-- Table structure for t_prmt_entity_history
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_entity_history`;
CREATE TABLE `t_prmt_entity_history` (
  `ID` bigint(10) NOT NULL AUTO_INCREMENT,
  `ENTITY_TYPE` varchar(255) DEFAULT NULL COMMENT '实体类名称',
  `ENTITY_KEY` varchar(100) DEFAULT NULL COMMENT '实体类ID',
  `COMMENTS` varchar(255) DEFAULT NULL COMMENT '备注',
  `ENTITY_SNAPSHOTINJSON` text COMMENT '实体类JSON',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_prmt_info
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_info`;
CREATE TABLE `t_prmt_info` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `TEMPLATE_CODE` varchar(20) DEFAULT NULL COMMENT '活动模板CODE',
  `PRMT_NAME` varchar(255) DEFAULT NULL COMMENT '活动名称',
  `PRMT_SHORT_NAME` varchar(100) DEFAULT NULL,
  `PRMT_TAG` varchar(8) DEFAULT NULL,
  `PRMT_DESC` varchar(1024) DEFAULT NULL COMMENT '活动描述',
  `PRMT_STATUS` tinyint(4) DEFAULT NULL COMMENT '活动状态 (1:草稿; 2:待审核; 3:拒绝; 4:启用: 5:暂停; 6:终止; 7:过期; 8:处理中; 9:驳回',
  `PRMT_TYPE` tinyint(4) DEFAULT NULL COMMENT '促销类型. 原商品活动范围类型字段(以商品作为促销活动规划的主维度).0=无;1=单品;2=订单;3=商品组合(X元N件)(预留);4=固定搭配(删除);5=可选搭配(删除);6=加价购(并入奖励类型)',
  `PRMT_FLAG` tinyint(1) DEFAULT NULL COMMENT '大促标识. 0=否; 1=是(商品列表显示大促图标 ?)',
  `STORE_CODE` varchar(100) DEFAULT NULL,
  `ASSOCIATED_TYPE` tinyint(4) DEFAULT '0' COMMENT '关联类型.1=到活动；2=到奖励；3=到活动商品',
  `INITIATOR_TYPE` tinyint(4) DEFAULT NULL COMMENT '活动发起方类型. 0=平台;1=事业部;2=销售区域;3=门店',
  `INITIATOR_CODE` varchar(20) DEFAULT NULL COMMENT '活动发起方编码 (预留)',
  `PREHEATING_TIME` int(11) DEFAULT NULL COMMENT '活动预热分钟数',
  `BEGIN_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间',
  `ON_SHELF_TIME` datetime DEFAULT NULL COMMENT '启用/发布时间',
  `MEMBER_TYPE` tinyint(4) DEFAULT NULL COMMENT '会员类型. 1=全会员; 2=后台维护(参加活动对象关联表,预留,建议使用CRM客户细分);3=指定会员级别(参见会员限制说明, 字段‘会员限制规则’)',
  `MEMBER_LIMIT_RULE` varchar(200) DEFAULT NULL COMMENT '会员限制规则. 活动限制了会员类型且会员类型是个人的时候, 根据对应限制的会员等级拼接成, 用于商品详情页展示用',
  `TERMINAL` varchar(64) DEFAULT NULL COMMENT '终端类型',
  `REWARD_TYPE` tinyint(4) DEFAULT NULL COMMENT '1=送赠品(含券);2=直降;3=折扣;',
  `REWARD_COLLECTION_RELATION` tinyint(1) DEFAULT NULL COMMENT '奖励集和商品范围关系. 1=共享,0=指定',
  `SHOW_AREA_FLAG` varchar(64) DEFAULT NULL COMMENT '活动展示区域标记(预留)',
  `CYCLE_FLAG` tinyint(1) DEFAULT NULL COMMENT '周期性时间标记. 1=有;0=无',
  `PAY_LIMIT_FLAG` tinyint(1) DEFAULT NULL COMMENT '支付方式限制标识. 活动支付方式限制表没有记录，则值为0，有记录则值为1',
  `RESOURCE_LOCK_FLAG` tinyint(1) DEFAULT NULL COMMENT '资源释放锁定标识. 1=未锁定;2=已锁定;3=已释放',
  `FIRST_ORDER` tinyint(1) DEFAULT NULL COMMENT '首单限制. 0=不限制;1=限制',
  `HEAD_PIC_URL` varchar(200) DEFAULT NULL COMMENT '头图链接. 活动页使用',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `CREATE_USER_NAME` varchar(50) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '最后修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  `APPROVE_TIME` datetime DEFAULT NULL COMMENT '审批时间',
  `APPROVE_DESC` varchar(255) DEFAULT NULL COMMENT '审批备注',
  `CLOSE_TIME` datetime DEFAULT NULL COMMENT '关闭时间',
  `CLOSE_DESC` varchar(255) DEFAULT NULL COMMENT '关闭备注',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNIQUE_PRMT_CODE` (`PRMT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销活动基本信息';

-- ----------------------------
-- Table structure for t_prmt_location
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_location`;
CREATE TABLE `t_prmt_location` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `MIN_LEVEL` tinyint(4) DEFAULT NULL COMMENT '1: 国; 2:省; 3:市; 4:区; 5:门店',
  `COUNTRY_CODE` varchar(50) DEFAULT NULL COMMENT '国家编码',
  `COUNTRY_NAME` varchar(50) DEFAULT NULL COMMENT '国家名称',
  `PROVINCE_CODE` varchar(50) DEFAULT NULL COMMENT '省份编码',
  `PROVINCE_NAME` varchar(50) DEFAULT NULL COMMENT '省份名称',
  `CITY_CODE` varchar(50) DEFAULT NULL COMMENT '城市编码',
  `CITY_NAME` varchar(50) DEFAULT NULL COMMENT '城市名称',
  `AREA_CODE` varchar(50) DEFAULT NULL COMMENT '区域编码',
  `AREA_NAME` varchar(50) DEFAULT NULL COMMENT '区域名称',
  `ENTITY_STORE_CODE` varchar(50) DEFAULT NULL COMMENT '门店编码',
  `ENTITY_STORE_NAME` varchar(50) DEFAULT NULL COMMENT '门店名称',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `PRMT_CODE` (`PRMT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动渠道和地点表';

-- ----------------------------
-- Table structure for t_prmt_mutex_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_mutex_rule`;
CREATE TABLE `t_prmt_mutex_rule` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CHARACTER` varchar(20) DEFAULT NULL COMMENT '属性集. 属性集以_间隔,顺序:活动发起方_模板类型_奖励触发形式_奖励类型_商品类型_支付方式限制',
  `EXCLUDE_CHARACTER` varchar(20) DEFAULT NULL COMMENT '互斥属性集. 属性集以_间隔,顺序:活动发起方_模板类型_奖励触发形式_奖励类型_商品类型_支付方式限制',
  `RULE_DESC` varchar(200) DEFAULT NULL COMMENT '规则说明',
  `USE_SCENE` tinyint(1) DEFAULT NULL COMMENT '使用场景. 0=新建;1=执行',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '最后修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '最后修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动共享互斥配置';
INSERT INTO `t_prmt_mutex_rule` VALUES ('1', '02_3_2_1', '02_3_2_1', '车享家单品降价互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('2', '02_3_1_1', '02_3_1_1', '车享家单品送商品互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('3', '02_3_4_1', '02_3_4_1', '车享家单品送券互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('4', '02_3_1_2', '02_3_1_2', '车享家订单送商品互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('5', '02_3_4_2', '02_3_4_2', '车享家订单送券互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('6', '02_3_2_2', '02_3_2_2', '车享家订单满减互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('7', '02_3_1_2', '02_3_4_2', '车享家订单送商品与订单送券互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('8', '02_3_1_2', '02_3_2_2', '车享家订单送商品与订单满减互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('9', '02_3_4_2', '02_3_2_2', '车享家订单送券与订单满减互斥', '0', '2016-10-31 17:11:33', '53', null, null, '1');
INSERT INTO `t_prmt_mutex_rule` VALUES ('10', '02_3_1_1', '02_3_4_1', '车享家单品赠商品与赠券互斥', '0', '2016-10-31 17:11:33', '53', null, null, null);

-- ----------------------------
-- Table structure for t_prmt_mutex_rule_priority
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_mutex_rule_priority`;
CREATE TABLE `t_prmt_mutex_rule_priority` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CHARACTER` varchar(20) DEFAULT NULL COMMENT '属性集. 属性集以_间隔,顺序:活动发起方_模板类型_奖励触发形式_奖励类型',
  `PRIORITY` tinyint(4) DEFAULT NULL COMMENT '优先级. 正整数，1表示优先级最高，数字越大优先级越低',
  `STATUS` tinyint(1) DEFAULT NULL COMMENT '状态',
  `RULE_DESC` varchar(200) DEFAULT NULL COMMENT '备注说明',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '最后修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '最后修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动共享互斥优先级配置';

-- ----------------------------
-- Table structure for t_prmt_payment_limit
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_payment_limit`;
CREATE TABLE `t_prmt_payment_limit` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `PAYMENT_TYPE` tinyint(4) DEFAULT NULL COMMENT '支付方式',
  `PAYMENT_CHANNEL` varchar(20) DEFAULT NULL COMMENT '支付渠道',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动支付方式限制表';

-- ----------------------------
-- Table structure for t_prmt_product
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_product`;
CREATE TABLE `t_prmt_product` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `REWARD_COLLECTION_CODE` varchar(100) DEFAULT NULL COMMENT '奖励集编号. 当奖励集和商品范围关系为“单独指定”时，该字段为该商品对应的奖励集',
  `RELATION_TYPE` tinyint(4) DEFAULT NULL COMMENT '商品范围关联类型. 0=SPU;1=SKU;2=品类(是否需要指定级别?);3=品牌;4=品牌+品类;5=店铺',
  `ASSOCAITED_TYPE` tinyint(4) DEFAULT NULL COMMENT '操作类型. 0=包含;1=排除',
  `CATEGORY_CODE` varchar(50) DEFAULT NULL COMMENT '销售目录',
  `CATEGORY_NAME` varchar(50) DEFAULT NULL,
  `CATEGORY_LEVEL` varchar(50) DEFAULT NULL,
  `STORE_CODE` varchar(50) DEFAULT NULL COMMENT '店铺编码',
  `BRAND_CODE` varchar(50) DEFAULT NULL COMMENT '品牌编码',
  `MDSE_CODE` varchar(50) DEFAULT NULL COMMENT '商品编码',
  `MDSE_NAME` varchar(250) DEFAULT NULL,
  `SKU_CODE` varchar(50) DEFAULT NULL COMMENT 'SKU编码',
  `SKU_NAME` varchar(250) DEFAULT NULL,
  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间,同活动基本信息表',
  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间,同活动基本信息表',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `PRMT_CODE` (`PRMT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动商品表';

-- ----------------------------
-- Table structure for t_prmt_quota_history
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_quota_history`;
CREATE TABLE `t_prmt_quota_history` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `ASSOCIATED_CODE` varchar(100) NOT NULL COMMENT '活动编码',
  `ASSOCIATED_TYPE` tinyint(1) NOT NULL COMMENT '1：活动  2：奖励',
  `CREATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(50) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL,
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL,
  `QUANTITY_TYPE` int(4) DEFAULT NULL COMMENT '1：扣减，2：取消',
  `TOTAL_COUNT` int(4) DEFAULT NULL COMMENT '总次数',
  `DAILY_COUNT` int(4) DEFAULT NULL COMMENT '每天次数',
  `PERSION_COUNT` int(4) DEFAULT NULL COMMENT '每人次数',
  `DAILY_PERSION_COUNT` int(4) DEFAULT NULL COMMENT '每人每天次数',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_prmt_record
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_record`;
CREATE TABLE `t_prmt_record` (
  `ID` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ORDER_CODE` varchar(50) NOT NULL COMMENT '订单编号',
  `PRMT_CODE` varchar(50) DEFAULT NULL COMMENT '促销编号',
  `REWARD_TIMES` int(10) DEFAULT NULL COMMENT '奖励次数',
  `MEMBER_ID` varchar(50) DEFAULT NULL COMMENT '会员ID',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `ACTIVE_FLAG` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_prmt_record_product
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_record_product`;
CREATE TABLE `t_prmt_record_product` (
  `ID` bigint(10) NOT NULL AUTO_INCREMENT,
  `PRMT_RECORD_ID` bigint(10) NOT NULL COMMENT '外键.奖励记录ID',
  `CATEGORY_CODE` varchar(100) DEFAULT NULL COMMENT '销售目录',
  `BRAND_CODE` varchar(100) DEFAULT NULL COMMENT '品牌CODE',
  `MDSE_CODE` varchar(100) DEFAULT NULL,
  `SKU_CODE` varchar(100) DEFAULT NULL,
  `STORE_CODE` varchar(100) DEFAULT NULL,
  `QUANTITY` int(10) DEFAULT NULL COMMENT '数量',
  `PRICE` decimal(10,2) DEFAULT NULL COMMENT '实际售价',
  `ACTIVE_FLAG` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_prmt_record_reward
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_record_reward`;
CREATE TABLE `t_prmt_record_reward` (
  `ID` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PRMT_RECORD_ID` bigint(10) DEFAULT NULL COMMENT '促销奖励记录ID',
  `RULE_ID` bigint(10) DEFAULT NULL COMMENT '促销规则ID',
  `REWARD_ID` bigint(10) DEFAULT NULL COMMENT '促销奖励ID',
  `REWARD_TYPE` int(1) DEFAULT NULL COMMENT '奖励类型.1=送赠品;2=降价;3=加价购;4=送券;',
  `REWARD_GIFT_REF_ID` bigint(10) DEFAULT NULL COMMENT '赠品或赠券ID',
  `ACTUAL_REWARD_GIFT_COUNT` int(10) DEFAULT NULL,
  `REWARD_PRICE` decimal(10,2) DEFAULT NULL COMMENT '促销直降/折扣金额',
  `ACTIVE_FLAG` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_prmt_reward
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_reward`;
CREATE TABLE `t_prmt_reward` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_RULE_ID` bigint(20) DEFAULT NULL COMMENT '促销活动条件ID',
  `REWARD_TYPE` tinyint(4) DEFAULT NULL COMMENT '奖励类型. 0=无;1=送赠品;2=降价;3=加价购;4=送券;5=送积分;6=免邮;7=减价',
  `REWARD_AMOUNT_TYPE` tinyint(4) DEFAULT NULL COMMENT '奖励数值类型. 1=金额/元;2=折扣;3=件数;4=人数;5=定价;6=外围系统指定',
  `REWARD_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '奖励数值',
  `REWARD_AMOUNT2` tinyint(10) DEFAULT NULL COMMENT '奖励数值类型为1=金额/元，5=定价时，对应积分金额',
  `POINT_DISCOUNT_FLAG` tinyint(1) DEFAULT NULL COMMENT '积分折扣标识',
  `REWARD_DESC` varchar(200) DEFAULT NULL COMMENT '奖励信息描述',
  `SINGLE_MAX_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '单次奖励最多优惠',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `PRMT_RULE_ID` (`PRMT_RULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销活动奖励';

-- ----------------------------
-- Table structure for t_prmt_reward_coupon
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_reward_coupon`;
CREATE TABLE `t_prmt_reward_coupon` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `REWARD_DETAIL_ID` bigint(20) DEFAULT NULL COMMENT '奖励明细ID',
  `GIFT_TYPE` tinyint(4) DEFAULT NULL COMMENT '赠品类型 0=免费赠品;1=普通商品\r\n                                                                ',
  `POND_CODE` varchar(50) DEFAULT NULL COMMENT '券码',
  `POND_NAME` varchar(100) DEFAULT NULL COMMENT '券名称',
  `SINGLE_COUNT` int(10) DEFAULT NULL COMMENT '单次赠送数量',
  `TOTAL_COUNT` int(10) DEFAULT NULL COMMENT '赠送总数',
  `USED_COUNT` int(10) DEFAULT NULL COMMENT '已赠送总数',
  `BUY_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '换购金额',
  `SETTLE_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '结算价',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  `FACE_VALUE` decimal(10,0) DEFAULT NULL COMMENT '劵面值',
  PRIMARY KEY (`ID`),
  KEY `REWARD_DETAIL_ID` (`REWARD_DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励赠品明细';

-- ----------------------------
-- Table structure for t_prmt_reward_gift
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_reward_gift`;
CREATE TABLE `t_prmt_reward_gift` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `REWARD_DETAIL_ID` bigint(20) DEFAULT NULL COMMENT '奖励明细ID',
  `GIFT_TYPE` tinyint(4) DEFAULT NULL COMMENT '赠品类型 0=免费赠品;1=普通商品\r\n                                                                ',
  `GIFT_SKU_CODE` varchar(100) DEFAULT NULL COMMENT '赠品SKU编码',
  `GIFT_SKU_NAME` varchar(100) DEFAULT NULL COMMENT '赠品SKU名称',
  `SINGLE_COUNT` int(10) DEFAULT NULL COMMENT '单次赠送数量',
  `TOTAL_COUNT` int(10) DEFAULT NULL COMMENT '赠送总数',
  `USED_COUNT` int(10) DEFAULT NULL COMMENT '已赠送总数',
  `BUY_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '换购金额',
  `SETTLE_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '结算价',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `REWARD_DETAIL_ID` (`REWARD_DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励赠品明细';

-- ----------------------------
-- Table structure for t_prmt_reward_limit
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_reward_limit`;
CREATE TABLE `t_prmt_reward_limit` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `ASSOCIATED_TYPE` tinyint(4) unsigned DEFAULT NULL COMMENT '关联类型.1=到活动；2=到奖励；3=到活动商品',
  `ASSOCIATED_CODE` varchar(100) DEFAULT NULL COMMENT '关联编码 (如果到活动，就是活动编码;如果到奖励，就是奖励编号；如果到活动商品，就是 活动编码+商品范围关联类型+对应编码<目录编码|SKU编码|SPU编码|品牌编码> )',
  `ASSOCIATED_ID` bigint(20) DEFAULT NULL,
  `USED_COUNT` int(10) DEFAULT NULL COMMENT '已使用次数',
  `DAILY_PERSION_COUNT` int(10) DEFAULT NULL COMMENT '每人每天可参加次数',
  `PERSION_COUNT` int(10) DEFAULT NULL COMMENT '每人可参加次数',
  `DAILY_COUNT` int(10) DEFAULT NULL COMMENT '每天总优惠次数',
  `TOTAL_COUNT` int(10) DEFAULT NULL COMMENT '总次数',
  `TOTAL_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '总额度',
  `DAILY_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '每天总优惠金额',
  `USED_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '已使用额度',
  `PERSION_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '每人可优惠金额',
  `DAILY_PERSION_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '每人每天可优惠金额',
  `ORDER_SKU_MAX_NUM` int(4) DEFAULT NULL COMMENT '订单商品数量累计上限',
  `ORDER_SKU_MIN_NUM` int(4) DEFAULT NULL COMMENT '订单商品数量累计下限',
  `ACCOUNT_LIMIT` varchar(200) DEFAULT NULL COMMENT '账户限制',
  `MEMBER_TYPE` tinyint(4) DEFAULT NULL COMMENT '会员类型',
  `MEMBER_LEVEL` varchar(50) DEFAULT NULL COMMENT '会员等级限制',
  `DELIVERY_TYPE` tinyint(4) DEFAULT NULL COMMENT '配送方式限制',
  `REGISTER_START_TIME` datetime DEFAULT NULL COMMENT '注册开始时间',
  `REGISTER_END_TIME` datetime DEFAULT NULL COMMENT '注册结束时间',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `ASSOCIATED_CODE` (`ASSOCIATED_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销奖励限制';

-- ----------------------------
-- Table structure for t_prmt_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_rule`;
CREATE TABLE `t_prmt_rule` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRMT_CODE` varchar(20) DEFAULT NULL COMMENT '活动编码',
  `REWARD_COLLECTION_CODE` varchar(20) DEFAULT NULL COMMENT '奖励集编码',
  `REWARD_COLLECTION_NAME` varchar(100) DEFAULT NULL COMMENT '奖励集名称',
  `LEVEL_ID` tinyint(4) DEFAULT NULL COMMENT '奖励层级编号',
  `TRIGGER_EVENT` tinyint(4) DEFAULT NULL COMMENT '1=注册;2=登录/到店;3=购物;4=支付;5=免费领取;6=评论;7=晒单;8=抽奖;9=游戏;10=会员营销;11=券使用;12=首单购物;13=分享抢红包;14=定向发券;15=补偿返券',
  `BASE_ADDUP_TYPE` tinyint(4) DEFAULT NULL COMMENT '基数累计方式 0=无;1=固定值;2=每;3=满',
  `BASE_AMOUNT` decimal(10,2) DEFAULT NULL COMMENT '基数数值',
  `BASE_AMOUNT_TYPE` tinyint(4) DEFAULT NULL COMMENT '基数量词类型. 1=金额/元；2=件数；3=人数；4=概率',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `ACTIVE_FLAG` tinyint(1) DEFAULT NULL COMMENT '有效标识. 0=无效;1=有效',
  PRIMARY KEY (`ID`),
  KEY `PRMT_CODE` (`PRMT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销活动规则条件';

-- ----------------------------
-- Table structure for t_prmt_template
-- ----------------------------
DROP TABLE IF EXISTS `t_prmt_template`;
CREATE TABLE `t_prmt_template` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `TEMPLATE_CODE` varchar(20) DEFAULT NULL COMMENT '活动模板CODE',
  `TEMPLATE_NAME` varchar(100) DEFAULT NULL COMMENT '活动模板名称',
  `TEMPLATE_TYPE` tinyint(4) DEFAULT NULL COMMENT '模板类型. 0=活动模板;1=券模板',
  `INITIATOR_TYPE` tinyint(4) DEFAULT NULL COMMENT '活动发起方类型',
  `INITIATOR_CODE` varchar(512) DEFAULT NULL COMMENT '活动发起方',
  `CYCLE_FLAG` tinyint(1) DEFAULT NULL COMMENT '周期时间标识',
  `PRMT_STORE` varchar(512) DEFAULT NULL COMMENT '活动商户',
  `TERMINAL` varchar(128) DEFAULT NULL COMMENT '终端类型',
  `MEMBER_TYPE` varchar(20) DEFAULT NULL COMMENT '客户类型',
  `PAY_LIMIT_FLAG` tinyint(1) DEFAULT NULL COMMENT '支付限制标识',
  `PAY_TYPE` tinyint(1) DEFAULT NULL COMMENT '支付类型',
  `PRMT_TYPE` tinyint(1) DEFAULT NULL COMMENT '促销类型',
  `MDSE_RESOURCE_TYPE` varchar(20) DEFAULT NULL COMMENT '商品来源类型. 1=平台商品中心;2=整车商品中心',
  `MDSE_RANGE_TYPE` varchar(64) DEFAULT NULL COMMENT '商品范围类型',
  `TRIGGER_EVENT` tinyint(4) DEFAULT NULL COMMENT '触发事件',
  `BASE_ADDUP_TYPE` varchar(64) DEFAULT NULL COMMENT '累计方式',
  `AMOUNT_TYPE` varchar(64) DEFAULT NULL COMMENT '量词类型',
  `REWARD_TYPE` varchar(64) DEFAULT NULL COMMENT '奖励类型',
  `REWARD_AMOUNT_TYPE` varchar(64) DEFAULT NULL COMMENT '奖励数值类型',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '创建人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `UPDATE_USER_ID` varchar(50) DEFAULT NULL COMMENT '修改人',
  `TEMPLATE_STATUS` tinyint(4) DEFAULT NULL COMMENT '模板状态. 0=停用;1=启用',
  `SHOW_NUM` int(11) DEFAULT NULL COMMENT '显示顺序',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='促销模板信息';
INSERT INTO `t_prmt_template` VALUES ('1', 'TP0000000001', '单品买送', '0', '1', '02', '0', 'P201608090200057', null, '1,3', '0', null, '1', '0', null, '3', '1', '2', '1,4', '3', '2016-09-28 18:15:51', null, null, null, '1', '2');
INSERT INTO `t_prmt_template` VALUES ('2', 'TP0000000002', '单品直降', '0', '1', '02', '0', 'P201608090200057', null, '1,3', '0', null, '1', '0', null, '3', '1', '2', '2', '1,2', '2016-09-28 18:20:10', null, null, null, '1', '1');
INSERT INTO `t_prmt_template` VALUES ('3', 'TP0000000003', '订单满赠', '0', '1', '02', '0', 'P201608090200057', null, '1,3', '0', null, '2', '0', null, '3', '2,3', '1', '1,4', '3', '2016-09-28 18:22:59', null, null, null, '1', '3');
INSERT INTO `t_prmt_template` VALUES ('4', 'TP0000000004', '订单满折', '0', '1', '02', '0', 'P201608090200057', null, '1,3', '0', null, '2', '0', null, '3', '2,3', '2', '2', '2', '2016-09-28 18:20:10', null, null, null, '1', '4');
