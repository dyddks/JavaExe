package ch10.collection01.ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch10.collection01.ch15.sec02.exam01.Board;

/* ArrayList와 동일하다
 * 
 * 다만 멀티스레드 환경에서 2개이상의 스레드가 동시접근할 때 안전하다.
 * 1개 스레드일 때는 ArrayList보다 약간 성능 저하가 있다.(동기화 처리때문)
 * 
 * */
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();

		Thread threadA = new Thread() {
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
//		List<Board> list = new Vector<>();
//
//		Thread threadA = new Thread() {
//			public void run() {
//				for(int i=1; i<=1000; i++) {
//					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
//				}
//			}
//		};
//		
//		Thread threadB = new Thread() {
//			public void run() {
//				for(int i=1001; i<=2000; i++) {
//					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
//				}
//			}
//		};
//		
//		threadA.start();
//		threadB.start();
//		
//		try {
//			threadA.join();
//			threadB.join();
//		}catch(Exception e) {
//		}
//		
//		int size = list.size();
//		System.out.println("총 객체 수: " + size);
//		System.out.println();
	}

}
