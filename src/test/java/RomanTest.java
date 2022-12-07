import static org.junit.Assert.*;
import org.junit.Test;

public class RomanTest {


    @Test
    public void convertTestDecimalToRoman(){

        assertEquals("IV", Roman.convertDecimalToRoman(4));
        assertEquals("V", Roman.convertDecimalToRoman(5));
        assertEquals("IX", Roman.convertDecimalToRoman(9));
        assertEquals("IC", Roman.convertDecimalToRoman(99));
        assertEquals("MDXXXXI", Roman.convertDecimalToRoman(1541));
        assertEquals("LXXXVIIII", Roman.convertDecimalToRoman(89));
    }
}
