import java.sql.*;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



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
	public int[] getDnum(int bn){
		try{
			String query = "Select * from `Hospital`.`Department` where Bnumber='"+bn+"' ";
			rs = st.executeQuery(query);
			
			int size=0;
			while(rs.next()){
				size++;
			}
			
			int res[]=new int[size];
			rs = st.executeQuery(query);
			int i=0;
			while(rs.next()){
				res[i]=rs.getInt("Dnumber");
				i++;
			}
			return res;
		}catch(Exception e){
			System.out.println(e.getMessage());
			int r[]=new int[0];
			return r;
		}
	}
	public int[] getBNums(){
		try{
			String query = "Select * from `Hospital`.`Branch`";
			rs = st.executeQuery(query);
			
			int size=0;
			while(rs.next()){
				size++;
			}
			
			int res[]=new int[size];
			rs = st.executeQuery(query);
			int i=0;
			while(rs.next()){
				res[i]=rs.getInt("Bnumber");
				i++;
			}
			return res;
		}catch(Exception e){
			System.out.println(e.getMessage());
			int r[]=new int[0];
			return r;
		}
	}
	public String[][] getData(String kind){
		switch(kind){
			case "Branch":
				try{
					String query = "Select * from Branch";
					rs = st.executeQuery(query);
					System.out.println("Record from Database");
					int size=0;
					while(rs.next()){
						size++;
					}
					
					String ress[][]=new String[size][3];
					rs = st.executeQuery(query);
					int i=0;
					while(rs.next()){
						String Bnumber = rs.getString("Bnumber");
						String Hid = rs.getString("Hid");
						String Location = rs.getString("Location");
						
						ress[i][0]=Bnumber;
						ress[i][1]=Hid;
						ress[i][2]=Location;
						
							i++;	
						System.out.println("Doctor's name [ "+ Bnumber+" ] .. His SSN [ "+Hid+" ] .. His BirthDate [ "+Location+" ]");
					}
					return ress;
				}catch(Exception ex){
					System.out.println("Error :"+ ex);
				}
				break;
			case "Department":
				try{
					String query = "Select * from Department";
					rs = st.executeQuery(query);
					System.out.println("Record from Database");
					int size=0;
					while(rs.next()){
						size++;
					}
					
					String ress[][]=new String[size][4];
					rs = st.executeQuery(query);
					int i=0;
					while(rs.next()){
						String Dnumber=rs.getString("Dnumber");
						String Dname=rs.getString("Dname");
						String Bnumber = rs.getString("Bnumber");
						String Hid = rs.getString("Hid");
						
						
						ress[i][0]=Dnumber;
						ress[i][1]=Dname;
						ress[i][2]=Bnumber;
						ress[i][3]=Hid;
						
							i++;	
						System.out.println("Doctor's name [ "+ Bnumber+" ] .. His SSN [ "+Hid+" ] .. His BirthDate [ "+Dname+" ]");
					}
					return ress;
				}catch(Exception ex){
					System.out.println("Error :"+ ex);
				}
				break;
			case "Doctor":
				try{
					String query = "Select * from Doctor";
					rs = st.executeQuery(query);
					System.out.println("Record from Database");
					int size=0;
					while(rs.next()){
						size++;
					}
					
					String ress[][]=new String[size][5];
					rs = st.executeQuery(query);
					int i=0;
					while(rs.next()){
						String SSN=rs.getString("SSN");
						String Fname=rs.getString("Fname");
						String Lname = rs.getString("Lname");
						String Sex = rs.getString("Sex");
						String Dnumber=rs.getString("Dnumber");
						
						ress[i][0]=SSN;
						ress[i][1]=Fname;
						ress[i][2]=Lname;
						ress[i][3]=Sex;
						ress[i][4]=Dnumber;
						
							i++;	
						System.out.println("Doctor's name [ "+ SSN+" ] .. His SSN [ "+Fname+" ] .. His BirthDate [ "+Dnumber+" ]");
					}
					return ress;
				}catch(Exception ex){
					System.out.println("Error :"+ ex);
				}
				break;
			case "Paitient":
				try{
					String query = "Select * from Paitient";
					rs = st.executeQuery(query);
					System.out.println("Record from Database");
					int size=0;
					while(rs.next()){
						size++;
					}
					
					String ress[][]=new String[size][5];
					rs = st.executeQuery(query);
					int i=0;
					while(rs.next()){
						String Pid=rs.getString("Pid");
						String Fname=rs.getString("Fname");
						String Lname = rs.getString("Lname");
						String Sex = rs.getString("Sex");
						String SSN=rs.getString("SSN");
						
						ress[i][0]=Pid;
						ress[i][1]=Fname;
						ress[i][2]=Lname;
						ress[i][3]=Sex;
						ress[i][4]=SSN;
						
							i++;	
						System.out.println("Doctor's name [ "+ Pid+" ] .. His SSN [ "+Fname+" ] .. His BirthDate [ "+SSN+" ]");
					}
					return ress;
				}catch(Exception ex){
					System.out.println("Error :"+ ex);
				}
				break;
			case "Appointment":
				try{
					String query = "Select * from Paitient";
					rs = st.executeQuery(query);
					System.out.println("Record from Database");
					int size=0;
					while(rs.next()){
						size++;
					}
					
					String ress[][]=new String[size][6];
					rs = st.executeQuery(query);
					int i=0;
					while(rs.next()){
						String DSSN=rs.getString("DSSN");
						String Pid=rs.getString("Pid");
						String Appno = rs.getString("Appno");
						String time = rs.getString("time");
						String date= rs.getString("date");
						String price= rs.getString("price");
						
						ress[i][0]=DSSN;
						ress[i][1]=Pid;
						ress[i][2]=Appno;
						ress[i][3]=time;
						ress[i][4]=date;
						ress[i][5]=price;
						
							i++;	
						System.out.println("Doctor's name [ "+ Pid+" ] .. His SSN [ "+DSSN+" ] .. His BirthDate [ "+price+" ]");
					}
					return ress;
				}catch(Exception ex){
					System.out.println("Error :"+ ex);
				}
			
		    	
		    	
				break;
			default:
				System.out.println("Error unknown kind");
		}
		
		String r[][]=new String[0][0];
		return r;
		
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
	public void delete(String kind,Object o){
		switch(kind){
		case "Branch":
			Branch b=(Branch)o;
			try{
				String query ="DELETE FROM `Hospital`.`Branch` WHERE Bnumber="+b.getBnumber()+" and Hid="+b.getHid()+";";
				st.executeUpdate(query);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
		case "Department":
			Department dep=(Department)o;
			try{
				String query ="DELETE FROM `Hospital`.`Department` WHERE Dnumber="+dep.getDnumber()+";";
				st.executeUpdate(query);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
		case "Doctor":
			Doctor doc=(Doctor)o;
			try{
				String query ="DELETE FROM `Hospital`.`Doctor` WHERE SSN="+doc.gerSsn()+";";
				st.executeUpdate(query);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
		case "Paitient":
			Paitient p=(Paitient)o;
			try{
				String query ="DELETE FROM `Hospital`.`Paitient` WHERE Pid="+p.getPid()+";";
				st.executeUpdate(query);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
		case "Appointment":
			Appointment a=(Appointment)o;
			try{
				String query ="DELETE FROM `Hospital`.`Appointment` WHERE DSSN="+a.getSsn()+" and Pid="+a.getPid()+" and Appno="+a.getAppno()+";";
				st.executeUpdate(query);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Error unknown kind");
	}
	}
	
	public boolean insert(String kind,Object o){
		switch(kind){
			case "Branch":
				Branch b=(Branch)o;
				try{
			 
					String query ="INSERT INTO `Hospital`.`Branch` (`Bnumber`, `Hid`, `Location`) VALUES "
									+ "('"+b.getBnumber()+"', '"+b.getHid()+"', '"+b.getLocation()+"');";
			        
					st.executeUpdate(query);
					System.out.println("Done");
			    }catch(Exception ex){
			    	 JOptionPane pane = new JOptionPane();
					   pane.setMessage(ex.getMessage());
					   JDialog dialog = pane.createDialog( "Problem");
					   dialog.show();
			    	System.out.println("Error :"+ ex);
			    	return false;
			    	
			    }
				return true;
			
			case "Department":
				Department dep=(Department)o;
				try{
					 
					String query ="INSERT INTO `Hospital`.`Department` (`Dnumber`, `Dname`, `Bnumber`, `Hid`) VALUES "
									+ "('"+dep.getDnumber()+"', '"+dep.getDname()+"', '"+dep.getBnumber()+"', '"+dep.getHid()+"');";
			        
					st.executeUpdate(query);

			    }catch(Exception ex){
			    	System.out.println("Error :"+ ex);
			    	return false;
			    	
			    }
				return true;
			
			case "Doctor":
				Doctor doc=(Doctor)o;
				try{
					 
					String query ="INSERT INTO `Hospital`.`Doctor` (`SSN`, `Fname`, `Lname`, `Sex`, `Dnumber`) VALUES "
									+ "('"+doc.gerSsn()+"', '"+doc.getFname()+"', '"+doc.getLname()+"', '"+doc.getSex()+"', '"+doc.getDnumber()+"');";
			        
					st.executeUpdate(query);

			    }catch(Exception ex){
			    	System.out.println("Error :"+ ex);
			    	return false;
			    	
			    }
				return true;
			case "Paitient":
				Paitient p=(Paitient)o;
				try{
					 
					String query ="INSERT INTO `Hospital`.`Paitient` (`Pid`, `Fname`, `Lname`, `Sex`, `SSN`) VALUES "
									+ "('"+p.getPid()+"', '"+p.getFname()+"', '"+p.getLname()+"', '"+p.getSex()+"', '"+p.gerSsn()+"');";
			        
					st.executeUpdate(query);

			    }catch(Exception ex){
			    	System.out.println("Error :"+ ex);
			    	return false;
			    	
			    }
				return true;
			case "Appointment":
				Appointment a=(Appointment)o;
				try{
					 
					String query ="INSERT INTO `Hospital`.`Appointment` (`DSSN`, `Pid`, `Appno`, `time`, `date`, `price`) VALUES "
									+ "('"+a.getSsn()+"', '"+a.getPid()+"', '"+a.getAppno()+"', '"+a.getTime()+"', '"+a.getDate()+"', '"+a.getPrice()+"');";
			        
					st.executeUpdate(query);

			    }catch(Exception ex){
			    	System.out.println("Error :"+ ex);
			    	return false;
			    	
			    }
				return true;
			default:
				System.out.println("Error unknown kind");
		}
		
		return false;
	}
	/*
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
	*/
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
	public void FillTable(JTable table, String Query)
	{
	    try
	    {
	        //CreateConnection();
	        Statement stat = con.createStatement();
	        ResultSet rs = stat.executeQuery(Query);

	        //To remove previously added rows
	        while(table.getRowCount() > 0) 
	        {
	            ((DefaultTableModel) table.getModel()).removeRow(0);
	        }
	        int columns = rs.getMetaData().getColumnCount();
	        while(rs.next())
	        {  
	            Object[] row = new Object[columns];
	            for (int i = 1; i <= columns; i++)
	            {  
	                row[i - 1] = rs.getObject(i);
	            }
	            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
	        }

	        rs.close();
	        stat.close();
	        con.close();
	    }
	    catch(Exception e)
	    {
	    }
	}
	
}