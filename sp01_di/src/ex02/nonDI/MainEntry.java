package ex02.nonDI;

public class MainEntry {
	
	// 객체의 생성이 서로 독립적
	// 필요시 객체의 주소만 주입
	public static void main(String[] args) {
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord(10, 20, 30, 40);
		
		view.setRecord(record);
		view.print();
	}
}

// is-a        ,      has-a
// 상속				  포함관계 
// has-a 관계를 통해서 객체 다루기