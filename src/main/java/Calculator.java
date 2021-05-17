import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public final class Calculator {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(
      Calculator.class);

  public int add(int a, int b) {
    logger.info(String.format("Addition of [%s] and [%s]", a, b));
    return a + b;
  }

}
