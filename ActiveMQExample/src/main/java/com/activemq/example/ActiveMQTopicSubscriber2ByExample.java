package com.activemq.example;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;

public class ActiveMQTopicSubscriber2ByExample   {

	public static void subscribeMessage() throws JMSException {
		TopicConnection  connection = new ActiveMQConnectionFactory("admin","admin","tcp://localhost:61616").createTopicConnection();
		connection.start();
		TopicSession  session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		Topic activeMQTopic=new ActiveMQTopic("activemqtopic");
		TopicSubscriber subscriber = session.createSubscriber(activeMQTopic);
		ActiveMQListener2 activeMQListener=new ActiveMQListener2();
		subscriber.setMessageListener(activeMQListener);
		System.out.println(" Waiting for Subscribing Message Subscriber 2");
	
	}

}

class ActiveMQListener2 implements MessageListener{

	@Override
	public void onMessage(Message message) {
		System.out.println(" Message Listener"+message);
		
	}
	
}