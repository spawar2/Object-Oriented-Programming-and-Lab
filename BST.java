{\rtf1\ansi\ansicpg1252\cocoartf2706
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red10\green82\blue135;\red255\green255\blue255;\red0\green0\blue0;
\red44\green44\blue44;\red15\green114\blue1;\red0\green0\blue255;\red18\green139\blue2;}
{\*\expandedcolortbl;;\cssrgb\c0\c40000\c60000;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0;
\cssrgb\c22745\c22745\c22745;\cssrgb\c0\c50980\c0;\cssrgb\c0\c0\c100000;\cssrgb\c0\c60000\c0;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720

\itap1\trowd \taflags0 \trgaph108\trleft-108 \trbrdrt\brdrnil \trbrdrl\brdrnil \trbrdrt\brdrnil \trbrdrr\brdrnil 
\clvertalt\clvertalbase \clshdrawnil \clwWidth16543\clftsWidth3 \clbrdrt\brdrnil \clbrdrl\brdrnil \clbrdrb\brdrnil \clbrdrr\brdrnil \clpadl0 \clpadr0 \gaph\cellx8640
\pard\intbl\itap1\pardeftab720\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class\cf5 \strokec4  BST_class \{ \cf0 \
\pard\intbl\itap1\pardeftab720\partightenfactor0
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 //node class that defines BST node\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 class\cf5 \strokec4  Node \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf5 \strokec4  key; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Node left, right; \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf5 \strokec4  Node(\cf2 \strokec2 int\cf5 \strokec4  data)\{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0key = data; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0left = right = \cf2 \strokec2 null\cf5 \strokec4 ; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 // BST root node \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0Node root; \cf0 \
\cf5 \'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\cf6 \strokec6 // Constructor for BST =>initial empty tree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0BST_class()\{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = \cf2 \strokec2 null\cf5 \strokec4 ; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 //delete a node from BST\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 void\cf5 \strokec4  deleteKey(\cf2 \strokec2 int\cf5 \strokec4  key) \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = delete_Recursive(root, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 //recursive delete function\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0Node delete_Recursive(Node root, \cf2 \strokec2 int\cf5 \strokec4  key)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //tree is empty\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root == \cf2 \strokec2 null\cf5 \strokec4 )\'a0 \cf2 \strokec2 return\cf5 \strokec4  root; \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //traverse the tree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (key < root.key)\'a0\'a0\'a0\'a0 \cf6 \strokec6 //traverse left subtree \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.left = delete_Recursive(root.left, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 else\cf5 \strokec4  \cf2 \strokec2 if\cf5 \strokec4  (key > root.key)\'a0 \cf6 \strokec6 //traverse right subtree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.right = delete_Recursive(root.right, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 else\cf5 \strokec4 \'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // node contains only one child\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root.left == \cf2 \strokec2 null\cf5 \strokec4 ) \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root.right; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 else\cf5 \strokec4  \cf2 \strokec2 if\cf5 \strokec4  (root.right == \cf2 \strokec2 null\cf5 \strokec4 ) \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root.left; \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // node has two children; \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //get inorder successor (min value in the right subtree) \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.key = minValue(root.right); \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // Delete the inorder successor \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.right = delete_Recursive(root.right, root.key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf5 \strokec4  minValue(Node root)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //initially minval = root\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf5 \strokec4  minval = root.key; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //find minval\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 while\cf5 \strokec4  (root.left != \cf2 \strokec2 null\cf5 \strokec4 )\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0minval = root.left.key; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = root.left; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  minval; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 // insert a node in BST \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 void\cf5 \strokec4  insert(\cf2 \strokec2 int\cf5 \strokec4  key)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = insert_Recursive(root, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 //recursive insert function\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0Node insert_Recursive(Node root, \cf2 \strokec2 int\cf5 \strokec4  key) \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //tree is empty\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root == \cf2 \strokec2 null\cf5 \strokec4 ) \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = \cf2 \strokec2 new\cf5 \strokec4  Node(key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //traverse the tree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (key < root.key)\'a0\'a0\'a0\'a0 \cf6 \strokec6 //insert in the left subtree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.left = insert_Recursive(root.left, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 else\cf5 \strokec4  \cf2 \strokec2 if\cf5 \strokec4  (key > root.key)\'a0\'a0\'a0 \cf6 \strokec6 //insert in the right subtree\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root.right = insert_Recursive(root.right, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // return pointer\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\cf0 \
\pard\intbl\itap1\pardeftab720\partightenfactor0
\cf6 \strokec6 // method for inorder traversal of BST \cf0 \strokec4 \
\pard\intbl\itap1\pardeftab720\partightenfactor0
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 void\cf5 \strokec4  inorder() \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0inorder_Recursive(root); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 // recursively traverse the BST\'a0 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 void\cf5 \strokec4  inorder_Recursive(Node root) \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root != \cf2 \strokec2 null\cf5 \strokec4 ) \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0inorder_Recursive(root.left); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.print(root.key + \cf7 \strokec7 " "\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0inorder_Recursive(root.right); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 boolean\cf5 \strokec4  search(\cf2 \strokec2 int\cf5 \strokec4  key)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0root = search_Recursive(root, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root!= \cf2 \strokec2 null\cf5 \strokec4 )\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  \cf2 \strokec2 true\cf5 \strokec4 ;\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 else\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  \cf2 \strokec2 false\cf5 \strokec4 ;\cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\cf6 \strokec6 //recursive insert function\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0Node search_Recursive(Node root, \cf2 \strokec2 int\cf5 \strokec4  key)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // Base Cases: root is null or key is present at root \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root==\cf2 \strokec2 null\cf5 \strokec4  || root.key==key) \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  root; \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // val is greater than root's key \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf5 \strokec4  (root.key > key) \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  search_Recursive(root.left, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 // val is less than root's key \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf5 \strokec4  search_Recursive(root.right, key); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \}\cf0 \
\pard\intbl\itap1\pardeftab720\partightenfactor0
\cf2 \strokec2 class\cf5 \strokec4  Main\{\cf0 \
\pard\intbl\itap1\pardeftab720\partightenfactor0
\cf5 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf5 \strokec4  \cf2 \strokec2 static\cf5 \strokec4  \cf2 \strokec2 void\cf5 \strokec4  main(String[] args)\'a0 \{ \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //create a BST object\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0BST_class bst = \cf2 \strokec2 new\cf5 \strokec4  BST_class(); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 /* BST tree example\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 45 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 /\'a0\'a0\'a0\'a0 \\ \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 10\'a0\'a0\'a0\'a0\'a0 90 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 /\'a0 \\\'a0\'a0\'a0 /\'a0\'a0 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 7\'a0\'a0 12\'a0 50\'a0\'a0 */\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //insert data into BST\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 45\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 10\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 7\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 12\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 90\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.insert(\cf8 \strokec8 50\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //print the BST\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "The BST Created with input data(Left-root-right):"\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.inorder(); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //delete leaf node\'a0 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "\\nThe BST after Delete 12(leaf node):"\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.deleteKey(\cf8 \strokec8 12\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.inorder(); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //delete the node with one child\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "\\nThe BST after Delete 90 (node with 1 child):"\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.deleteKey(\cf8 \strokec8 90\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.inorder(); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //delete node with two children\'a0 \cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "\\nThe BST after Delete 45 (Node with two children):"\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.deleteKey(\cf8 \strokec8 45\cf5 \strokec4 ); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bst.inorder(); \cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 //search a key in the BST\cf0 \strokec4 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 boolean\cf5 \strokec4  ret_val = bst.search (\cf8 \strokec8 50\cf5 \strokec4 );\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "\\nKey 50 found in BST:"\cf5 \strokec4  + ret_val );\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ret_val = bst.search (\cf8 \strokec8 12\cf5 \strokec4 );\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf7 \strokec7 "\\nKey 12 found in BST:"\cf5 \strokec4  + ret_val );\cf0 \
\cf5 \'a0\'a0\'a0\'a0\'a0\} \cf0 \
\cf5 \}\cf0 \cell \lastrow\row
}