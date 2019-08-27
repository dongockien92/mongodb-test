package com.uitgis.jms.config;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.uitgis.jms.component.PropsComponent;

@Configuration
@EnableMongoRepositories(basePackages = "com.uitgis.jms")
public class MongoTransactionConfig extends AbstractMongoConfiguration {

	@Autowired
	private PropsComponent propsComponent;

	@Bean
	public MongoTransactionManager transactionManager(MongoDbFactory dbFactory) {
		return new MongoTransactionManager(dbFactory);
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient(propsComponent.getMongoHost(), NumberUtils.toInt(propsComponent.getMongoPort()));
	}

	@Override
	protected String getDatabaseName() {
		return propsComponent.getMongoDatabase();
	}

}
