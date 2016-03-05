package Chapter17;

import java.util.ArrayList;
import java.util.Arrays;

interface Generator<T> { T next();}
class GeneTest implements Generator<GeneTest>{
	@Override
	public GeneTest next() {
		return new GeneTest();
	}
}
public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> a,int size){
		for(int i = 0;i < size;i++){
			add(a.next());
		}
	}
	public static <T> CollectionData<T> list(Generator<T> a,int size){
		return new CollectionData<T>(a, size);
	}
	public static void main(String args[]){
		CollectionData<GeneTest> q = list(new GeneTest(), 10);
		for(GeneTest w : q){
			System.out.println(w);
		}
	}
}
