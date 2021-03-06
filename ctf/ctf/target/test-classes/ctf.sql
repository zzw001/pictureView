-- MySQL Script generated by MySQL Workbench
-- 05/24/18 17:59:34
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
-- SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
-- SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` VARCHAR(63) NOT NULL COMMENT '用户id',
  `email` VARCHAR(31) NOT NULL COMMENT '邮箱',
  `user_name` VARCHAR(31) NOT NULL COMMENT '昵称',
  `password` VARCHAR(63) NULL COMMENT '密码',
  `real_name` VARCHAR(31) NULL COMMENT '真实姓名',
  `user_number` VARCHAR(15) NULL COMMENT '学号/工号',
  `school_id` INT NULL COMMENT '专业id',
  `user_type` INT NULL COMMENT '用户分类:0.学生 1.老师',
  `state` INT NULL COMMENT '账号状态：-1:冻结 0:未认证 1:已认证',
  `score` INT UNSIGNED NULL COMMENT '总积分',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC))
ENGINE = InnoDB
COMMENT = '用户表';


-- -----------------------------------------------------
-- Table `authentication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `authentication` ;

CREATE TABLE IF NOT EXISTS `authentication` (
  `auth_id` INT NOT NULL AUTO_INCREMENT COMMENT '认证id',
  `user_id` VARCHAR(63) NULL COMMENT '用户id',
  `code` VARCHAR(63) NULL COMMENT '激活码',
  `auth_type` INT NULL COMMENT '账号类别：0:注册 1:找回密码',
  `create_time` DATETIME NULL COMMENT '申请时间',
  PRIMARY KEY (`auth_id`))
ENGINE = InnoDB
COMMENT = '账号认证表';


-- -----------------------------------------------------
-- Table `permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `permission` ;

CREATE TABLE IF NOT EXISTS `permission` (
  `per_id` INT NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `per_name` VARCHAR(15) NOT NULL COMMENT '权限名称',
  `per_desc` VARCHAR(255) NULL COMMENT '权限描述',
  PRIMARY KEY (`per_id`),
  UNIQUE INDEX `per_name_UNIQUE` (`per_name` ASC))
ENGINE = InnoDB
COMMENT = '权限表';


-- -----------------------------------------------------
-- Table `role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `role` ;

CREATE TABLE IF NOT EXISTS `role` (
  `role_id` INT NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` VARCHAR(15) NOT NULL COMMENT '角色名称',
  `role_desc` VARCHAR(255) NULL COMMENT '角色描述',
  PRIMARY KEY (`role_id`),
  UNIQUE INDEX `role_name_UNIQUE` (`role_name` ASC))
ENGINE = InnoDB
COMMENT = '角色表';

INSERT INTO `role` (`role_id`, `role_name`, `role_desc`) VALUES ('1', 'admin', '管理员');
INSERT INTO `role` (`role_id`, `role_name`, `role_desc`) VALUES ('2', 'school', '学校负责人');
INSERT INTO `role` (`role_id`, `role_name`, `role_desc`) VALUES ('3', 'teacher', '教师');
INSERT INTO `role` (`role_id`, `role_name`, `role_desc`) VALUES ('4', 'student', '学生');

-- -----------------------------------------------------
-- Table `control`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `control` ;

CREATE TABLE IF NOT EXISTS `control` (
  `ctl_id` INT NOT NULL AUTO_INCREMENT COMMENT '控制id',
  `per_id` INT NULL COMMENT '权限id',
  `ctl_source` VARCHAR(31) NULL COMMENT '资源路径',
  PRIMARY KEY (`ctl_id`))
ENGINE = InnoDB
COMMENT = '权限资源控制表:例如权限下的增删改查';


-- -----------------------------------------------------
-- Table `user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_role` ;

CREATE TABLE IF NOT EXISTS `user_role` (
  `user_role_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户权限id',
  `user_id` VARCHAR(63) NULL COMMENT '用户id',
  `role_id` INT NULL COMMENT '权限id',
  PRIMARY KEY (`user_role_id`))
ENGINE = InnoDB
COMMENT = '用户角色表';


-- -----------------------------------------------------
-- Table `role_per`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `role_per` ;

CREATE TABLE IF NOT EXISTS `role_per` (
  `role_per_id` INT NOT NULL AUTO_INCREMENT COMMENT '角色权限id',
  `role_id` INT NULL COMMENT '角色id',
  `per_id` INT NULL COMMENT '权限id',
  PRIMARY KEY (`role_per_id`))
ENGINE = InnoDB
COMMENT = '角色权限表';


-- -----------------------------------------------------
-- Table `per_ctl`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `per_ctl` ;

CREATE TABLE IF NOT EXISTS `per_ctl` (
  `per_ctl_id` INT NOT NULL,
  `per_id` VARCHAR(45) NULL,
  `ctl` VARCHAR(45) NULL,
  PRIMARY KEY (`per_ctl_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school` ;

CREATE TABLE IF NOT EXISTS `school` (
  `school_id` INT NOT NULL AUTO_INCREMENT COMMENT '学校id',
  `school_name` VARCHAR(31) NOT NULL COMMENT '学校名称',
  PRIMARY KEY (`school_id`),
  UNIQUE INDEX `school_name_UNIQUE` (`school_name` ASC))
ENGINE = InnoDB
COMMENT = '学校表';

INSERT INTO `school` (`school_id`, `school_name`) VALUES ('1', '华南农业大学');
INSERT INTO `school` (`school_id`, `school_name`) VALUES ('2', '华南理工大学');
INSERT INTO `school` (`school_id`, `school_name`) VALUES ('3', '华南师范大学');

-- -----------------------------------------------------
-- Table `challenge`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `challenge` ;

CREATE TABLE IF NOT EXISTS `challenge` (
  `chal_id` VARCHAR(63) NOT NULL COMMENT '题目id',
  `chal_name` VARCHAR(31) NULL COMMENT '题目名称',
  `chal_desc` VARCHAR(255) NULL COMMENT '题目描述',
  `cate_id` INT NULL COMMENT '题目分类id',
  `flag` VARCHAR(63) NULL COMMENT '题目flag',
  `chal_score` INT UNSIGNED NULL COMMENT '题目分数',
  `chal_source` VARCHAR(31) NULL COMMENT '题目来源： 原创|收录',
  `chal_point` VARCHAR(63) NULL COMMENT '题目考察点',
  `writeup` VARCHAR(255) NULL COMMENT '解题思路',
  `show_state` INT NULL COMMENT '显示状态:0:不可见 1:可见',
  `author_id` VARCHAR(31) NULL COMMENT '出题人id',
  `verifitor_id` VARCHAR(31) NULL COMMENT '审核人id',
  `verify_state` INT NULL COMMENT '审核状态:-1:不通过 0:未申请 1:待审核 2:审核通过',
  PRIMARY KEY (`chal_id`))
ENGINE = InnoDB
COMMENT = '题目表';


-- -----------------------------------------------------
-- Table `file`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `file` ;

CREATE TABLE IF NOT EXISTS `file` (
  `file_id` INT NOT NULL AUTO_INCREMENT COMMENT '文件id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `file_name` VARCHAR(63) NULL COMMENT '文件名称',
  `file_path` VARCHAR(63) NULL COMMENT '文件路径',
  PRIMARY KEY (`file_id`))
ENGINE = InnoDB
COMMENT = '题目附件表';


-- -----------------------------------------------------
-- Table `hint`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hint` ;

CREATE TABLE IF NOT EXISTS `hint` (
  `hint_id` INT NOT NULL AUTO_INCREMENT COMMENT '题目提示id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `hint_desc` VARCHAR(255) NULL COMMENT '提示描述',
  `hint_cost` INT UNSIGNED NULL COMMENT '提示消耗积分',
  PRIMARY KEY (`hint_id`))
ENGINE = InnoDB
COMMENT = '题目提示表';


-- -----------------------------------------------------
-- Table `deliver`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `deliver` ;

CREATE TABLE IF NOT EXISTS `deliver` (
  `deli_id` INT NOT NULL AUTO_INCREMENT COMMENT '题目投递id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `author_id` VARCHAR(31) NULL COMMENT '出题人id',
  `deli_time` DATETIME NULL COMMENT '投递时间',
  PRIMARY KEY (`deli_id`))
ENGINE = InnoDB
COMMENT = '题目投递表';


-- -----------------------------------------------------
-- Table `verification`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `verification` ;

CREATE TABLE IF NOT EXISTS `verification` (
  `veri_id` INT NOT NULL AUTO_INCREMENT COMMENT '审核id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `verifitor_id` VARCHAR(31) NULL COMMENT '审核员id',
  `verify_state` INT NULL COMMENT '审核状态-1:不通过 0:未申请 1:待审核 2:审核通过',
  `verify_desc` VARCHAR(255) NULL COMMENT '审核时间',
  `verify_time` DATETIME NULL COMMENT '审核时间',
  PRIMARY KEY (`veri_id`))
ENGINE = InnoDB
COMMENT = '题目审核详情表';


-- -----------------------------------------------------
-- Table `submit`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `submit` ;

CREATE TABLE IF NOT EXISTS `submit` (
  `sub_id` INT NOT NULL AUTO_INCREMENT COMMENT '题目提交id',
  `user_id` VARCHAR(63) NULL COMMENT '用户id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `sub_state` INT NULL COMMENT '提交状态：0：错误 1：对',
  `sub_flag` VARCHAR(63) NULL COMMENT '提交flag',
  `sub_time` DATETIME NULL COMMENT '提交时间',
  PRIMARY KEY (`sub_id`))
ENGINE = InnoDB
COMMENT = '题目提交情况详情表';


-- -----------------------------------------------------
-- Table `score`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `score` ;

CREATE TABLE IF NOT EXISTS `score` (
  `score_id` INT NOT NULL AUTO_INCREMENT COMMENT '积分id',
  `user_id` VARCHAR(63) NULL COMMENT '用户id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `score_type` VARCHAR(15) NULL COMMENT '积分类型:提交flag | 出题 | 查看提示|奖励',
  `score` INT NULL COMMENT '分值：做对题目插入正分| 查看提示插入负分',
  `opt_time` DATETIME NULL COMMENT '操作时间',
  PRIMARY KEY (`score_id`))
ENGINE = InnoDB
COMMENT = '题目积分明细表';


-- -----------------------------------------------------
-- Table `maintenance`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `maintenance` ;

CREATE TABLE IF NOT EXISTS `maintenance` (
  `mate_id` INT NOT NULL AUTO_INCREMENT COMMENT '题目维护id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `matestaff_id` VARCHAR(31) NULL COMMENT '维护员id',
  `mate_state` INT NULL COMMENT '维护状态0:不可见 1:可见',
  `mate_time` DATETIME NULL COMMENT '维护时间',
  PRIMARY KEY (`mate_id`))
ENGINE = InnoDB
COMMENT = '题目维护表';


-- -----------------------------------------------------
-- Table `hint_used`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hint_used` ;

CREATE TABLE IF NOT EXISTS `hint_used` (
  `hint_used_id` INT NOT NULL AUTO_INCREMENT COMMENT '提示使用id',
  `user_id` VARCHAR(63) NULL COMMENT '用户id',
  `chal_id` VARCHAR(63) NULL COMMENT '题目id',
  `hint_id` INT NULL COMMENT '提示id',
  `used_time` DATETIME NULL COMMENT '提示使用时间',
  PRIMARY KEY (`hint_used_id`))
ENGINE = InnoDB
COMMENT = '题目提示使用详情表';


-- -----------------------------------------------------
-- Table `catagory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `category` ;

CREATE TABLE IF NOT EXISTS `category` (
  `cate_id` INT NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `cate_name` VARCHAR(31) NOT NULL COMMENT '分类名字',
  `cate_desc` VARCHAR(255) NULL COMMENT '分类描述',
  PRIMARY KEY (`cate_id`),
  UNIQUE INDEX `cate_name_UNIQUE` (`cate_name` ASC))
ENGINE = InnoDB
COMMENT = '题目分类表';

INSERT INTO `category` (`cate_id`, `cate_name`, `cate_desc`) VALUES ('1', 'web安全', '关注web网页安全，保障服务器安全');
INSERT INTO `category` (`cate_id`, `cate_name`, `cate_desc`) VALUES ('2', '密码学', '有关md5加密，sh256加密');


-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
