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

}
