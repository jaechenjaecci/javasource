package ClassText;

public class MyMath {
//멤버변수-long 타입 뱐수 2개 선언
//메소드: add,subtract,multiply,divide	
//입력 값은 없고, 출력값 연산결과
	
long a,b;

long add() {
	return a+b;
}
long subtrack() {
	return a-b;
}
long multiply() {
	return a*b;
}
double divide() {
	return a/b;
}
	

static long add(long a, long b) {
// static을 지정해놓으면 같은 static 변수만 쓸 수 있기 때문에 
// 맨 위에 있는 long a,b를 사용할 수 없음
// 그래서 반드시 가로안에 받아줘야 함, 위에 있는 a,b랑 다른 변수임
// 메소드 안에서만 사용할 수 있는 변수를 지역변수라고 함
	
	return a+b;
}
static long subtrack(long a, long b) {
	return a-b;
}
static long multiply(long a, long b) {
	return a*b;
}
static double divide(double a, long b) {
	return a/b;
}
		
	
	
	
}
