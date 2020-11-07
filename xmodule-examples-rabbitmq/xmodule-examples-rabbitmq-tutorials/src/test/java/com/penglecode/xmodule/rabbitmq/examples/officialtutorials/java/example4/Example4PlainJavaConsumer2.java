package com.penglecode.xmodule.rabbitmq.examples.officialtutorials.java.example4;

import com.penglecode.xmodule.rabbitmq.examples.officialtutorials.java.AbstractRabbitMqExample;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 路由消息示例
 * 
 * 使用指定名称的direct类型的exchange与随机名称的queue及routingKey进行绑定，构建路由消息示例
 * 
 * 
 * @author 	pengpeng
 * @date 	2020年5月16日 下午4:12:31
 */
public class Example4PlainJavaConsumer2 extends AbstractRabbitMqExample {

	private final String exchangeName = "plainjava_routing_exchange";
	
	@Override
	public void run() throws Exception {
		Connection connection = getConnectionFactory().newConnection(); //创建连接
		Channel channel = connection.createChannel(); //创建通道
		
		channel.exchangeDeclare(exchangeName, "direct"); //定义指定名称的direct类型的exchange
		String queueName = channel.queueDeclare().getQueue(); //向RabbitMQ Server声明一个由Server随机生成的、非持久性的、排他的、只与当前连接相关的且退出时自动删除的队列
		channel.queueBind(queueName, exchangeName, "warning"); //绑定随机生成的queue与指定的exchange，该队列只关注routingKey为warning|info的消息
		channel.queueBind(queueName, exchangeName, "info"); //绑定随机生成的queue与指定的exchange，该队列只关注routingKey为warning|info的消息

		//autoAck=true，即noack=true，即客户端没有确认，服务端默认为客户端成功地消费到了消息，并将消息从服务端删除
		channel.basicConsume(queueName, true, new SimpleDeliverCallback(), consumerTag -> {});
		System.out.println("【Example4Consumer】消费启动，logging-level=warning,info");
	}
	
	public static void main(String[] args) throws Exception {
		new Example4PlainJavaConsumer2().run();
		Thread.currentThread().join();
	}

}
