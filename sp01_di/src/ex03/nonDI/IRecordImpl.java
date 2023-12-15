package ex03.nonDI;

import lombok.Data;


//@Setter
//@Getter
//@NoArgsConstructor  // 멤버변수 없는 디폴트 생성자 함수
//@AllArgsConstructor // 모든멤버변수를 갖고있는 생성자함수
@Data // getter / setter / toString
public class IRecordImpl implements IRecord {
	
	private int kor, eng, com;
	
	@Override
	public int total() {
		return this.kor + this.com + this.eng;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}
	
//	public int getKor() {
//	return kor;
//}
//
//public void setKor(int kor) {
//	this.kor = kor;
//}
//
//public int getEng() {
//	return eng;
//}
//
//public void setEng(int eng) {
//	this.eng = eng;
//}
//
//public int getCom() {
//	return com;
//}
//
//public void setCom(int com) {
//	this.com = com;
//}
//
//
//public IRecordImpl() {
//	this(0, 0, 0);
//}
//
//public IRecordImpl(int kor, int eng, int com) {
//	super();
//	this.kor = kor;
//	this.eng = eng;
//	this.com = com;
//}
//

}
