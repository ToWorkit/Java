package demo02;

public class array01 {
	public static void main(String[] args) {
		int[] _list = {2, 3, 1, 5, 0};
		for(int i = 0, j = _list.length - i; i < _list.length; i++, j--) {
			int temp = _list[i];
			_list[i] = _list[j];
			_list[j] = temp;
		}
		for (int item: _list) {
			System.out.println(item);
		}
	}
}
