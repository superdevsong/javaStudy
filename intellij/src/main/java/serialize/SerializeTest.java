package serialize;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args){
        //binary serialization
        SerializeObject serializeObject = new SerializeObject("test","it is test");
        try {
            FileOutputStream fos = new FileOutputStream("data.txt"); // 데이터 쓰기 위한 파일 생성
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serializeObject); // 객체를 직렬화하여 파일에 저장
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("data.txt"); // 읽어올 파일 지정
            ObjectInputStream oos = new ObjectInputStream(fis);
            SerializeObject readSerializeObject = (SerializeObject) oos.readObject(); //직렬화된 객체 읽기
            System.out.println(readSerializeObject);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //json serialization
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("test.json"), new JsonSerializeObject("json test","it is json test"));
            JsonSerializeObject jsonSerializeObject = mapper.readValue(new File("test.json"), JsonSerializeObject.class);
            System.out.println(jsonSerializeObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
