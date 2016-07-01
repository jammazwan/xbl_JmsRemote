package jammazwan.xbl;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XblTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testXbl() throws Exception {
		MockEndpoint mock = getMockEndpoint("mock:hi");
		mock.expectedBodiesReceived("random message");
		template.requestBody("jms:hi", "random message");
		mock.assertIsSatisfied();
	}

}
