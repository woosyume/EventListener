package ut.net.atlassian.woosyume.plugins;

import org.junit.Test;
import net.atlassian.woosyume.plugins.api.MyPluginComponent;
import net.atlassian.woosyume.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}