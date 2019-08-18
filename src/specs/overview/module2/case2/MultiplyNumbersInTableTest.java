package overview.module2.case2;

import org.concordion.api.BeforeSpecification;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.LoggingTooltipExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
//@ConcordionResources(value= {"../../concordion1.css"})
@Extensions(LoggingTooltipExtension.class)
public class MultiplyNumbersInTableTest {
	
	java.util.logging.Logger log = java.util.logging.Logger.getLogger(MultiplyNumbersInTableTest.class.getName());
	
	
	
	@BeforeSpecification
	public void setup() {
		log.info("Initial setup");
	}
	
	
	public int multiply(int firstNum,int secondNum) {
		log.info("Multpilying two numbers");
		
		return firstNum*secondNum;
	}

}
