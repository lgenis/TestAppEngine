import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Assert;
import org.junit.Test;

public class HelloAppEngineTest {

  @Test
  public void testGetAdmins() throws IOException {
    MockHttpServletResponse response = new MockHttpServletResponse();
    try {
		new GetAdmins().doGet(null, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Assert.assertEquals("text/plain", response.getContentType());
    Assert.assertEquals("Hello App Engine!\r\n", response.getWriterContent().toString());
  }
}
