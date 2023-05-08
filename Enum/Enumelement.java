package CoreJavaYouTube.Enum;
// Enums are named constants
// enumerations serve the purpose of representing a group of named constants instead of String
enum Status{
    Coding,Compile, Running, Failed, Success;
        }
public class Enumelement{
        public static void main(String a[]){
              Status obj = Status.Success;
              System.out.println(obj);
            System.out.println(Status.Success);
                System.out.println(obj.ordinal());
               Status[] ss = Status.values(); // .values() it creates array
              for(Status s : ss){
                      System.out.println(s);
              }
            System.out.println(obj.ordinal());// By index value

        }
}