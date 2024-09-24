#include <iostream>
using namespace std;
int main(){
	int a[10][10],b[10][10],mul[10][10],r1,c1,i,j,k,r2,c2;
	cout<<"Enter the number of row for First matrix = ";
	cin>>r1;
	cout<<"Enter the number of column for First matrix = ";
	cin>>c1;
	cout<<"Enter the first matrix element=\n";
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			cin>>a[i][j];
		}
	}
	cout<<"Enter the number of row for Second matrix = ";
	cin>>r2;
	cout<<"Enter the number of column for Second matrix = ";
	cin>>c2;
	cout<<"Enter the second matrix element=\n";
	for(i=0;i<r2;i++){
		for(j=0;j<c2;j++){
			cin>>b[i][j];
		}
	}
	if(c1==r2){
 	cout<<"Multiply of matrix=\n";
 	for(i=0;i<r1;i++){
	 	for(j=0;j<c2;j++){
 	   mul[i][j]=0;
 	 }
		}
	 for(i=0;i<r1;i++){
	 	for(j=0;j<c2;j++){
 			for(k=0;k<c1;k++){
		  	mul[i][j]+=a[i][k]*b[k][j];
		  }
	 	}
	 }
}else{
	cout<<"Wrong Entry !!!!";
}
for(i = 0; i < r1; ++i)
 for(j = 0; j < c2; ++j)
 {
   cout << " " << mul[i][j];
    if(j == c2-1)
      cout << endl;
  }

	return 0;
}
