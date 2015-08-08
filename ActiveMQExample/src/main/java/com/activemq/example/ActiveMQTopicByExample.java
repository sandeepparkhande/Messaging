package com.activemq.example;

import java.util.Date;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.activemq.command.ActiveMQTopic;

public class ActiveMQTopicByExample {

	public static void produceMessageFromTopic() throws JMSException {
		TopicConnection  connection = new ActiveMQConnectionFactory("admin","admin","tcp://localhost:61616").createTopicConnection();
		connection.start();
		TopicSession  session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination activeMQTopic=new ActiveMQTopic("activemqtopic");
		MessageProducer  MessageProducer =session.createProducer(activeMQTopic);
		TextMessage textMessage=new ActiveMQTextMessage();
		textMessage.setText("Topic Message"+new Date().toString());
		MessageProducer.send(textMessage);
        System.out.println(" Topic Message sent"+textMessage.getText());
	}
}
