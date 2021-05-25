package book_learn.src.com.haige.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @className: book_learn.src.com.haige.serial-> ClassToSerial
 * @description: 类被序列化
 * @author: cqh
 * @createDate: 2021-05-25 10:52
 * @version: 1.0
 * @todo:
 */
public class ClassToSerial {


    public static void main(String[] args) {
        Box box = new Box();
        box.setHeight(50);
        box.setWidth(100);

        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream("box.ser");
            // 通过fs链接到os以让它写入对象
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(box);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
