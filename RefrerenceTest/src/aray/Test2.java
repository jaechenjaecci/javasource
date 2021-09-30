package aray;

public class Test2 {

	public static void main(String[] args) {
		// 배열은 적절한 크기를 지정하는게 중요, 나중에 추가 공간을 설정할 수 없음 
		// => 다시 공간을 설정해야함(자주일어나는게 프로그램에 좋지않음)
		
		int oldArr[] = {10,20,30}; //3개 사용중에 하나 더 필요한 상태
		int newArr[] = new int[4];
		//기존 값 새로운 곳으로 복사
//		for(int i=0; i<oldArr.length;i++) {
//			newArr[i]=oldArr[i]; //기존값 복사
//		}
		
	System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);	

	//자바가 만들어주는 방식		
// (복사할 것,원소스에 어디부터 복사할 지 위치지정,이동할 곳,이동할 곳 중 어디에 옮길지,몇개를 옮길지)   		
		
		
		newArr[3] = 40;
		for(int i : newArr) {
			System.out.print(i+" ");
		}
	}

}
