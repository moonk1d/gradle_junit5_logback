import static org.junit.jupiter.api.Assertions.assertEquals;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

class CalculatorTest {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(
      CalculatorTest.class);

  @Test
  @DisplayName("1 + 1 = 2")
  void addsTwoNumbers() {
    logger.info("Running Calculator - addsTwoNumbers - test case");
    Calculator calculator = new Calculator();
    assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
  }
}