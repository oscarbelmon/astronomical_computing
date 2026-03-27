package journal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class JulianDayTest {
    @Test
    public void getDayFractionTest() {
        JulianDay jd = new JulianDay(2026, 3, 27, 12, 0, 0);
        double fraction = jd.getDayFraction();
        assertEquals(0.5, fraction);
    }

    @Test
    public void setDayFractionTest() {
        JulianDay jd = new JulianDay(2026, 3, 27);
        jd.setDayFraction(0.5);
        assertEquals(12, jd.hour);
    }

    @Test
    public void isJulianTest() {
        JulianDay jd = new JulianDay(1000, 1, 1);
        assertTrue(jd.isJulian());
        jd = new JulianDay(1582, 9, 1);
        assertTrue(jd.isJulian());
        jd = new JulianDay(1582, 10, 4);
        assertTrue(jd.isJulian());
    }

    @Test
    public void invalidDateTest() throws Exception {
        try {
            new JulianDay(1582, 10, 10);
            throw new Exception();
        } catch(IllegalArgumentException e) {
            
        }
    }
}
