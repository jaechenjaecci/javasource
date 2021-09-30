import java.util.Scanner;
public abstract class Converter {
	
abstract protected double convert(double src);

//생성자
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;

//메소드
public void run() {
	Scanner scanner = new Scanner(System.in);
	System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다.");
	System.out.print(getSrcString()+"을 입력하세요>>");
	
	double val = scanner.nextDouble();
	double res = convert(val);
	//val은 키보드로 입력받은 값, res는 입력받은 값을 변환한 값
	
	System.out.println("변환 결과 : "+res+getDestString()+"입니다.");
	scanner.close();
}

}
