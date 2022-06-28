package ru.netology.sqr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SQRServiceTest {

    @Test
    public void shouldCalc() {
        SQRService service = new SQRService();
        int actual = service.calcCount(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMin() {
        SQRService service = new SQRService();
        int actual = service.calcCount(99, 101);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMax() {
        SQRService service = new SQRService();
        int actual = service.calcCount(9_800, 9_802);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMinOutside() {
        SQRService service = new SQRService();
        int actual = service.calcCount(0, 99);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMaxOutside() {
        SQRService service = new SQRService();
        int actual = service.calcCount(9_802, 1_000_000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNegativeNumber() {
        SQRService service = new SQRService();
        int actual = service.calcCount(-200, -300);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
