package com.activemq.example;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTextMessage;

public class ActiveMQProducerByExample {

	public static void produceMessageToMQ() throws JMSException {
		Connection connection = new ActiveMQConnectionFactory("admin","admin","tcp://localhost:61616").createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination producerQueue=new ActiveMQQueue("producermq");
		MessageProducer MessageProducer=session.createProducer(producerQueue);
		TextMessage message=new ActiveMQTextMessage();
        message.setText(" Hi  This is First text messsage");	
        MessageProducer.send(message);
        System.out.println(" Message Sent");
	}
}
