#include <iostream>
using namespace std;

int main(int argc, char**argv[]){
	char v[4] = {'c','a','s','a'};
	for (int i=0; i<4; i++){
		cout<<v[3-i];
	}
}