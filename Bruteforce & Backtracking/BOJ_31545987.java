import java.util.*;
import java.io.*;
public class _31545987 {
	static int N;
	static int[][] S;
	static boolean[] check;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args)  {
	    int[] answer = {1,2,3,4,5};
        
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int supoja1_score = 0;
        int supoja2_score = 0;
        int supoja3_score = 0;
        
        for(int i = 0; i < answer.length; i++){
            int supoja1_answer = i % 5;
            int supoja2_answer = i % 8;
            int supoja3_answer = i % 10;
            
            if(answer[i] == supoja1[supoja1_answer])
                supoja1_score++;
            if(answer[i] == supoja2[supoja2_answer])
                supoja2_score++;
            if(answer[i] == supoja3[supoja3_answer])
                supoja3_score++;
        }
        
        int max_score = supoja1_score;
        if(supoja2_score > max_score)
            max_score = supoja2_score;
        if(max_score > supoja3_score)
            max_score = supoja3_score;
        
        int[] result = new int[3];
        int idx = 0;
        if(max_score == supoja1_score)
            result[idx] = idx + 1;
        idx++;
        if(max_score == supoja2_score)
            result[idx] = idx + 1;
        idx++;
        if(max_score == supoja3_score)
            result[idx] = idx + 1;
        System.out.println(result);
	}
	
}