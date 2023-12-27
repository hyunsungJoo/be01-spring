package ex01.annot.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// "catsInfo" : javaConfig의 메서드 이름 
		Cats info = (Cats)ctx.getBean("catsInfo");
		info.getMyCatsInfo();
		
		// "cat1" : javaConfig의 메서드 이름 
		MyCats cats2 = (MyCats)ctx.getBean("cat1");
		info.setMyCats(cats2);
		info.getMyCatsInfo();
		
		ctx.close();
	}

}
