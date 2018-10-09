# 说明
本地安装的MySQL是8.x，数据库驱动用“com.mysql.cj.jdbc.Driver”，特别注意数据库连接要指定时区(serverTimezone)

数据库连接池用阿里的druid

如果需要，可以自行修改config.properties中数据库部分的配置

# SQL
```sql
-- 建表语句
CREATE TABLE `user` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
   `name` varchar(64) DEFAULT '' COMMENT '用户昵称',
   `birthday` date DEFAULT NULL COMMENT '生日',
   `created_at` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB COMMENT='用户';
-- 初始化用户
insert into user(`name`, `birthday`) values
        ('张三', '1992-10-12'),
        ('李四','1991-08-01'),
        ('王五','1992-08-20');

```

# 参考文档
- http://www.mybatis.org/spring/zh/index.html
- https://github.com/alibaba/druid/wiki

