import com.company.urinalsFunctions;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class urinalsTest {
    @Test
    public void countFreeUrinalsTest(){
        System.out.println("====== Manan Kohli == TEST ONE EXECUTED =======");
        assertEquals(1, urinalsFunctions.countFreeUrinals("10001"));
    }

}
