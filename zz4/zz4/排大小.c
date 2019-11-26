#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int a, b, c;
	scanf("%d%d%d", &a, &b, &c);
	int min;
	if (a > b){
		min = a;
		a = b;
		b = min;
	}
	if (a > c){
		min = a;
		a = c;
		c = min;
	}
	if (b > c){
		min = b;
		b = c;
		c = min;
	}
	printf("3个数从小到大的顺序是：%d %d %d",a,b,c);
	system("pause");
	return 0;

}
