package individual_practice;

public class MyLoop_4 {
	public static void main(String[] args) {
		
		int lineCount = 4;
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {	// 라인카운트가4니까 0~3까지 총 4열.
			for(int j = 0; j < spaceCount; j++) {	// 라인카운트 4/2 +1 = 3열 까지.
				System.out.print('!');	// 공백을 넣어라. 구분하기 위해 !로 대체
			}
			for(int j = 0; j < starCount; j++) {	// 애스터리스크를 1개만 삽입
				System.out.print('*');
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print('!');
			}
			spaceCount -= 1;	// 애스터 리스크 기준 앞 뒤로 공백을 하나씩 지워가며 배치
			starCount +=2;
			System.out.println();
		}
		
		System.out.println("=====================");
		
		int lineCnt = 7;
		int spaceCnt = lineCnt/2 +1;
		
		for(int i = 0; i < lineCnt; i++) {
			for(int j = 0; j < spaceCnt; j++) {
				System.out.print('!');
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < spaceCnt; j++) {
				System.out.print('!');
			}
			if(i < lineCnt/2) {
				spaceCnt -= 1;
				starCount += 2;
			} else {
				spaceCnt += 1;
				starCount -= 2;
			}
			System.out.println();
		}
	}
}
