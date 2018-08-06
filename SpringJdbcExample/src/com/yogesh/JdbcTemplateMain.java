package com.yogesh;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.roomTypeChangeDemo.SpecialReqDao;
import com.yogesh.roomTypeChangeDemo.SpecialRequestDto;

public class JdbcTemplateMain {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/yogesh/SpringConfig.xml");
		
		/* Resource resource=new ClassPathResource("com/yogesh/SpringConfig.xml");  
		    BeanFactory context=new XmlBeanFactory(resource);
		*/
	//	PersonService service=(PersonService) context.getBean("personService");
	//	DatabaseUtil util= (DatabaseUtil) context.getBean("databaseUtil");
		/*util.createTable();
		PersonDTO person= (PersonDTO) context.getBean("personDTO");
		person.setName("Nik");
		person.setEmail("abc@gmail.com");
		service.addPerson(person);
		System.out.println("inserted first person");
		
		person.setName("yogesh");
		person.setEmail("asd@gmail.com");
		service.addPerson(person);
		System.out.println("inserted second person");*/
		
	//	System.out.println("Displaying persons");
	//	List<PersonDTO> personList = service.getAllPerson();
		
	//	Iterator itr= personList.iterator();
	//	while(itr.hasNext())
	//	{
	//		PersonDTO prs=(PersonDTO) itr.next();
	//		System.out.println("Name: "+prs.getName()/*+ " Email: "+prs.getEmail()*/+"\n");
	//	}
		
		SpecialReqDao specialReqDao=(SpecialReqDao) context.getBean("specialReqDao");
		
		List<SpecialRequestDto> list= specialReqDao.getDtoList();
		System.out.println(list);
		

	}

}
