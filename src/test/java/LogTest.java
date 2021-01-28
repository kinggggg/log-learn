import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liweibo03 <liweibo03@kuaishou.com>
 * Created on 2021-01-27
 */
public class LogTest {

    @Test
    public void test() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("Hello World");

        Logger fileALogger = LoggerFactory.getLogger("FileALogger");
        fileALogger.info("aaaa");

        Logger fileBLogger = LoggerFactory.getLogger("FileBLogger");
        fileBLogger.info("bbbb");
    }
}
