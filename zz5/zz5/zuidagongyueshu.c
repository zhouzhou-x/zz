#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	int a = 0;
	int b = 0;
	int c = 1;
	printf("请输入2个数：");
	scanf("%d%d",&a, &b);
	int z = 0;
	while (c != 0){
		c = a%b;
		if (c == 0)
		{
			printf("最大公约数为%d\n", b);
		}
		else
		{
			a = b;
			b = c;
		}
	}
	system("pause");
	return(0);
}
