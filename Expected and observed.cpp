#include<iostream>
#include<string>
#include<list>
#include<iterator>
#include<fstream>
#include<math.h>
using namespace std;

class CDigit
{
private:

	int m_iDigit;

public:
	CDigit() {};

	CDigit(int val)
	{
		m_iDigit = val;
	}

	CDigit(CDigit &a)
	{
		m_iDigit = a.m_iDigit;
	}

	int GetDigit() const
	{
		return m_iDigit;
	}

	void SetDigit(const int val)
	{
		m_iDigit = val;
	}

	virtual void Output(ostream& toStream)
	{
		toStream << "The value is: " << m_iDigit << endl << endl;
	}

	virtual void SetSome(const int val) = 0;

	virtual bool less(const CDigit* pDigit) = 0;

	virtual int GetSome() const = 0;

	friend class CGoodnessOfFit;
};

class CExpected : public CDigit
{
private:

	int m_iExpFreq;

public:

	CExpected() {};

	CExpected(int digit, int val) :CDigit(digit)
	{
		m_iExpFreq = val;
	}

	CExpected(const CExpected& a)
	{
		m_iExpFreq = a.m_iExpFreq;
	}

	int GetExpected() const
	{
		return m_iExpFreq;
	}

	int GetSome() const
	{
		return m_iExpFreq;
	}

	void SetExpected(const int val)
	{
		m_iExpFreq = val;
	}

	void Output(ostream& toStream)
	{
		toStream << "The value is: " << m_iExpFreq << endl << endl;
	}

	bool less(const CDigit* pDigit)
	{
		if (m_iExpFreq > pDigit->GetSome()) return true;
		else if (m_iExpFreq < pDigit->GetSome()) return false;
		else return -1;
	}

	void SetSome(const int val)
	{
		m_iExpFreq = val;
	}

	friend istream &operator >> (istream &input, CExpected& a)
	{
		input >> a.m_iExpFreq;
		return input;
	}

	friend ostream &operator << (ostream &output, const CExpected& a)
	{
		output << a.GetExpected();
		return output;
	}

	int operator = (CExpected const &a)
	{
		m_iExpFreq = a.m_iExpFreq;
	}

	bool operator == (CExpected const &a)
	{
		if (m_iExpFreq == a.m_iExpFreq) return true;
	}

	friend class CGoodnessOfFit;
};

class CObserved : public CDigit
{
private:

	int m_iObsFreq;

public:

	CObserved() {};

	CObserved(int digit, int val) :CDigit(digit)
	{
		m_iObsFreq = val;
	}

	CObserved(const CObserved& a)
	{
		m_iObsFreq = a.m_iObsFreq;
	}

	int GetObserved() const
	{
		return m_iObsFreq;
	}

	int GetSome() const
	{
		return m_iObsFreq;
	}

	void SetObserved(const int val)
	{
		m_iObsFreq = val;
	}

	void Output(ostream& toStream)
	{
		toStream << "The value is: " << m_iObsFreq << endl << endl;
	}

	bool less(const CDigit* pDigit)
	{
		if (m_iObsFreq > pDigit->GetSome()) return true;
		else if (m_iObsFreq < pDigit->GetSome()) return false;
		else return -1;
		
	}

	void SetSome(const int val)
	{
		m_iObsFreq = val;
	}

	friend istream &operator >> (istream &input, CObserved& a)
	{
		input >> a.m_iObsFreq;
		return input;
	}

	friend ostream &operator << (ostream &output, const CObserved& a)
	{
		output << a.GetObserved();
		return output;
	}

	int operator = (CObserved const &a)
	{
		m_iObsFreq = a.m_iObsFreq;
	}

	bool operator == (CObserved const &a)
	{
		if (m_iObsFreq == a.m_iObsFreq) return true;
	}

	friend class CGoodnessOfFit;
};

class CGoodnessOfFit
{
private:

	list<CDigit*>m_IExp;
	list<CDigit*>m_IObs;
	int m_iTotalFreqDiff;
	double m_dChiCalc;
	double m_dChiAlpha;

public:

	CGoodnessOfFit(const string& strFileNameExp, const string& strFileNameObs)
	{
		ifstream myfile(strFileNameExp.c_str());
		ifstream myfile1(strFileNameObs.c_str());
		int a, b;

		myfile.exceptions(ifstream::badbit);
		myfile1.exceptions(ifstream::badbit);

		try
		{
			if (myfile.is_open())
			{
				while (!myfile.eof())
				{
					myfile >> a >> b;
					CDigit* a1 = new CExpected(a, b);
					m_IExp.push_back(a1);
				}
				myfile.close();
			}

			else
			{
				cout << "Problem, check name or file destination!" << endl;
				system("pause");
			}
		}

		catch (const int x)
		{
			cout << "Exception reading file";
		}

		try
		{
			if (myfile1.is_open())
			{
				while (!myfile1.eof())
				{
					myfile1 >> a >> b;
					CDigit* a1 = new CObserved(a, b);
					m_IObs.push_back(a1);
				}

				myfile1.close();
			}

			else
			{
				cout << "Problem, check name or file destination!" << endl;
				system("pause");
			}
		}

		catch (const int x)
		{
			cout << "Exception reading file";
		}

	}

	bool calcTotalFreqDiff()
	{
		list<CDigit*>::iterator i;

		int sum = 0, sum1 = 0;

		for (i = m_IExp.begin(); i != m_IExp.end(); i++)
		{
			sum += (*i)->GetSome();
		}

		for (i = m_IObs.begin(); i != m_IObs.end(); i++)
		{
			sum1 += (*i)->GetSome();
		}

		m_iTotalFreqDiff = sum - sum1;
		cout << "The difference is: " << m_iTotalFreqDiff << endl << endl;
	}

	void SetChiAlpha(double ChiValue)
	{
		m_dChiAlpha = ChiValue;
	}

	bool CalcChi()
	{
		list<CDigit*>::iterator i;

		double sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;

		for (i = m_IExp.begin(); i != m_IExp.end(); i++)
		{
			sum += (*i)->GetSome();
		}

		for (i = m_IObs.begin(); i != m_IObs.end(); i++)
		{
			sum1 += (*i)->GetSome();
		}

		sum2 += sum + sum1;
		sum3 = sum1 - sum;
		sum4 = sum2 * sum3;
		sum5 = pow(sum4, 2);

		m_dChiCalc = sqrt(sum5 / sum);

		if (m_dChiCalc <= 0) return false;
		else return true;
	}

	bool CalcGofF()

	{
		if (m_dChiCalc <= 0) return false;
		else
			cout << "The statistical grade is: " << m_dChiCalc << endl << endl;
	}

	double Get_m_dChiCalc()
	{
		return m_dChiCalc;
	}

	double Get_m_dChiAlpha()
	{
		return m_dChiAlpha;
	}

	static double getData(CGoodnessOfFit &a)
	{
		a.Get_m_dChiCalc();
		a.Get_m_dChiAlpha();
	}

	int setData(int iDigit, int iExpected, int iObserved)
	{
		while (iDigit <= 0)
		{
			cout << "Enter a iDigit bigger than 0: ";
			cin >> iDigit;
		}

		while (iExpected <= 0)
		{
			cout << "Enter a iExpected bigger than 0: ";
			cin >> iExpected;
		}

		while (iObserved <= 0)
		{
			cout << "Enter a iObserved bigger than 0: ";
			cin >> iObserved;
		}

		list<CDigit*>::iterator i, i1;

		for (i = m_IExp.begin(); i != m_IExp.end(); i++)
		{
			for (i1 = m_IObs.begin(); i1 != m_IObs.end(); i1++)
			{
				if ((*i)->GetDigit() == iDigit && (*i1)->GetDigit() == iDigit)
				{
					(*i)->SetSome(iExpected);
					(*i1)->SetSome(iObserved);
				}
			}
		}
	}

	void writeToCout()
	{
		list<CDigit*>::iterator i, i1;

		cout << "The data is: " << endl;
		cout << "Digit Exp Obs" << endl;

		for (i = m_IExp.begin(); i != m_IExp.end(); i++)
		{
			for (i1 = m_IObs.begin(); i1 != m_IObs.end(); i1++)
			{
				if ((*i)->GetDigit() == (*i1)->GetDigit())
					cout << (*i)->GetDigit() << "     " << (*i)->GetSome() << "   " << (*i1)->GetSome() << endl;
			}
		}
		cout << endl;
	}

	bool isFoundExpNumber(int iToFind)
	{

		while (iToFind <= 0)
		{
			cout << "Enter a number bigger than 0: ";
			cin >> iToFind;
		}

		list<CDigit*>::iterator i;

		cout << "The matching result is: ";

		for (i = m_IExp.begin(); i != m_IExp.end(); i++)
		{
			if ((*i)->GetDigit() == iToFind)
				cout << (*i)->GetDigit() << " " << (*i)->GetSome() << endl;
		}
		cout << endl;
		return iToFind;
	}

	int GetTotalFreqDiff()
	{
		return 	m_iTotalFreqDiff;
	}
};

int main(void)
{
	CGoodnessOfFit a("goodnessExp.txt", "goodnessObs.txt");
	a.writeToCout();
	a.isFoundExpNumber(4);
	a.calcTotalFreqDiff();
	a.CalcChi();
	a.CalcGofF();
	a.setData(4, 16, 15);
	a.writeToCout();	
	
	system("pause");
}
