package taskIP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IP {
    //read console ip
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        String end = reader.readLine();
        reader.close();
    }

    //address conversion to decimal number system
    public static long ipToLong(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split("\\.");//splitting ip into components

        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);
        }
        return result;
    }

    //Converting addresses from decimal to string type type 0.0.0.0
    public static String longToIp(long ip) {
        StringBuilder result = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {
            result.insert(0, Long.toString(ip & 0xff));
            if (i < 3) {
                result.insert(0, '.');
            }
            ip = ip >> 8;
        }
        return result.toString();
    }
}
