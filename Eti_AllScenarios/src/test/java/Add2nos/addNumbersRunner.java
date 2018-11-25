package Add2nos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"src/test/resources/Addition/"},
					glue= {"Add2nos/" },
					tags={"@Second"},
					monochrome=true

		)

public class addNumbersRunner {

}
