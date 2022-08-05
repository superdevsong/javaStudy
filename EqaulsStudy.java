import java.util.HashMap;
import java.util.Objects;

class SampleObject{
    private int a;
    SampleObject(int a){
        this.a = a;
    }
    @Override
    public boolean equals(Object object){
        if(object == this) return true;

        if(object instanceof SampleObject){
            if(((SampleObject) object).a == this.a)
                return true;
            else
                return false;
        } else
            return false;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(this.a);
    }
}

public class EqaulsStudy {
    public static void main(String[] args) {
        //equals 예시
        String sample1 = new String("1234");
        String sample2 = new String("1234");

        System.out.println(sample1==sample2);//false
        System.out.println(sample1.equals(sample2));//true
        System.out.println(sample1.equals(sample2));//true
        System.out.println(sample1.hashCode()==sample2.hashCode());//true


        SampleObject sampleObject1 = new SampleObject(4);
        SampleObject sampleObject2 = new SampleObject(4);
        System.out.println(sampleObject1.equals(sampleObject2));//true
        System.out.println(sampleObject1.hashCode()==sampleObject2.hashCode());//true

        HashMap<SampleObject,Integer> hashMap = new HashMap<>();
        hashMap.put(sampleObject1,1);
        hashMap.put(sampleObject2,1);
        System.out.println(hashMap.size());//1



    }
}
