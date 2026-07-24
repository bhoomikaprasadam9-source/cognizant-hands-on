import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service using mock
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
}