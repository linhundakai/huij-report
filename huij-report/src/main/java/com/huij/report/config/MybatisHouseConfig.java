/**
 * 
 */
package com.huij.report.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author Administrator
 *
 */
@Configuration
@MapperScan(basePackages = { "com.huij.report.house.mapper" }, sqlSessionFactoryRef = "houseSqlSessionFactory")
public class MybatisHouseConfig {
	@Bean(name = "houseDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.house")
	public DataSource houseDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "houseSqlSessionFactory")
	public SqlSessionFactory houseSqlSessionFactory(@Qualifier("houseDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/house/*.xml"));
		return bean.getObject();
	}

	@Bean(name = "houseTransactionManager")
	public DataSourceTransactionManager houseTransactionManager(@Qualifier("houseDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "houseSqlSessionTemplate")
	public SqlSessionTemplate houseSqlSessionTemplate(
			@Qualifier("houseSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
