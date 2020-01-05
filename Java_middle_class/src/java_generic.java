
public class java_generic {

	public static void main(String[] args) {
		
		
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//
//		box.setObj("Hello");
//		String str = (String)box.getObj();
//		
//		box.setObj(1);
//		int value = (Integer)box.getObj();
		
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(1);
		int value = box3.getObj();
		System.out.println(value);
	}

}


class Box<E>{
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	public E getObj() {
		return obj;
	}
	
}
