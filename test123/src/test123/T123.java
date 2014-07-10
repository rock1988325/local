package test123;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class T123 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance() ;
		
		
		System.out.println(date.getTime().getYear()+1900+" "+(date.getTime().getMonth()+1)+" "+date.getTime().getDate());
		String a="7 89　異常單號:AB07J00587　短異卸單號:DI06Q002";
		String c="789";
		String s[]={"退關","退倉"};
		String []b=a.split("　");
		String [][]tmp;
		List<String[]> sl=new ArrayList<String[]>();
		sl.size();
		System.out.println(s[0]);
System.out.println(b[0]+"/"+"ZZZ");
	}

}
