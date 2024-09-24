#include <iostream>
using namespace std;
int main(){
	int row1,col1,row2,col2,m1[10][10],m2[10][10],sum[10][10];
	cout<<"Enter the number of rows for First matrix(should be >1 and <10):\n";
	cin>>row1;
	cout<<"Enter the number of column for First matrix(should be >1 and <10):\n";
	cin>>col1;
	cout<<"Enter tne elements of first 1st matrix:\n";
	for(int i=0;i<row1;i++){
		for(int j=0;j<col1;j++){
			cin>>m1[i][j];
		}
	}
	cout<<"Enter the number of rows for Second matrix(should be >1 and <10):\n";
	cin>>row2;
	cout<<"Enter the number of column for Second matrix(should be >1 and <10):\n";
	cin>>col2;
	cout<<"Enter tne elements of second 2nd matrix:\n";
	for(int i=0;i<row2;i++){
		for(int j=0;j<col2;j++){
			cin>>m2[i][j];
		}
	}
	if(row1==row2 && col1==col2){
	    cout<<"output: \n";
	    for(int i=0;i<row1;i++){
		    for(int j=0;j<col1;j++){
			    sum[i][j]=m1[i][j]+m2[i][j];
			    cout<<sum[i][j]<<" ";
		    }cout<<endl;
	    }
}else{
	cout<<"Wrong Entry !!!!";
}
	return 0;
}
