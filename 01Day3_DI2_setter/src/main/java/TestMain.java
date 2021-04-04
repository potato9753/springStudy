import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DBService;
import com.service.MYService;

public class TestMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/config/*.xml");
		
		DBService service = ctx.getBean("xyz",DBService.class);
		System.out.println(service.name);

		MYService myservice = ctx.getBean("aaa", MYService.class);
		System.out.println(myservice.name+"\t"+myservice.age);
		
	}

}
