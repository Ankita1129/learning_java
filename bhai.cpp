class Solution
{
public:
    ListNode *detectCycle(ListNode *head)
    {
        ListNode *i = new ListNode();
        ListNode *j = new ListNode();
        int count = 0;

        i = head;
        j = head;

        // cout << INT_MAX << endl;
        // cout<<"i->val : "<<i->val<<endl;

        while (i != nullptr)
        { // if there is no cycle present.
            i = i->next;
        }

        while (i != NULL && i->val != INT_MAX)
        {                     // keep iterating through the list while parallely putting INT_MAX on the
            i->val = INT_MAX; // already traversed notes. Break the loop when encounter INT_MAX which will
            i = i->next;      // resemble that the present node is already visited, hence a cycle.
        }
        if (i == NULL)
        {
            return NULL;
        }

        i->val = INT_MIN; // substitute INT_MIN where the previous loop broke to mark it as a starting index of cycle

        while (j->val != INT_MIN)
        {            // iterate through the list while finding the INT_MIN, as soon as found break the loop
            count++; // and that will be the starting index of the cycle.
            j = j->next;
        }

        cout << "count : " << count << endl;
        return j; // returning the position from where the cycle started.
    }
};