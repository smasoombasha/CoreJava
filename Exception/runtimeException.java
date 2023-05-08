package CoreJavaYouTube.Exception;

// Creating Our Own Exception with help of class
class AahenException extends RuntimeException{
    public AahenException(String string){
        super(string);
    }
}
class AahenExceptionString extends RuntimeException{
    public AahenExceptionString(String msg){
        super(msg);
    }
}
public class runtimeException {
    public static void main(String args[]){
        int i=18,j=0, array[] = new int[5];
        String name = "SMasoomBahsatetr";
        // Handling Exception
        try{
            j=18/i;// if we give i=0 then out is infinite so it doesnt give our own exception it gives default exception
            if(j==1) throw new AahenException("I don't want zero");
            System.out.println(j);
            System.out.println(name.length());
           // if(name.length() >5) throw new AahenExceptionString("Out of memory delete something.");
            System.out.println(array[0]);
            System.out.println(array[6]);
           // if(n>=5) throw new AahenExceptionIndex(" Your out bound in array size.");
        }

        catch (AahenException e){
            System.out.println("Cannot divide by zero : "+e);
            System.out.println(j);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Stay in limits : "+e);
        }try{
            if(name.length() >5) throw new AahenExceptionString("Out of memory delete something.");
        }
        catch (AahenExceptionString e){
            System.out.println("Too much size in String : "+e);
        }
        catch (Exception e){
            System.out.println("Something went wrong."+e);
        }
        finally {
            System.out.println("Bye ");
        }
    }
}
