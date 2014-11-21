import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;

// Place your Spring DSL code here
beans = {
	/*jmsConnectionFactory(org.springframework.jndi.JndiObjectFactoryBean) {
		jndiName = "jms/RemoteConnectionFactory"
		jndiEnvironment = [
			'java.naming.factory.initial':'org.jboss.naming.remote.client.InitialContextFactory',
			'java.naming.provider.url':'remote://jbosstest.cloudapp.net:4447',
			'java.naming.security.principal':'jmsuser',
			'java.naming.security.credentials':'\1qaz2wsx'
		] 
	}*/
}
