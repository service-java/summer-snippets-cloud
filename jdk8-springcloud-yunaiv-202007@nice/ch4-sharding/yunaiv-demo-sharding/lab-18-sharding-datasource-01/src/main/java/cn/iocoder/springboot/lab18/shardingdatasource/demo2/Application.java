package cn.iocoder.springboot.lab18.shardingdatasource.demo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.iocoder.springboot.lab18.shardingdatasource.demo2.mapper")
public class Application {
}
