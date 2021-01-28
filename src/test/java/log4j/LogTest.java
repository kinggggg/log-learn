package log4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liweibo03 <liweibo03@kuaishou.com>
 * Created on 2021-01-27
 */
public class LogTest {

    @Test
    public void levelAndThresholdTest() {
        Logger fileALogger = LoggerFactory.getLogger("FileALogger");
        Logger fileBLogger = LoggerFactory.getLogger("FileBLogger");
        Logger fileCLogger = LoggerFactory.getLogger("FileCLogger");

        fileALogger.info("fileALogger info");
        fileBLogger.info("fileBLogger info");
        fileCLogger.info("fileBLogger info");


    }
}
