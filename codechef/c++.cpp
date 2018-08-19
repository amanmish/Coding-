#include<bits/stdc++.h>
#define ll long long int
using namespace std;
	
 
int main()
{
	
   int t;
   cin>>t;
   while(t--)
   {
		ll l,r;
		cin>>l>>r;
		ll n=(r/6)-(l-1)/6;
	    ll m=n;
	    while(l%6!=0)
	    {
			l++;
		}
		ll s=n*(2*l+(n-1)*6)/2;
		cout<<s<<"\n";
   }
}
       
 