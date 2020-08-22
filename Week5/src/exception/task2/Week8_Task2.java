package exception.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8_Task2 {


    public int NPEx() {
        int [] test = null;
        return test.length;
    }


    public int AIOoBEx() {
        int[] test = {1,11,8,5,6,3};
        return test[10];
    }


    public int ArithEx() {

        int a = 10;
        int b = 0;
        return a / b;
    }


    public void FNFEx() throws FileNotFoundException {

        File file = new File("nguyen-thanh-tuyen");
        FileReader fi = new FileReader(file);
    }

    public void IOEx() throws IOException {

        File file = new File("tuyen-tuyen");
        FileReader fi = new FileReader(file);
    }


    public String NPExTest() {
        try {
            NPEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }

        return "Không có lỗi";
    }

    public String AIOoBExTest() {
        try {
            AIOoBEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }

        return "Không có lỗi";
    }

    public String ArithExTest() {
        try {
            ArithEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }

        return "Không có lỗi";
    }

    public String FNFExTest() {
        try {
            FNFEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public String IOExTest() {
        try {
            IOEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}

