package taskIP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IP {
    //считывание IP с консоли
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        String end = reader.readLine();
        reader.close();
    }
}
