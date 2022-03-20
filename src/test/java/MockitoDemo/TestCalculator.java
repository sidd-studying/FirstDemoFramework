package MockitoDemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {

    Calculator calculator;

    @Mock
    CalculatorService service;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        calculator = new Calculator(service);
    }

    @Test
    public void testAdd() {
        Mockito.when(service.add(2, 3)).thenReturn(5);
        Assert.assertEquals(10, calculator.add(2, 3));
        Mockito.verify(service).add(2, 3);
    }
}
