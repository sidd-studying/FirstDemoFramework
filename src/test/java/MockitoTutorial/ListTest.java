package MockitoTutorial;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testListMock() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        Assert.assertEquals(2, listMock.size());
    }

    @Test
    public void testListMockReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(4);
        Assert.assertEquals(2, listMock.size());
        Assert.assertEquals(4, listMock.size());
    }


    @Test
    public void testListMockGet() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Siddharth");
        Assert.assertEquals("Siddharth", listMock.get(0));
        Assert.assertEquals("Siddharth", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void testListMockException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something wrong"));
        listMock.get(0);
        listMock.get(1);
    }


}
