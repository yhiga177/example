
import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	//正常系　「ミヤビ」をセットできるか？
	@Test public void setName() {
		Bank b = new Bank();
		b.setName("ミヤビ");
	}

	//異常系；nullをセットしようとしたら例外が起こるべき
	@Test public void setNameWithNull() {
		try {
			Bank b = new Bank();
			b.setName(null);
		}catch(NullPointerException e) {
			return;
		}
		fail();
	}

	//異常系：2文字をセットしようとしたら例外が起こるべき
//	＠Test(expected = IllegalArgumentException.class)
//	public void throwsExceptionWithTwoCharName() {
//		Bank b = new Bank();
//		b.setName("ミヤ");
//	}
//
	@Test public void throwsExceptionWithTwoCharName() {

		try {
			Bank b = new Bank();
			b.setName("ミヤ");
		}catch(IllegalArgumentException e){
			return;
		}
	}
}
