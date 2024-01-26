package ch04.primitive;

public class PrimitiveTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 0000000000000000000l;
		float f = 3.14f;
		double d = 3.14;
		
		System.out.printf("byte size : %d\n", Byte.SIZE);
		System.out.printf("char size : %d\n", Character.SIZE);
		System.out.printf("short size : %d\n", Short.SIZE);
		System.out.printf("int size : %d\n", Integer.SIZE);
		System.out.printf("long size : %d\n", Long.SIZE);
		System.out.printf("float size : %d\n", Float.SIZE);
		System.out.printf("double size : %d\n", Double.SIZE);
	}

}
