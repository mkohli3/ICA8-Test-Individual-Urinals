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
    @Test
    public void isBinary(){
        System.out.println("====== Manan Kohli == TEST TWO EXECUTED =======");
        assertEquals(0,urinalsFunctions.isBinary("123"));
    }
    @Test
    public void readFileTest(){
        System.out.println("====== Manan Kohli == TEST THREE EXECUTED =======");
        assertEquals(1,urinalsFunctions.ifFileEmpty(null));
    }
    @Test
    public void ifFileExistsTest() throws IOException {
        System.out.println("====== Manan Kohli == TEST FOUR EXECUTED =======");
        String Dir = new java.io.File(".").getCanonicalPath();
        String expectedPath = Dir + "\\urinal.dat";
        assertEquals(1,urinalsFunctions.ifFileExists(expectedPath));
    }
    @Test
    public void ifFileEmptyTest(){
        System.out.println("====== Manan Kohli == TEST FIVE EXECUTED =======");
        assertEquals(1,urinalsFunctions.ifFileEmpty(null));
    }
}
