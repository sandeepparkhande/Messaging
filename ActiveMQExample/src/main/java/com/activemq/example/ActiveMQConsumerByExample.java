package com.activemq.example;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class ActiveMQConsumerByExample {

	public static TextMessage consumeMessageFromQueue() throws JMSException {
		Connection connection = new ActiveMQConnectionFactory("admin","admin","tcp://localhost:61616").createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination receiverQueue=new ActiveMQQueue("producermq");
		MessageConsumer  MessageConsumer =session.createConsumer(receiverQueue);
        TextMessage message=(TextMessage) MessageConsumer.receive();
        System.out.println(" Message Received"+message);
        return message;
	}
}
