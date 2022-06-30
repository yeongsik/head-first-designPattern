package chapter3;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream { // 모든 InputStream의 추상 데코레이터인 FilterInputStream 확장

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b , int offset , int len) throws IOException {
        int result = in.read(b,offset , len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
    /*
    이제 2개의 read() 메소드를 구현
    각각 byte 값 또는 byte 배열을 읽고 각 byte(문자)를 검사해서 대문자이면 소문자로 변환
     */


}
