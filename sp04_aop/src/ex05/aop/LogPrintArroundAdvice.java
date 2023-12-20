package ex05.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintArroundAdvice implements MethodInterceptor { // ���� ���� ���

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Around Servoce invoke() start..........");
		
		// ���� ����
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("Ÿ�̸� ����");
		
		/// �ְ��� �ڵ� ///////////////
		Object result = invocation.proceed(); // �ְ��ɻ��� �Լ� ȣ��
			
		///////////////////////////
		
		// ���� ����
		sw.stop();
		log.info("Ÿ�̸� ����");
		
		log.info("[TimerLOG] Method : " + invocation.getMethod()); // ������ �޼ҵ� ��Ī
		System.out.println("[TimerLOG] args : " + Arrays.toString(invocation.getArguments()));
		log.info("[TimerLog] process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
