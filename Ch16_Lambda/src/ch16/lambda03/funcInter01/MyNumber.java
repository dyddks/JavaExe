package ch16.lambda03.funcInter01;

/* 추상메서드가 1개를 초과하면 에러가 발생한다.
 * 함수형 인터페이스는 반드시 추상메서드가 1개여야만 한다.
 * */
// 함수형 람다식을 위한 인터페이스
@FunctionalInterface
public interface MyNumber {
	int getMax(int x, int y);
}
