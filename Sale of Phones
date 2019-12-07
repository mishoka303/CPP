#include<iostream>
#include<string>
#include<vector>
#include<iterator>
#include<algorithm>
#include<fstream>
#include<stdio.h> 
#include<stdlib.h> 
using namespace std;

class phone
{
private:

	string brand;
	string model;
	string color;
	float price;
	int memory;
	int diagonal;
	bool sim;
	int year;

public:

	void set_brand(string a) { brand = a; }
	void set_model(string a) { model = a; }
	void set_color(string a) { color = a; }
	void set_price(float a) { price = a; }
	void set_memory(int a) { memory = a; }
	void set_diagonal(int a) { diagonal = a; }
	void set_sim(bool a) { sim = a; }
	void set_year(int a) { year = a; }

	string get_brand() { return brand; }
	string get_model() { return model; }
	string get_color() { return color; }
	float get_price() { return price; }
	int get_memory() { return memory; }
	int get_diagonal() { return diagonal; }
	bool get_sim() { return sim; }
	int get_year() { return year; }

	static bool str(const phone& c1, const phone& c2) { return c1.brand < c2.brand; }
	static bool str1(const phone& c1, const phone& c2) { return c1.brand < c2.brand && c1.year < c2.year; }
	static bool str2(const phone& c1, const phone& c2) { return c1.brand < c2.brand && c1.model < c2.model && c1.diagonal < c2.diagonal; }

	bool operator ==(const phone& d) 
	{ 
		if (brand == d.brand && model == d.model) 
		{ return true; } return false;
	}
};

void stf(phone s, string smh)
{
	ofstream myfile(smh.c_str(), ios_base::app);
	myfile<<s.get_brand();
	myfile<<s.get_model();
	myfile<<s.get_color();
	myfile<<s.get_price();
	myfile<<s.get_memory();
	myfile<<s.get_diagonal();
	myfile<<s.get_sim();
	myfile<<s.get_year()<<endl;
}

void sm(int choice1, phone a11, int rpt1) 
{
	int choice11;
	cout << "1.Do you want to save the info to file? " << endl;
	cin >> choice11;

	switch (choice11)
	{
		case 1: { stf(a11, "C:\\Users\\MyPC\\Desktop\\file.txt"); break; }

		case 2: { rpt1 = 1; break; }
	}
}

void ss(phone &a12)
{
	int memory1, diagonal1, year1;
	float price1; bool sim1;
	string brand1, model1, color1;

	cout << "Enter brand." << endl;
	cin >> brand1;
	a12.set_brand(brand1);

	cout << "Enter model." << endl;
	cin >> model1;
	a12.set_model(model1);

	cout << "Enter color." << endl;
	cin >> color1;
	a12.set_color(color1);

	cout << "Enter price." << endl;
	cin >> price1;
	a12.set_price(price1);

	cout << "Enter memory." << endl;
	cin >> memory1;
	a12.set_memory(memory1);

	cout << "Enter diagonal." << endl;
	cin >> diagonal1;
	a12.set_diagonal(diagonal1);

	cout << "Enter sim." << endl;
	cin >> sim1;
	a12.set_sim(sim1);

	cout << "Enter year." << endl;
	cin >> year1;
	a12.set_year(year1);
}

void sp(vector<phone> &a13)
{
	for (size_t i = 0; i < a13.size(); i++)
	{
		cout << "The brand is: " << a13[i].get_brand() << endl;
		cout << "The model is: " << a13[i].get_model() << endl;
		cout << "The color is: " << a13[i].get_color() << endl;
		cout << "The price is: " << a13[i].get_price() << endl;
		cout << "The memory is: " << a13[i].get_memory() << endl;
		cout << "The diagonal is: " << a13[i].get_diagonal() << endl;
		cout << "The sim is: " << a13[i].get_sim() << endl;
		cout << "The year is: " << a13[i].get_year() << endl<<endl;
	}
}

int main(void)
{
	vector<phone>a;
	int choice, n, rpt = 0, memory1, diagonal1, year1;
	float price1; bool sim1;
	string brand1, model1, color1;

	do {

		cout<< "1.Add one new phone.\n"
			<< "2.Add several new phones.\n"
			<< "3.Show all phones.\n"
			<< "4.Add new data for a phone.\n"
			<< "5.Sell a phone.\n"
			<< "6.Show all phones in order(brand).\n"
			<< "7.Show all phones in order(brand, years).\n"
			<< "8.Show all phones in order(brand, model, diagonal).\n"
			<< "9.Exit \n";

		cin>>choice; phone a1;

		switch (choice)
		{
			case 1:
			{
				ss(a1);

				if (find(a.begin(), a.end(), a1) != a.end())
				{ cout << "Already exists!"<<endl; }

				else { a.push_back(a1); sm(choice, a1, rpt); }
			    break;
			}

			case 2:
			{
				cout << "How many phones?"; cin >> n;

				while (n > 100) { cout << "How many phones?"; cin >> n; }

				for (size_t i = 0; i<n; i++)
				{
					phone b; ss(b);

					if (find(a.begin(), a.end(), b) != a.end())
					{ cout << "Already exists!"<<endl; }

					else { a.push_back(b); sm(choice, b, rpt); }
				}
				break;
			}

			case 3: { sp(a); break; }

			case 4:
			{
				cout << "Enter brand." << endl; cin >> brand1;
				cout << "Enter model." << endl; cin >> model1;

				for (size_t i = 0; i < a.size(); i++)
				{
					if (brand1 == a[i].get_brand() && model1 == a[i].get_model())
					{
						cout << "Enter color." << endl;
						cin >> color1;
						a[i].set_color(color1);

						cout << "Enter price." << endl;
						cin >> price1;
						a[i].set_price(price1);

						cout << "Enter memory." << endl;
						cin >> memory1;
						a[i].set_memory(memory1);

						cout << "Enter diagonal." << endl;
						cin >> diagonal1;
						a[i].set_diagonal(diagonal1);

						cout << "Enter sim." << endl;
						cin >> sim1;
						a[i].set_sim(sim1);

						cout << "Enter year." << endl;
						cin >> year1;
						a[i].set_year(year1);
					}
				}
				break;
			}

			case 5:
			{
				cout << "Enter brand." << endl; cin >> brand1;
				cout << "Enter model." << endl; cin >> model1;

				for (size_t i = 0; i < a.size(); i++)
				{
					if (brand1 == a[i].get_brand() && model1 == a[i].get_model())
					{
						a.erase(a.begin() + i);
					}
					else cout << "Nope!" << endl;
				}
				break;
			}

			case 6:
			{
				sort(a.begin(), a.end(), phone::str);
				sp(a); break;
			}

			case 7:
			{
				sort(a.begin(), a.end(), phone::str1);
				sp(a); break;
			}

			case 8:
			{
				sort(a.begin(), a.end(), phone::str2);
				sp(a); break;
			}

			case 9: { exit(0); break; }
		}

		cout << "Would you like to return to the menu? 1.Yes 2.No"; cin >> rpt;

	} while (rpt == 1);

	system("pause");
}
