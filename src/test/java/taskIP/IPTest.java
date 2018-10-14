package taskIP;

import org.junit.Test;

import static org.junit.Assert.*;
import taskIP.IP;

public class IPTest {

    @Test
    public void ipToLong() {
        assertEquals("3197501696", 3197501696L, IP.ipToLong("190.150.1.0"));
    }

    @Test
    public void longToIp() {
        assertEquals("190.150.1.0", "190.150.1.0", IP.longToIp(3197501696L));
    }
}