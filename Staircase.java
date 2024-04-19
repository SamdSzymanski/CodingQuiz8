 public static void staircase(int n) {
    // Write your code here
StringBuffer sb1 = new StringBuffer("");

        for(int i=0; i<n; i++)
        {
            sb1.append(" ");
        }
        
        for(int i=1; i<=n; i++)
        {
            StringBuffer sb2 = new StringBuffer(sb1);
            for(int j=i; j>=1; j--)
            {
                sb2.insert(n-j, "#");
            }
            System.out.println(sb2);
        }
    }
    }

//Time complexity: This solution uses nested for loopos that both iterte n times, 
//from this description of the function, it is cleat that the time complextiy is O(n^2)

//Space complexity: The space complexity for this function can be determined by computing 
//the size of the array that will be constructed to hold the staircase. As the 2d aray has rows with a size of n, 
//and the array itself is a square, we can say that the space complexity is also O(n^2).

