//��ӡ100~200֮�������
#include<stdio.h>
int main(){
	int a = 100;
	for (a = 100; a <= 200; a++){//����ⷶΧ������100~200֮��
		if (a % 2 != 0){//�ж��Ƿ�������
				printf("%d\n", a);
		}
	}
	system("pause");
	return 0;
}
