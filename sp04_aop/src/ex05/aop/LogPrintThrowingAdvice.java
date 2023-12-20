package ex05.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class LogPrintThrowingAdvice implements ThrowsAdvice { // �߻�޼��� �Ȱ��������� ������־����
	
	public void afterThrowing(IllegalArgumentException e) {
		Log log = LogFactory.getLog(this.getClass());
		log.info("[afterThrowing ���� �߻�] : " + e.getMessage());
	}
}
