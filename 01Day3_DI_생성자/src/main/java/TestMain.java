import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DBService;
import com.service.MyService;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("com/config/test.xml");
		
		
		DBService service = 
				ctx.getBean("xyz",DBService.class);
		System.out.println(service.name);
		
		
		MyService m = ctx.getBean("aaa",MyService.class);
		System.out.println(m.name+"\t"+m.age);
	}

}
