package book_learn.src.com.haige.socket;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @className: book_learn.src.com.haige.socket-> ChatSocket
 * @description: 使用BufferReader从Socket上读取数据
 * @author: cqh
 * @createDate: 2021-05-25 22:38
 * @version: 1.0
 * @todo:
 */
public class ChatSocket {
    public static void main(String[] args){

        ChatSocket chatSocket = new ChatSocket();
        chatSocket.go();


    }

    public void go(){
        try{
            //端口连接
            Socket socket = new Socket("127.0.0.1", 8000);

            InputStreamReader stream = new InputStreamReader(socket.getInputStream());
            // 链接数据串流
            BufferedReader reader = new BufferedReader(stream);

            // 这个readline就跟读取文件来源是一样的
            String message = reader.readLine();

            System.out.println("Today you should: " + message);

            reader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
