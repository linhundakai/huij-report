/**
 * 
 */
package com.huij.report.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(basePackages = { "com.huij.report.back.mapper" }, sqlSessionFactoryRef = "backSqlSessionFactory")
public class MybatisBackConfig {
	@Bean(name = "backDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.back")
	@Primary
	public DataSource backDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "backSqlSessionFactory")
	@Primary
	public SqlSessionFactory backSqlSessionFactory(@Qualifier("backDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/back/*.xml"));
		return bean.getObject();
	}

	@Bean(name = "backTransactionManager")
	@Primary
	public DataSourceTransactionManager backTransactionManager(@Qualifier("backDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "backSqlSessionTemplate")
	public SqlSessionTemplate backSqlSessionTemplate(
			@Qualifier("backSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
