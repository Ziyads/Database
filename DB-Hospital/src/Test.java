import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	DBConnect connect = new DBConnect();
    	 String in="";
    	do{
            //connect.getData();
            System.out.println("1)Insert\n2)Delete\n3)Search\n0)Exit");
            System.out.print("Your input:");
            in=s.next();
            switch(in){
            	case "0": System.out.println("Bye, Come Back Agin :)");
            		break;
            	case "1":connect.insert();
            		break;
            	case "2":connect.delete();
            		break;
            	case "3":connect.search();
            		break;
            	default : System.out.println("Plese enter your input again:");	
            }
    	}while( !in.equals("0") );
        
    }
}
