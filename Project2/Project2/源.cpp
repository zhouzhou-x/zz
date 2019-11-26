//打印100~200之间的素数
#include<stdio.h>
int main(){
	int a = 100;
	for (a = 100; a <= 200; a++){//将检测范围设置在100~200之间
		if (a % 2 != 0){//判断是否是素数
				printf("%d\n", a);
		}
	}
	system("pause");
	return 0;
}
