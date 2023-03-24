#include <bits/stdc++.h>
using namespace std;

#define int long long
#define testcase \
    int t;       \
    cin >> t;    \
    while (t--)
#define forloop(start, size) for (int i = start; i < size; i++)
#define all(v) v.begin(), v.end()
#define foreachx(v) for (auto &x : v)
#define maxofvec(v) *max_element(v.begin(), v.end())
#define minofvec(v) *min_element(v.begin(), v.end())
#define M 1000000007

void D(int o, int t)
{
    int n;
    cin >> n;
    string s, s2;
    cin >> s >> s2;
    string ans = "";
    forloop(0, n)
    {
        size_t found = s2.find(ans + s[i]);
        size_t found2 = s2.find(s[i] + ans);

        if (found != string::npos)
        {
            ans = ans + s[i];
        }
        else if (found2 != string::npos)
        {
            ans = s[i] + ans;
        }
        else
        {
            cout << "Case " << o - t << ": NO\n";
            return;
        }
    }
    //    cout<<ans<<' ';
    if (ans == s2)
    {
        cout << "Case " << o - t << ": YES\n";
    }
    else
    {
        cout << "Case " << o - t << ": NO\n";
    }
}

signed main()
{

    int t;
    cin >> t;
    int a = t;
    while (t--)
    {
        D(a, t);
    }

    return 0;
}