#include<iostream>
#include<string>
using namespace std;
string InsertStringAt(string tostring, string strtoinsert, int atindex){
	if(atindex<0)
	return strtoinsert + tostring;
	else if(atindex<=tostring.size())
	return tostring.insert(atindex,strtoinsert);
	return tostring + strtoinsert;
}
string RemoveCharacterAt(string fromstring, int fromindex, int charcount){
	if(fromindex<0 || fromindex>fromstring.size()){
	cout<<"INDEX CANNOT BE NEGATIVE!!";
	return NULL;
    }
    return fromstring.erase(fromindex, charcount);
}
int main(){
	string os,ss,ans;
	int i,j;
	cout<<"ORIGINAL STRING."<<endl;
	getline(cin,os);
	cout<<"Sub string to insert."<<endl;
	getline(cin,ss);
	cout<<"At position."<<endl;
	cin>>i;
	ans=InsertStringAt(os,ss,i);
	cout<<"After inserting sub-string "<<ans<<endl;
	cout<<"Enter the number of character to remove from string."<<endl;
	cin>>j;
	cout<<"Index from where to remove character."<<endl;
	cin>>i;
	cout<<"After removing character "<<RemoveCharacterAt(ans,i,j);
	return 0;
}
