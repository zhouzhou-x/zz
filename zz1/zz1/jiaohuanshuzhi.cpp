#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(){
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d%d", &a, &b);
	printf("交换前a=%d b=%d\n", a, b);
	c = a;
	a = b;
	b = c;
	printf("交换后a=%d b=%d", a, b);
	system("pause");
	return 0;
}