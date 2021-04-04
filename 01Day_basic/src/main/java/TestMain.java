import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DBService;

public class TestMain {

	public static void main(String[] args) {

		// 1. 이전 방식
		//DBService service = new DBService();

		// 2. Spring 방식
		// 스프링 환경에서 작성한 클래흐 : 빈(bean)
		// xml에 빈을 등록해서 사용한다.

		// test.xml파일을 IoC Container에 설정
		// IoC Container의 실제 API ApplicationContext
		
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("com/config/test.xml");
		
		//Bean 얻기
		DBService service2 = ctx.getBean("xyz", DBService.class);
		
		System.out.println(service2.getInfo());
	}

}
