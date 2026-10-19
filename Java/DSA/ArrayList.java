package DSA;

public class ArrayList {
	Object[] o = new Object[10];
	int count = 0;

	public void add(Object ele) {
		if (size() == o.length)
			increase();
		o[count++] = ele;

	}

	public void increase() {
		Object[] a = new Object[o.length + 5];
		for (int i = 0; i < o.length; i++)
			a[i] = o[i];
		o = a;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		return o[index];

	}

	public void addIndex(Object ele,int index) {
			if(o.length==size()-1) increase();
			if(index<0 || index>size()) throws new IndexOutOfBoundsException();
			for(int i=size();i>index;i--)
			{
				o[i]=o[i-1];
				
			}
			o[index]=ele;
			count++;
		}

	public void remove(int index) {
			if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
			for(int i=index;i<size()-1;i++)
			{
				o[i]=o[i+1];
				count--;
			}
		}


}
