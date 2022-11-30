package com.mabb.backjoon.controllEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back11660 {
	public static void main(String[] args) throws Exception {
		/* 문제 설명
		 * N*N에서 (x1,y1) 부터 (x2,y2)까지 합을 구하는 프로그램.
		 * x1행에서x2행 y1열에서 y2열 사이의 수를 모두 더한다.
		 */
		
		/* N개의 구간합 배열을 만들고
		 * x값으로 배열을 선택하고 y값으로 인덱스 범위를 선택한다.
		 * 시간복잡도: N은 1024, M은 10만, N^2은 가능하다. 제한시간1초.
		 *슈도코드
		 *N과 M을 입력받는다.
		 *1번째부터 N번째까지 길이 N인 배열을 입력받으며 구간합배열을 만든다.
		 *주어진 x1,y1,x2,y2값으로 배열을 선택하고 구간합 합계를 출력한다.
		 */
		
		//N과 M을 입력받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//2차원배열을 선언한다.
		int[][] A = new int[N+1][N+1];
		int[][] S = new int[N+1][N+1];
		int[][] S2 = new int[N+1][N+1];
		
		//값을 저장하면서 행기준으로 합배열을 만든다.
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
					S[i][j] = S[i][j-1] + A[i][j];
			}
		}
		
		//만든 합배열을 열 기준으로 합배열을 만들면 0,0에서 x,y범위의 합 배열이 된다.
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
					S2[j][i] = S2[j-1][i] + S[j][i];
			}
		}
		
		
		//x1,x2,y1,y2값을 받는다. index로 사용하기위해 -1한다.
		int[] sumArr = new int[N];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 =Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			//x로 합배열을 선택하고 y로 합할 인덱스 범위를 선택하여
			//결과값을 합친 후 출력한다. 여기 중첩for문 때문에 시간초과나는듯.
			//n*m = 1024*100000 -> 1억번의 연산 초과,
			//이를 512*100000 + 512*100000 으로 바꾼다면 시간 복잡고 조건을 맞출 수 있을까.실패
		
			int result=0;
			result = S2[x2][y2] - (S2[x1-1][y2] + S2[x2][y1-1]) + S2[x1-1][y1-1];
			System.out.println(result);
		}
	}
}
