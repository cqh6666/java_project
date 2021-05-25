package book_learn.src.com.haige;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //Dog test
        Dog dog = new Dog();
        dog.size = 40;
        dog.bark();

    }
}
