package jammazwan.xbl;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;


public class XblRoutes extends RouteBuilder {

    
    

    @Override
    public void configure() throws Exception {
		from("jms:hi").log("\n\n THIS IS JMS \n ${body}\n\n").to("mock:hi");
    }
}
