package ClassText;

public class Earth {
static final double EARTH_RADIUS = 6400;
static final double EARTH_RADIUS_AREA;
//final 수정이 안되니 대문자로 선언함
//static final이 붙으면 공통으로 사용하는 상수개념이 되는것 


static {
	EARTH_RADIUS_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
//static은 수정이 가능하기 때문에 static을 붙여서 초기화를 진행함
//Math.PI : 대문자로 시작했으니까 클래스(참조타입)	
}



}
