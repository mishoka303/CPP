#include<iostream>
#include<string>
#include<list>
#include<iterator>
#include<fstream>
#include<stdlib.h>
#include<bits/stdc++.h>
#include<stdio.h>
#include<vector>
#include<map>
using namespace std;

class PostImpl
{
	private:
		
		int iNum; string strId; string strPostProvider; string strMessage;
	
	public:
		
		PostImpl() {};
		
		PostImpl(int a, string b, string c, string d)
		{ iNum=a; strId=b; strPostProvider=c; strMessage=d; }
		
		PostImpl(string str)
		{
			vector <string> tokens; stringstream check1(str); string intermediate;
      
    		if(getline(check1, intermediate, '-')) tokens.push_back(intermediate); 
    		if(getline(check1, intermediate, '@')) tokens.push_back(intermediate);
    		if(getline(check1, intermediate, ':')) tokens.push_back(intermediate); 
      		
      		string delimiter = ":="; size_t pos = 0; std::string token;
			
			while ((pos = str.find(delimiter)) != std::string::npos)
			{
    			token = str.substr(0, pos);
    			str.erase(0, pos + delimiter.length());
			}
			
			tokens.push_back(str);
    
    		iNum = atoi(tokens[0].c_str()); strId=tokens[1]; strPostProvider=tokens[2]; strMessage=tokens[3];   	
		}
		
		void print() { cout<<iNum<<"-"<<strId<<"@"<<strPostProvider<<":="<<strMessage<<endl; }
		
		int get_num() { return iNum; }
		string get_id() { return strId; }
		string get_post() { return strPostProvider; }
		string get_mess() { return strMessage; }

		int set_num(int a) { iNum=a; }
		string set_id(string b) { strId=b; }
		string set_post(string c) { strPostProvider=c; }
		string set_mess(string d) { strMessage=d; }
		
		void set(string a, string b, string c, string d)
		{ iNum = atoi(a.c_str()); strId=b; strPostProvider=c; strMessage=d; }
		
		friend istream &operator >> (istream &input, PostImpl& a)
		{ input>>a.iNum>>a.strId>>a.strPostProvider>>a.strMessage; return input; }
		
		friend ostream &operator << (ostream &output, const PostImpl& a)
		{
			output<<"Name: "<<a.iNum<<endl<<"Id: "<<a.strId<<endl<<"PostProvider: "<<a.strPostProvider<<endl<<"Message: "<<a.strMessage<<endl<<endl; return output;
		}
		
		bool operator == (const PostImpl& a) { if (iNum == a.iNum) return true; }
		bool operator >(const PostImpl& a) { if(iNum > a.iNum) return true; else return false; }
		bool operator <(const PostImpl& a) { if(iNum < a.iNum) return true; else return false; }
		
		friend class PostBox;
};

class PostBox: public PostImpl
{
	private: list < PostImpl*>l;
	
	public:
		
		PostBox(const string& file)
		{
			ifstream myfile(file.c_str()); string line;
	
				if (myfile.is_open())
				{
					while (getline(myfile, line)) { PostImpl *a=new PostImpl(line); l.push_back(a); }
					myfile.close();
				}
	
				else { cout << "Problem, check name or file destination!" << endl; system("pause"); }
		}
		
		PostBox(const PostBox& a) { l=a.l; }
		
		void Output(ostream& toStream)
		{ 
			for (list<PostImpl*>::iterator i = l.begin(); i != l.end(); i++) toStream<<(*i)->get_num()<<"-"<<(*i)->get_id()<<"@"<<(*i)->get_post()<<":="<<(*i)->get_mess()<<endl;
		}
		
		void print()
		{
			for (list<PostImpl*>::iterator i = l.begin(); i != l.end(); i++) cout<<(*i)->get_num()<<"-"<<(*i)->get_id()<<"@"<<(*i)->get_post()<<":="<<(*i)->get_mess()<<endl;
		}
		
		struct a{ bool operator ()(const PostImpl * a1,  const PostImpl * a2) {return a1->iNum < a2->iNum;} };
		struct b{ bool operator ()(const PostImpl * b1, const PostImpl * b2) {return b1->strId < b2->strId;} };
		struct c{ bool operator ()(const PostImpl * c1, const PostImpl * c2) {return c1->strPostProvider < c2->strPostProvider;} };
		struct d{ bool operator ()(const PostImpl * d1, const PostImpl * d2) {return d1->strMessage < d2->strMessage;} };

		void sortnum() { l.sort(a()); cout<<endl; }
		void sortid() { l.sort(b()); cout<<endl; }
		void sortpost() { l.sort(c()); cout<<endl; }
		void sortmess() { l.sort(d()); cout<<endl; }
		
		void map()
		{
			vector<string>v;
			for(list<PostImpl*>::iterator i = l.begin(); i != l.end(); i++) { v.push_back((*i)->get_post()); }
			
			cout<<endl; std::map<string,int> stringMap;

			for (vector<string>::iterator i = v.begin(); i != v.end(); i++)
			{
			    if(stringMap.find(*i)!=stringMap.end()) { stringMap[*i]++; }
			    else { stringMap[*i]=1; }
			}
			
			for (std::map<string,int>::const_iterator itr = stringMap.begin();  itr!=stringMap.end(); ++itr)
			{
			    if(itr->second > 1) cout<<itr->first << " with "<<itr->second<<" users"<<endl;
			    else cout<<itr->first << " with "<<itr->second<<" users"<<endl;
			}
		}
		
		friend ostream &operator << (ostream &output, const PostBox& a)
		{
			list<PostImpl*>l1; l1=a.l;
			for (list<PostImpl*>::iterator i = l1.begin(); i != l1.end(); i++) output<<(*i)->get_num()<<"-"<<(*i)->get_id()<<"@"<<(*i)->get_post()<<":="<<(*i)->get_mess()<<endl;
			return output;
		}
		
		friend istream &operator >> (istream &input, PostBox& a)
		{
			list<PostImpl*>l1; int a1; cout<<"How many elements you want to add?: "; cin>>a1; l1.resize(a1);
			int iNum1; string strId1; string strPostProvider1; string strMessage1;
			
			for(list<PostImpl*>::iterator i = l1.begin(); i != l1.end(); i++)
			{
				cout<<"Enter number: "; input>>iNum1; cout<<"Enter Id: "; input>>strId1;
				cout<<"Enter PostProvider: "; input>>strPostProvider1; cout<<"Enter Message: "; input>>strMessage1;
				(*i)=new PostImpl(iNum1, strId1, strPostProvider1, strMessage1);
				a.l.push_back(*i); cout<<endl;
			}
			
			return input;
		}

};

int main(void)
{
 	PostBox a("alita.txt");
 	a.print();
 	a.sortpost();
 	a.print();
 	a.map();
}
