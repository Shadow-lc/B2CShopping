DROP TABLE IF EXISTS t_member;
CREATE TABLE t_member (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(20) NOT NULL COMMENT '用户名',
  password VARCHAR(20) NOT NULL COMMENT '密码',
  age INT NOT NULL COMMENT '年龄',
  birthday VARCHAR(20) NOT NULL COMMENT '生日',
  phone VARCHAR(20) COMMENT '手机号',
  email VARCHAR(30) NOT NULL COMMENT '邮箱',
  member_credit int NOT NULL COMMENT '会员积分',
  member_layer_id int NOT NULL COMMENT '会员等级编号',
  is_delete VARCHAR(1) DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_member_layer;
CREATE TABLE t_member_layer(
  member_layer_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '会员等级编号',
  score_floor INT NOT NULL COMMENT '会员积分下限',
  member_layer VARCHAR(20) NOT NULL COMMENT '会员等级',
  member_discount VARCHAR(10) NOT NULL COMMENT '会员折扣'
);

INSERT INTO t_member_layer(score_floor, member_layer, member_discount) VALUES (0, '普通会员', '0.95');
INSERT INTO t_member_layer(score_floor, member_layer, member_discount) VALUES (3000, '银卡会员', '0.9');
INSERT INTO t_member_layer(score_floor, member_layer, member_discount) VALUES (8000, '金卡会员', '0.85');
INSERT INTO t_member_layer(score_floor, member_layer, member_discount) VALUES (15000, '白金卡会员', '0.8');

DROP TABLE IF EXISTS t_address;
CREATE TABLE t_address(
  id INT PRIMARY KEY AUTO_INCREMENT,
  member_id int NOT NULL COMMENT '会员编号',
  name VARCHAR(20) NOT NULL COMMENT '收货人姓名',
  province_id VARCHAR(20) NOT NULL COMMENT '省编号',
  city_id VARCHAR(20) NOT NULL COMMENT '市编号',
  area_id VARCHAR(20) NOT NULL COMMENT '区编号',
  address VARCHAR(255) NOT NULL COMMENT '详细地址',
  phone_num VARCHAR(20) NOT NULL COMMENT '手机号',
  is_default VARCHAR(1) NOT NULL DEFAULT '0' COMMENT '是否默认地址',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_history;
CREATE TABLE t_history(
  id INT PRIMARY KEY AUTO_INCREMENT,
  member_id INT NOT NULL COMMENT '会员编号',
  goods_id INT NOT NULL COMMENT '商品编号',
  type_id INT NOT NULL COMMENT '类别编号',
  browse_date VARCHAR(30) NOT NULL COMMENT '浏览时间',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_goods_type;
CREATE TABLE t_goods_type(
  id INT PRIMARY KEY AUTO_INCREMENT,
  type_id INT NOT NULL COMMENT '类别编号',
  type_name VARCHAR(20) NOT NULL COMMENT '类别名',
  standard_id VARCHAR(255),
  parent_id INT NOT NULL DEFAULT 0 COMMENT '父编号',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_goods;
CREATE TABLE t_goods(
  id INT PRIMARY KEY AUTO_INCREMENT,
  goods_id INT NOT NULL COMMENT '商品编号',
  type_id INT NOT NULL COMMENT '类别编号',
  goods_name VARCHAR(30) NOT NULL COMMENT '商品名称',
  goods_desc VARCHAR(255) NOT NULL COMMENT '商品描述',
  add_date VARCHAR(30) NOT NULL COMMENT '添加时间',
  is_putaway VARCHAR(1) NOT NULL DEFAULT '0' COMMENT '是否上架',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_goods_standard;
CREATE TABLE t_goods_standard(
  id INT PRIMARY KEY AUTO_INCREMENT,
  standard_name VARCHAR(20) NOT NULL COMMENT '规格名',
  standard_value VARCHAR(30) NOT NULL COMMENT '规格值'
);

DROP TABLE IF EXISTS t_goods_stock;
CREATE TABLE t_goods_stock(
  id INT PRIMARY KEY AUTO_INCREMENT,
  goods_id INT NOT NULL COMMENT '商品编号',
  standard_info VARCHAR(255) NOT NULL COMMENT '规格详情',
  stock_num INT NOT NULL DEFAULT 0 COMMENT '库存量',
  price DOUBLE(10, 2) NOT NULL DEFAULT '0.00' COMMENT '价格'
);

DROP TABLE IF EXISTS t_goods_review;
CREATE TABLE t_goods_review(
  id INT PRIMARY KEY AUTO_INCREMENT,
  goods_id INT NOT NULL COMMENT '商品编号',
  member_id INT NOT NULL COMMENT '会员编号',
  member_name VARCHAR(20) NOT NULL COMMENT '会员名',
  publish_date VARCHAR(20) NOT NULL COMMENT '发表时间',
  review VARCHAR(255) NOT NULL COMMENT '评论',
  score DOUBLE(3, 1) NOT NULL NULL COMMENT '分数',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_car;
CREATE TABLE t_car(
  id INT PRIMARY KEY AUTO_INCREMENT,
  member_id INT NOT NULL COMMENT '会员编号',
  goods_id INT NOT NULL COMMENT '商品编号',
  num INT NOT NULL DEFAULT 1 COMMENT '数量',
  add_date VARCHAR(30) NOT NULL COMMENT '加入时间'
);

DROP TABLE IF EXISTS t_collect;
CREATE TABLE t_collect(
  id INT PRIMARY KEY AUTO_INCREMENT,
  member_id INT NOT NULL COMMENT '会员编号',
  goods_id INT NOT NULL COMMENT '商品编号',
  colletion_date VARCHAR(30) NOT NULL COMMENT '收藏时间'
);

DROP TABLE IF EXISTS t_order;
CREATE TABLE t_order(
  id INT PRIMARY KEY AUTO_INCREMENT,
  order_no VARCHAR(64) NOT NULL COMMENT '订单号',
  member_id INT NOT NULL COMMENT '会员编号',
  credit int NOT NULL COMMENT '本次订单的积分',
  address VARCHAR(255) NOT NULL COMMENT '送货地址',
  pay_type VARCHAR(10) NOT NULL COMMENT '支付方式：支付宝/货到付款',
  order_date VARCHAR(30) NOT NULL COMMENT '下单时间',
  amount DOUBLE(10, 2) NOT NULL COMMENT '订单金额',
  credit_used INT DEFAULT 0 COMMENT '使用积分',
  status VARCHAR(10) DEFAULT '未支付' COMMENT '订单状态：未支付/已支付',
  handle VARCHAR(10) DEFAULT '未审核' COMMENT '处理情况：未审核/已审核',
  is_delete VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '是否删除'
);

DROP TABLE IF EXISTS t_order_detail;
CREATE TABLE t_order_detail(
  id INT PRIMARY KEY AUTO_INCREMENT,
  order_no VARCHAR(64) NOT NULL COMMENT '订单号',
  goods_id INT NOT NULL COMMENT '商品编号',
  goods_name VARCHAR(30) NOT NULL COMMENT '商品名称',
  price DOUBLE(10, 2) NOT NULL COMMENT '价格',
  discount DOUBLE(3,2) NOT NULL COMMENT '折扣',
  discount_price DOUBLE(10, 2) NOT NULL COMMENT '价格',
  num INT NOT NULL COMMENT '数量',
  all_price DOUBLE(10, 2) NOT NULL COMMENT '总价'
);