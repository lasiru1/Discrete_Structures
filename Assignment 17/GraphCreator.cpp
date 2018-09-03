/*******************************************************************************
 * File:        GraphCreator.cpp
 * Programmer:  Uriel Salazar
 * Date:        November 31, 2017
 * Course:      CIS-7
 * Purpose:     Allows user to add nodes, arcs, and display graph information
*******************************************************************************/

//System Libraries
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

//User Libraries

//Declare Structure
struct Node
{
    Node(): i(N++) { }
    Node(int x): i(x) { }
    vector<Node *> auxiliary;
    static int N;
    int i;
};

//Global Constants
int            Node::N   = 0;
int            MAXDEGREE = 0;
vector<Node>   NODES;
vector<Node *> LOOPS;

//Function Prototypes
bool isGraphComplete();
vector<Node> isolatedNodes();

//Execution begins here
int main()
{
    //Declare Variables
    short   choice;
    bool    newlineLock = true;
    int     i           = 0;
    int     nloops      = 0;
    auto    start       = NODES.begin();
    auto    finish      = start;

    //While-loop
    while (true)
    {
        //Display Graph Information
        if (newlineLock == false)
        {
            cout << endl;
        }
        cout << "     GRAPH INFORMATION     " << endl;
        cout << "---------------------------" << endl;
        cout << "Highest Degree Node: "
             << (NODES.empty() ? -1 : MAXDEGREE) << endl;
        cout << "Isolated Nodes: ";
        auto isolated = isolatedNodes();
        for (const auto &v : isolated)
        {
            cout << v.i << ' ';
        }
        cout << endl;
        cout << "Number of Loops: {" << nloops << "} ";
        for (const auto &p : LOOPS)
        {
            cout << p->i << ' ';
        }
        cout << endl;
        cout << "Graph Connected: "
             << (NODES.empty() ? "No" : isolated.empty() ? "Yes" : "No")
             << std::endl;
        cout << "Graph Complete: "
             << (NODES.empty() ? "No" : isGraphComplete() ? "Yes" : "No")
             << endl;
        cout << endl;
        cout << "     MENU     " << endl;
        cout << "--------------" << endl;
        cout << "1. Create Node" << endl;
        cout << "2. Create Arc" << endl;
        cout << "3. Exit Program" << endl;

        //Prompt User for Input
        cout << endl;
        cout << "Please enter an input code: ";
        cin >> choice;

        //Switch Statement
        switch (choice)
        {
            case 1:
                NODES.push_back(Node());
                cout << endl;
                cout << "Node " << "\"" <<  Node::N - 1  << "\"" << " created!"
                     << endl;
                cout << "Press ENTER to continue...";
                cin.ignore();
                cin.get();
                cout << string(50, '\n');
                break;
            case 2:
                if (NODES.empty())
                {
                    cout << string(50, '\n');
                    break;
                }
                cout << "Enter the node to connect to: ";
                cin >> i;
                if (i < NODES.size())
                {
                    start = NODES.begin() + i;
                }
                else
                {
                    break;
                }
                cout << "Enter the second node to connect to: ";
                cin >> i;
                if (i < NODES.size())
                {
                    finish = NODES.begin() + i;
                }
                else
                {
                    break;
                }
                start->auxiliary.push_back(&*finish);
                finish->auxiliary.push_back(&*start);
                if (start == finish)
                {
                    ++nloops;
                    LOOPS.push_back(&*start);
                }
                if (start->auxiliary.size() > (NODES.begin()
                         + MAXDEGREE)->auxiliary.size())
                {
                    MAXDEGREE = start->i;
                }
                if (finish->auxiliary.size() > (NODES.begin()
                         + MAXDEGREE)->auxiliary.size())
                {
                    MAXDEGREE = finish->i;
                }
                cout << endl;
                cout << "Arc created!" << endl;
                cout << "Press ENTER to continue...";
                cin.ignore();
                cin.get();
                cout << string(50, '\n');
                break;
            case 3:
                cout << "\nGood-bye!" << endl;
                return 0;
        }
        newlineLock = false;
    }
    //Exit Program
    return 0;
}

//Function "isGraphComplete"
bool isGraphComplete()
{
    for (auto node : NODES)
    {
        //erase LOOPS
        auto last = remove_if(node.auxiliary.begin(), node.auxiliary.end(),
                              [node](Node *p) { return p->i == node.i; });

        //erase duplicates
        last = unique(node.auxiliary.begin(), node.auxiliary.end(),
                      [node](Node *p, Node *p2) { return p->i == p2->i; });

        //check to see if node.auxiliary is connected to NODES.size() - 1 NODES
        if (last - node.auxiliary.begin() != NODES.size() - 1)
        {
            return 0;
        }
    }
    return 1;
}

//Function "isolatedNodes"
vector<Node> isolatedNodes()
{
    vector<Node> origin;
    for (const auto &n : NODES)
    {
        if (n.auxiliary.size() == 0)
        {
            origin.push_back(Node(n.i));
        }
    }
    return origin;
}