package easy.tuto.myquizapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Thread implements Runnable{
    private String msg;
    Socket S;
    String msgre;




    @Override
    public void run() {
        try{
            Socket socket = new Socket("192.168.204.1",1235);
            System.out.println("hello, je suis connecte");
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            System.out.println("msg de socket:"+msg);
            pw.println(msg);
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            msgre =s.toString();
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sendMesg(String msg){
        System.out.println("msg :"+msg);
        this.msg= msg;
        run();
        this.msgre = msgre;
    }
    public String getMsg(){ return msg ;}

    public String getMsgre() {
        return msgre;
    }
}
