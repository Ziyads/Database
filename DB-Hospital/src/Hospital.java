
public class Hospital {
	private int idHospital;
	private String Hname;
	
	public Hospital(int idHospital,String Hname){
		this.idHospital=idHospital;
		this.Hname=Hname;
	}

	public int getIdHospital() {
		return idHospital;
	}

	public String getHname() {
		return Hname;
	}
	
}
//*******************************************************************
class Branch{
	private int Bnumber;
	private int Hid;
	private String Location;
	
	public Branch(int Bnumber,int Hid,String Location){
		this.Bnumber=Bnumber;
		this.Hid=Hid;
		this.Location=Location;
	}
	public int getBnumber(){
		return Bnumber;
	}
	public int getHid(){
		return Hid;
	}
	public String getLocation(){
		return Location;
	}
}
//*******************************************************************
class Department{
	private int Dnumber;
	private String Dname;
	private int Bnumber;
	private int Hid;
	
	public Department(int Dnumber,String Dname,int Bnumber,int Hid){
		this.Dnumber=Dnumber;
		this.Dname=Dname;
		this.Bnumber=Bnumber;
		this.Hid=Hid;
	}
	public int getDnumber(){
		return Dnumber;
	}
	public String getDname(){
		return Dname;
	}
	public int getBnumber(){
		return Bnumber;
	}
	public int getHid(){
		return Hid;
	}
}
//*******************************************************************
class Doctor{
	private int ssn;
	private String Fname;
	private String Lname;
	private String sex;
	private int Dnumber;
	
	public Doctor(int ssn,String Fname,String Lname,String sex,int Dnumber){
		this.ssn=ssn;
		this.Fname=Fname;
		this.Lname=Lname;
		this.sex=sex;
		this.Dnumber=Dnumber;
	}
	public int gerSsn(){
		return ssn;
	}
	public String getFname(){
		return Fname;
	}
	public String getLname(){
		return Lname;
	}
	public String getSex(){
		return sex;
	}
	public int getDnumber(){
		return Dnumber;
	}
}
//*******************************************************************
class Paitient{
	private int Pid;
	private String Fname;
	private String Lname;
	private String sex;
	private int ssn;
	
	public Paitient(int Pid,String Fname,String Lname,String sex,int ssn){
		this.Pid=Pid;
		this.Fname=Fname;
		this.Lname=Lname;
		this.sex=sex;
		this.ssn=ssn;
	}
	public int getPid(){
		return Pid;
	}
	public String getFname(){
		return Fname;
	}
	public String getLname(){
		return Lname;
	}
	public String getSex(){
		return sex;
	}
	public int gerSsn(){
		return ssn;
	}
	
}	
//*******************************************************************
class Appointment{
	private int ssn;

	private int Pid;
	private int Appno;
	private String time;
	private String date;
	private double price;
	
	public Appointment(int ssn,int Pid,int Appno,String time,String date,double price){
		this.ssn=ssn;
		this.Pid=Pid;
		this.Appno=Appno;
		this.time=time;
		this.date=date;
		this.price=price;
	}
	public int getSsn() {
		return ssn;
	}
	public int getPid(){
		return Pid;
	}
	public int getAppno() {
		return Appno;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public double getPrice() {
		return price;
	}
	
}	

