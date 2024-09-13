package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUsersss {

	public static void main(String args) throws Exception {

		//testadd();
		testUpdate();

	}

	public static void testadd() throws Exception {

		UserBeann bean = new UserBeann();

		bean.setId(1);
		bean.setFirstName("vikas");
		bean.setLastName("rathore");
		bean.setLoginId("vikas@gmail.com");
		bean.setPassword("7483");
		bean.setDob(new Date());
		bean.setAddress("15/9 pardesipura, Indore, (M.P.)");

		UserModell model = new UserModell();

		model.add(bean);
	}
	
	public static void testUpdate()throws Exception{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		UserBeann bean=new UserBeann();
		
		bean.setFirstName("vikas");
		bean.setLastName("rathore");
		bean.setLoginId("vikas@gmail.com");
		bean.setDob(sdf.parse("01/10/2012"));
		bean.setId(13);
		
		UserModell model=new UserModell();
		
		model.update(bean);
	}
	
	

}
