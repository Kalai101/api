package com.samco.CrudApiSpringBoot;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.samco.CrudApiSpringBoot.CustomerModel.Customer;

@SpringBootApplication
public class CrudApiSpringBootApplication {

	
	
	  
	/*
	 * MongoClient mongo = MongoClients.create(
	 * "mongodb+srv://kalaiselvan:hello@cluster.aesy1nb.mongodb.net/?retryWrites=true&w=majority"
	 * ); MongoDatabase db = mongo.getDatabase("customer");
	 * MongoCollection<Document> collection = db.getCollection("customer_data");
	 * Customer obj = new Customer(); Document doc = new Document()
	 */ 

	public static void main(String[] args) {
		SpringApplication.run(CrudApiSpringBootApplication.class, args);

	}
}
