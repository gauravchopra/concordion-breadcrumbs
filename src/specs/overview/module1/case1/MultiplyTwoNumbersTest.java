package overview.module1.case1;

import org.concordion.api.BeforeSpecification;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.LoggingTooltipExtension;
import org.concordion.ext.inputstyle.InputStyleExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(LoggingTooltipExtension.class)
public class MultiplyTwoNumbersTest {
	
	@BeforeSpecification
	public void setup() {
		//login();
	}
	
	public int getResult(int firstNumber,int secondNumber) {
		return firstNumber*secondNumber;
	}
	
	

}
