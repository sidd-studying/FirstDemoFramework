package MockitoTutorial;

import org.junit.Test;
import org.mockito.BDDMockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpringUsingMock() {
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
        assertEquals("Learn Spring MVC", filteredTodos.get(0));
        assertEquals("Learn Spring", filteredTodos.get(1));
        verify(todoServiceMock).retrieveTodos("Dummy");
    }

    @Test
    public void testRetrieveTodosRelatedToSpringUsingBDDAndMock() {
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
        BDDMockito.given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
        assertThat(filteredTodos.size(), is(2));
        assertThat(filteredTodos.get(0), is("Learn Spring MVC"));
        assertThat(filteredTodos.get(1), is("Learn Spring"));
        verify(todoServiceMock).retrieveTodos("Dummy");
    }
}
