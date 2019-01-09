package com.biz.oracle.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class StdDataSourceFactory implements DataSourceFactory {

	// 클래스의 member변수 영역
	// 여기에 변수나 객체를 선언하는 것은 이 클래스의 어떤 method에서나 읽고 쓰기가 가능하도록 하겠다 라는의미

	Properties ps;

	@Override
	public void setProperties(Properties props) {
		this.ps = props;
	}

	@Override
	public DataSource getDataSource() {

		PooledDataSource ds = new PooledDataSource();

		ds.setDriver(ps.getProperty("DRIVER"));
		ds.setUrl(ps.getProperty("URL"));
		ds.setUsername(ps.getProperty("USER"));
		ds.setPassword(ps.getProperty("PASSWORD"));

		return ds;
	}

}
