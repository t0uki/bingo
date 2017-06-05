package state;

import java.util.ArrayList;

public class Already {
	ArrayList<Integer> list = new ArrayList<Integer>();
	boolean flg;

	// 既出の数字か判断する
	public boolean already(int num) {
		// 空の場合
		if (list.isEmpty()) {
			list.add(new Integer(num));
			flg = false;
		} else if (list.contains(num)) {
			// 既出
			flg = true;
		} else {
			// 未出
			flg = false;
			list.add(new Integer(num));
		}
		return flg;
	}
}
