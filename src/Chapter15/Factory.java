package Chapter15;

interface InterFactory<T>{
	T create();
}

//��ʽ�Ĺ���ģʽ

public class Factory implements InterFactory<Integer>{
	@Override
	public Integer create() {
		// TODO Auto-generated method stub
		return new Integer(0);
	}
	public static void main(String args[]){
		new actory().Foo2(new Factory());
	}
}
class actory<T>{
	private T x;
	public <F extends InterFactory<T>> T Foo2(F fa){
		x = fa.create();
		return x;
	}
}
	