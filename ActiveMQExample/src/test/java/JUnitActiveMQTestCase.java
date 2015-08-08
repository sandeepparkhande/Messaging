import static org.junit.Assert.*;

import javax.jms.JMSException;

import org.junit.Before;
import org.junit.Test;

import com.activemq.example.ActiveMQConsumerByExample;
import com.activemq.example.ActiveMQProducerByExample;
import com.activemq.example.ActiveMQTopicByExample;
import com.activemq.example.ActiveMQTopicSubscriber1ByExample;
import com.activemq.example.ActiveMQTopicSubscriber2ByExample;

public class JUnitActiveMQTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testProduceMessage() throws JMSException {
		ActiveMQProducerByExample.produceMessageToMQ();
	}

	@Test
	public void testConsumeMessage() throws JMSException {
		ActiveMQConsumerByExample.consumeMessageFromQueue();
	}

	@Test
	public void testTopicMessage() throws JMSException {
		ActiveMQTopicByExample.produceMessageFromTopic();
	}

	@Test
	public void testSubscriber1Message() throws JMSException {
		ActiveMQTopicSubscriber1ByExample.subscribeMessage();
	}

	@Test
	public void testSubscriber2Message() throws JMSException {
		ActiveMQTopicSubscriber2ByExample.subscribeMessage();
	}

}
