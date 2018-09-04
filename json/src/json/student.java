package json;
import org.json.simple.*;
import java.util.*;

public class student {
String name;
int rollno;
int marks;

student(String name,int rollno,int marks){
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;
}

public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
/*student obj=new student(sc.nextLine(),sc.nextInt(),sc.nextInt());
System.out.println(obj.name);
System.out.println(obj.rollno);
System.out.println(obj.marks);*/

	JSONObject ob=new JSONObject();
	ob.put("name",sc.nextLine());
	ob.put("rollno",sc.nextInt());
	ob.put("marks",sc.nextInt());
	System.out.println(ob);
	
	/*JSONArray al=new JSONArray();
	al.add(sc.nextLine());
	al.add(sc.nextInt());
	al.add(sc.nextInt());
	System.out.println(al);*/
	
	/*Object obj1=JSONValue.parse(ob);
	JSONObject jsonObject=(JSONObject) obj1;
	String name1=(String)jsonObject.get("name");
	int rollno1=(Integer)jsonObject.get("rollno");
	int marks1=(Integer)jsonObject.get("marks");
	System.out.println(name1+""+rollno1+""+marks1+"");*/

}
}
