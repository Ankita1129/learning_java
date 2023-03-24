class Solution
{
public:
    void ModifiedMerge(vector<int> &nums, int lo, int mid, int hi, vector<int> &inversions)
    {
        int k = 0; // inversions mai traverse karne ke lie
        // ptr to traverse the right half
        int j = mid + 1;
        // traversing the left half
        for (int i = lo; i <= mid; i++)
        {
            // traversing j untill
            // j in bound and conditions(smaller hai) mets ;
            while (j <= hi && nums[i] < nums[j])
            {
                j++;
            }
            // now j at required index so we can add wo kitna mofve hua
            inversions[k++] = j - (mid + 1);
        }

        // now normal merging
        vector<int> temp;
        int ii = lo, jj = mid + 1;
        while (ii <= mid && jj <= hi)
        {
            if (nums[ii] < nums[jj])
                temp.push_back(nums[ii++]);
            else
                temp.push_back(nums[jj++]);
        }
        while (ii <= mid)
            temp.push_back(nums[ii++]);
        while (jj <= hi)
            temp.push_back(nums[jj++]);

        for (int i = lo; i <= hi; i++)
            nums[i] = temp[i - lo];
    }
    void mergeSort(vector<int> &nums, int lo, int hi, vector<int> &inversions)
    {
        if (lo < hi)
        {
            int mid = (lo + hi) / 2;
            mergeSort(nums, lo, mid, inversions);
            mergeSort(nums, mid + 1, hi, inversions);
            ModifiedMerge(nums, lo, mid, hi, inversions);
        }
    }
    vector<int> countSmaller(vector<int> &nums)
    {
        vector<int> inversions(nums.size(), 0);
        // calling modified mergesort ;
        mergeSort(nums, 0, nums.size() - 1, inversions);
        return inversions;
    }
};