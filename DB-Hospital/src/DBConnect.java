import java.sql.*;
import java.util.Scanner;



public class DBConnect {
	private Connection con;
	private	Statement st;
	private ResultSet rs;
	
	public Scanner s = new Scanner(System.in);
	
	public DBConnect(){
		try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital" , "root", "380data");
				st = con.createStatement();
				
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	
	public void getData(){
		
		try{
			String query = "Select * from Doctor";
			rs = st.executeQuery(query);
			System.out.println("Record from Database");
			while(rs.next()){
				String name = rs.getString("Name");
				String ssn = rs.getString("SSN");
				String BD = rs.getString("BirthDate");
				System.out.println("Doctor's name [ "+ name+" ] .. His SSN [ "+ssn+" ] .. His BirthDate [ "+BD+" ]");
			}
			
		}catch(Exception ex){
			System.out.println("Error :"+ ex);
		}
		
	}
	
	public void search(){
		
		try{
			System.out.println("Please enter what do you want to search");
			System.out.println("Enter ( d ) for Docter and ( p ) for Patient  ");
			System.out.println("Your input: ");
			String input = s.nextLine();
			
			System.out.println("Please enter the SSN: ");
			int ssnInput= s.nextInt();
			
			switch(input.charAt(0)){
				case 'd':		{String query = "Select * from Doctor";
									rs = st.executeQuery(query);
									System.out.println("");
									while(rs.next()){
										String name = rs.getString("Name");
										String ssn = rs.getString("SSN");
										String BD = rs.getString("BirthDate");
										int x = Integer.parseInt(ssn);
										if(  x == ssnInput)
											System.out.println("Doctor's name [ "+ name+" ] .. His SSN [ "+ssn+" ] .. His BirthDate [ "+BD+" ]");
									}
										break;}
				case 'p':		{String query = "Select * from Patient";
									rs = st.executeQuery(query);
									System.out.println("");
									while(rs.next()){
										String name = rs.getString("Name");
										String ssn = rs.getString("SSN");
										String BD = rs.getString("BirthDate");
										int x = Integer.parseInt(ssn);
										if(  x == ssnInput)
											System.out.println("Patient's name [ "+ name+" ] .. His SSN [ "+ssn+" ] .. His BirthDate [ "+BD+" ]");
									}
										break;}
				}
			
			
		}catch(Exception ex){
			System.out.println("Error :"+ ex);
		}
		
	}
	
	public void insert(){

        try{
            String name;
            int hid;
            System.out.print("please enter the Hospital ID: ");
            hid = s.nextInt();
            
            System.out.print("please enter the Hospital name: ");
            name = s.next();

            

            String query ="INSERT INTO `Hospital`.`Hospital` (`idHospital`, `Hname`) VALUES ('"+hid+"', '"+name+"');";
            st.executeUpdate(query);


        }catch(Exception ex){
            System.out.println("Error :"+ ex);
        }

    }
	
	public void delete(){
		try{
			System.out.print("Plese enter your key:");
			int key=s.nextInt();
			
			String query="DELETE FROM Hospital.Hospital WHERE idHospital='"+key+"';";
			boolean flag=st.execute(query);
			
		}
		catch(Exception e){
			System.out.println("Error:"+e);
		}
		
		
	}
	public void edit(){
		try{
			System.out.print("Plese enter your key:");
			int key=s.nextInt();
			System.out.print("Your NEW ID:");
			int id=s.nextInt();
			System.out.println("Your NEW name:");
			String name=s.next();
			
			String query="UPDATE Hospital.Hospital SET idHospital="+id+", Hname="+name+" WHERE idHospital='"+key+"';";
			st.execute(query);
		}
		catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
	
}