#include<iostream>
#include<string>
#include<vector>
#include<iterator>
#include<algorithm>
#include<fstream>
#include<stdio.h>
#include<stdlib.h>
using namespace std;

class pc
{
	private:
 		int id;
 		string brand;
 		string model;
 		string cpumaker;
 		string cpumodel;
 		float hz;
 		int cores;
 		int ram;
 		float price;
 		string status;
 		
 	public:
    	void setId(int id1) { id = id1; }
    	void setBrand(string brand1) { brand = brand1; }
    	void setModel(string model1) { model = model1; }
    	void setCpumaker(string cpumaker1) { cpumaker = cpumaker1; }
    	void setCpumodel(string cpumodel1) { cpumodel = cpumodel1; }
    	void setHz(float hz1) { hz = hz1; }
		void setCores(int cores1) { cores = cores1; }
		void setRam(int ram1) { ram = ram1; }
		void setPrice(float price1) { price = price1; }
		void setStatus(string status1) { status = status1; }
		
		int getId() { return id; }
    	string getBrand() { return brand; }
    	string getModel() { return model; }
    	string getCpumaker() { return cpumaker; }
    	string getCpumodel() { return cpumodel; }
    	float getHz() { return hz; }
    	int getCores() { return cores; }
    	int getRam() { return ram; }
    	float getPrice() { return price; }
    	string getStatus() { return status; }
    	
    	bool operator ==(const pc& a)
    	{ if (brand == a.brand && model == a.model && cpumaker == a.cpumaker && cpumodel == a.cpumodel && hz == a.hz && cores == a.cores && ram == a.ram && price == a.price && status == a.status)
		{ return true; } return false; }
		
		static bool compareId(const pc& a, const pc& b) { return a.id < b.id; }
		static bool comparePrice(const pc& a, const pc& b) { return a.price < b.price; }
		static bool compareCpumodel(const pc& a, const pc& b) { return a.cpumodel < b.cpumodel; }
};

void setpc(pc &a)
{
	int int1, int2, int3, int4;
 	string str1, str2, str3, str4, str5;
 	float float1, float2;
 
    cout << "Enter ID." << endl;
    cin >> int1; a.setId(int1);
    
 
    cout << "Enter brand." << endl;
    cin >> str1; a.setBrand(str1);
    
    cout << "Enter model." << endl;
    cin >> str2; a.setModel(str2);
    
    cout << "Enter CPU maker." << endl;
    cin >> str3; a.setCpumaker(str3);
    
 	cout << "Enter CPU model." << endl;
    cin >> str4; a.setCpumodel(str4);
    
    cout << "Enter CPU Hz." << endl;
    cin >> float1; a.setHz(float1);
    
    cout << "Enter CPU Cores." << endl;
    cin >> int2; a.setCores(int2);
    
    cout << "Enter RAM." << endl;
    cin >> int3; a.setRam(int3);
    
    cout << "Enter Price." << endl;
    cin >> float2; a.setPrice(float2);
    
    cout << "Enter Status(tobesold or sold)." << endl;
    cin >> str5; a.setStatus(str5);
}

void setpc1(pc &a)
{
	int int2, int3, int4;
 	string str1, str2, str3, str4, str5;
 	float float1, float2;

    cout << "Enter brand." << endl;
    cin >> str1; a.setBrand(str1);
    
    cout << "Enter model." << endl;
    cin >> str2; a.setModel(str2);
    
    cout << "Enter CPU maker." << endl;
    cin >> str3; a.setCpumaker(str3);
    
 	cout << "Enter CPU model." << endl;
    cin >> str4; a.setCpumodel(str4);
    
    cout << "Enter CPU Hz." << endl;
    cin >> float1; a.setHz(float1);
    
    cout << "Enter CPU Cores." << endl;
    cin >> int2; a.setCores(int2);
    
    cout << "Enter RAM." << endl;
    cin >> int3; a.setRam(int3);
    
    cout << "Enter Price." << endl;
    cin >> float2; a.setPrice(float2);
    
    cout << "Enter Status(tobesold or sold)." << endl;
    cin >> str5; a.setStatus(str5);
}

void savetofile(pc pc, string str)
{
    ofstream myf(str.c_str(), ios_base::app);
    myf<<pc.getId()<<" ";
    myf<<pc.getBrand()<<" ";
    myf<<pc.getModel()<<" ";
    myf<<pc.getCpumaker()<<" ";
    myf<<pc.getCpumodel()<<" ";
    myf<<pc.getHz()<<" ";
    myf<<pc.getCores()<<" ";
    myf<<pc.getRam()<<" ";
	myf<<pc.getPrice()<<" ";
	myf<<pc.getStatus()<<endl;
}


void file(pc a)
{
    int choice;
    cout << "1.Do you want to save the info to file? (1 for yes / 2 for no) " << endl;
    cin >> choice;
 
    switch (choice)
    {
        case 1: { savetofile(a, "C:\\Users\\MyPC\\Desktop\\file.txt"); break; }
 
        case 2: { break; }
    }
}

void showall(vector<pc> &a)
{
    for (size_t i = 0; i < a.size(); i++)
    {
    	cout << "The ID is: " << a[i].getId() << endl;
        cout << "The brand is: " << a[i].getBrand() << endl;
        cout << "The model is: " << a[i].getModel() << endl;
        cout << "The CPU maker is: " << a[i].getCpumaker() << endl;
        cout << "The CPU model is: " << a[i].getCpumodel() << endl;
        cout << "The Hz are: " << a[i].getHz() << endl;
        cout << "The cores are: " << a[i].getCores() << endl;
        cout << "The RAM is: " << a[i].getRam() << endl;
        cout << "The price is: " << a[i].getPrice() << endl;
        cout << "The status is: " << a[i].getStatus() << endl<<endl;
    }
}

int main(void)
{
	vector<pc>pcs; int choice, n, choice1, id1;
	
	do 
	{
 		system("CLS");
        cout<< "1.Add one new PC.\n"
            << "2.Add several new PCs.\n"
            << "3.Show all PCs.\n"
            << "4.Add new data for a PC.\n"
            << "5.Sell a PC.\n"
            << "6.Show all PCs for sale in order(ID).\n"
            << "7.Show all PCs with given CPU and RAM(from the most expensive to the cheapest).\n"
            << "8.Show all sold PCs in order(CPU model).\n"
            << "9.Exit \n";
            
            cin>>choice; pc single;
 
        switch (choice)
        {
            case 1:
            {
                setpc(single);
 
                if (find(pcs.begin(), pcs.end(), single) != pcs.end())
                { cout << "There is already a PC like this!"<<endl; }
 
                else { pcs.push_back(single); file(single); }
                break;
            }
            
            case 2:
            {
                cout << "How many PCs?"; cin >> n;
 
                while (n > 100) { cout << "How many PCs?"; cin >> n; }
 
                for (size_t i = 0; i<n; i++)
                {
                	pc single;
                	setpc(single);
 
                	if (find(pcs.begin(), pcs.end(), single) != pcs.end())
                	{ cout << "There is already a PC like this!"<<endl; }
 
                	else 
					{ 
						pcs.push_back(single); file(single);
						int choice;
    					cout << ".Do you want to stop adding? (1 for yes/ 2 for no)" << endl;
    					cin >> choice;
    					
    					 switch (choice)
    					{
        					case 1: { i=n; }
							case 2: {}
    					}
					}	
                }
                break;
            }
            
            case 3: { showall(pcs); break; }
            
            case 4:
            {
                cout << "Enter ID." << endl; cin >> id1;
 
                for (size_t i = 0; i < pcs.size(); i++)
                {
                	if (id1 == pcs[i].getId() && pcs[i].getStatus()=="tobesold")
                    {
                    	setpc1(pcs[i]);
                    }
                    else cout<<"The pc is sold!"<<endl;
            	}break;
        	}
        	
        	case 5:
            {
            	cout << "Enter ID." << endl; cin >> id1;
            	
            	for (size_t i = 0; i < pcs.size(); i++)
                {
                	if (id1 == pcs[i].getId() && pcs[i].getStatus()=="tobesold")
                    {
                    	pcs[i].setStatus("sold");
                    }
                    else cout<<"The pc is sold!"<<endl;
            	}break;
            }
            
            case 6:
            {
            	vector<pc>case6;
                for (size_t i = 0; i < pcs.size(); i++)
                {
                	if (pcs[i].getStatus()=="tobesold")
                    {
                    	
                    	case6.push_back(pcs[i]);
                    	sort(case6.begin(), case6.end(), pc::compareId);
                    }
            	}
				showall(case6); break;	
            }
            
            case 7:
            {
            	string cpumodel1;
            	int ram1;
            	vector<pc>case7;
            	
            	cout << "Enter CPU model." << endl; cin >> cpumodel1;
            	cout << "Enter RAM." << endl; cin >> ram1;
            	
            	for (size_t i = 0; i < pcs.size(); i++)
                {
                	if (cpumodel1 == pcs[i].getCpumodel() && ram1 == pcs[i].getRam())
                    {
                    	
                    	case7.push_back(pcs[i]);
                    	sort(case7.begin(), case7.end(), pc::comparePrice);
                    	reverse(case7.begin(), case7.end());
                    }
            	}
            	showall(case7); break;
			}
            
            case 8:
            {
            	vector<pc>case8;
                for (size_t i = 0; i < pcs.size(); i++)
                {
                	if (pcs[i].getStatus()=="sold")
                    {
                    	
                    	case8.push_back(pcs[i]);
                    	sort(case8.begin(), case8.end(), pc::compareCpumodel);
                    }
            	}
            	showall(case8); break;
            }
		}
        cout << "Would you like to return to the menu? 1.Yes 2.No"; cin >> choice1;
 
    } while (choice1 == 1);
 
    system("pause");
}
