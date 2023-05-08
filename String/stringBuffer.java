package CoreJavaYouTube.String;

public class stringBuffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Masoom");
        // With help of StringBuffer we can create mutuable strings in java programming
        // And some of examples
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // append concatination
        System.out.println(sb.append(" Basha"));
        System.out.println(sb.insert(0, "java"));
        System.out.println(sb.insert(0, 100));
        System.out.println(sb.delete(0,2));
        // and we can also set length of sb
        sb.setLength(40);
        // min lenght of sb
        sb.ensureCapacity(100);
        // Assigning the sb to String
        String name = sb.toString();
        System.out.println("After Assigning to String : "+name);
    }
}
