#include <iostream>
#include <queue>
#include <map>
#include <vector>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int value) {
        data = value;
        left = NULL;
        right = NULL;
    }
};

void verticalOrder(Node* root) {

    if (root == NULL)
        return;

    // Queue mein {node, column} store karenge
    queue<pair<Node*, int>> q;

    // Map: column -> nodes
    map<int, vector<int>> mp;

    // Root ka column = 0
    q.push({root, 0});

    while (!q.empty()) {

        // Queue se node aur uska column nikalo
        Node* current = q.front().first;
        int column = q.front().second;
        q.pop();

        // Node ko uske column mein store karo
        mp[column].push_back(current->data);

        // Left child -> column - 1
        if (current->left != NULL) {
            q.push({current->left, column - 1});
        }

        // Right child -> column + 1
        if (current->right != NULL) {
            q.push({current->right, column + 1});
        }
    }

    // Map automatically smallest column se largest column tak hota hai
    for (auto it : mp) {

        for (int value : it.second) {
            cout << value << " ";
        }

        cout << endl;
    }
}pr