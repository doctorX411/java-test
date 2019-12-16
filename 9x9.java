import java.util.*;
// 输出九九乘法表
public class michiko {
    public static void main(String[] args){
        for(int m = 1; m < 10 ; m++){
            for(int n = 1; n <= m; n++){
                int sum = m * n;
        	System.out.print(m + "x" + n + "=" + sum);
        	if(n < m ){
        	System.out.print(',');
        	}
            }
            System.out.println();
	}        
    }
}
