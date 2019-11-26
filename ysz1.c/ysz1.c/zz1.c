#include <stdio.h>
int main( ){
	int i = 0;
	int a = 100;
	for (a=100; a <= 200;a++){
		for (i = 2; i < a; i++){
			if (a%i != 0){
				continue;
			}
			else if (a%i == 0){
				break;
			}
		}
		if (i == a){
			printf("%d\n",a);
		}
	}
	system("pause");
	return 0;
}
