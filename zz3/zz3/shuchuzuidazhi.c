#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int i=0;
	int	a[10] = { 0 };
	int	max = 0;
	printf("������10��������");
	for (i = 0; i < 10; i++)
		scanf("%d", &a[i]);
	for (i =0 ; i < 11; i++){
		if (a[i]>max){
			max = a[i];
		}
	}
	printf("10���������������ǣ�%d\n", max);
	system("pause");
	return 0;

}
