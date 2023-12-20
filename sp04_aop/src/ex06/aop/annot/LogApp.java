package ex06.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp { // Advice class - around ����
	
	
 @Pointcut("execution(public void get*(..))")
// @Pointcut("execution(public void get*(..))") // public void�� ��� get�޼ҵ�
// @Pointcut("execution(* ex06.aop.annot.*.*())") // kr.edu.kosa ��Ű���� �Ķ���Ͱ� ����
// ��� �޼ҵ�
// @Pointcut("execution(* kr.edu.kosa..*.*())") // kr.edu.kosa ��Ű�� &
// kr.edu.kosta ���� ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
// @Pointcut("execution(* kr.edu.kosta.Worker.*())") // kr.edu.kosta.Worker ����
// ��� �޼ҵ�
// @Pointcut("within(ex06.aop.annot.*)") //kr.edu.kosa ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
// @Pointcut("within(ex06.aop.annot..*)") //kr.edu.kosa ��Ű�� �� ���� ��Ű�� �ȿ� �ִ� ���
// �޼ҵ�
// @Pointcut("within(ex06.aop.annot.Worker)") //kr.edu.kosa.Worker ��� �޼ҵ�
// @Pointcut("bean(student)") //student �󿡸� ����
// @Pointcut("bean(*ker)") //~ker�� ������ �󿡸� ����
// @Pointcut("!bean(student)") // student ���� �����ѰͿ� ����
	public void pointCutMethod() {} // pointcut ������̼��� �־��� �޼ҵ尡 �ϳ� �־����(�ٸ� ����)
	
	@Around("pointCutMethod()")
	public Object loggerApp(ProceedingJoinPoint point) throws Throwable {
		
		String signatureStr = point.getSignature().toLongString();
		System.out.println(signatureStr + " is Start..........");
		System.out.println("around advice!!!");
		long st = System.currentTimeMillis();
		
		Object obj = point.proceed(); // �� ���� ���� �Լ�
		
		long end = System.currentTimeMillis();
		System.out.println(signatureStr + " is Finished");
		System.out.println(signatureStr + "��� �ð� : " + ( end - st ));
		
		return obj;
	}
	
	@Before("pointCutMethod()")
	public void beforeAdvice() {
		System.out.println("beforeAdvice");
		System.out.println("���а� �Ի縦 ������");
	}
	
	@After("pointCutMethod()")
	public void afterAdvice() {
		System.out.println("afterAdvice");
	}
}
