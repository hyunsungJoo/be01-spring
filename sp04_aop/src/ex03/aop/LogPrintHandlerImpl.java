package ex03.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("MethodInterceptor interface invoke method start~~~~");

		// ���� ����
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start(); // �ð����� ����
		log.info("Ÿ�̸� ����");

		//////////// main ���� ���� ////////////////////
		Object result = invocation.proceed();
		////////////////////////////////////////////////

		sw.stop();  // �ð����� ��
		log.info("Ÿ�̸� ����");
		
		log.info("[TimerLOG] Memthod : " + invocation.getMethod() );  // ������ �޼ҵ� ��Ī
		log.info("[TimerLOG} proecess Time : "+ sw.getTotalTimeMillis()); // �۾��� �ɸ� �ð�
		
		return result; 
	}
}
