import java.util.Scanner;
class MainClass
{
	int matrix[][];
	int a[][];
	int b[][];


	int row, column,sum;

	int count=2;
	//Create matrix
	void create() {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of rows :");
		row = Integer.parseInt(in.nextLine());
		System.out.println("Number of columns :");
		column = Integer.parseInt(in.nextLine());
		matrix = new int[row][column];
		a = new int[row][column];
		b = new int[row][column];
		System.out.println("Enter the data :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
	}
	//Display Matrix
	void display() {
		System.out.println("\nThe Matrix is :");
		for(int i=0; i < row; i++)
		 {
			for(int j=0; j < column; j++)
			{
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
	//Print Rows Sum
	void RowsaddOpration()
	{
		System.out.println("new matrix RowsSum is:");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				if(j+1>column-1)
				{
					sum=matrix[i][j]+matrix[i][0];
				}
				else
				{
					sum=matrix[i][j]+matrix[i][j+1];
				}

				if(count>2)
				{
                  count=0;
				}
				a[i][count]=sum;
				count++;

			}
		}
		for(int i=0;i<row;i++)
			{
				for (int j=0;j<column;j++)
				{
					System.out.print("\t" + a[i][j]);
				}
				System.out.println();
			}

		}

	//print column
	void ColoumaddOpration()
	{
		System.out.println("new matrix coloumSum is:");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				if(j+1>row-1)
				{
					sum=matrix[j][i]+matrix[0][i];
				}
				else
				{
					sum=matrix[j][i]+matrix[j+1][i];
				}
				//System.out.println(sum);
				if(count>2)
				{
                  count=0;
				}
				a[count][i]=sum;
				count++;

			}
		}
		for(int i=0;i<row;i++)
			{
				for (int j=0;j<column;j++)
				{
					System.out.print("\t" + a[i][j]);
				}
				System.out.println();
			}

		}
	//odd,unique,largest

	/*void OddUniqueLargest()
	{
		int m,n;
	  int add=0;
		int y[] = new int[6];
		int k=0;
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				if(a[i][j]%2!=0)
				{
					System.out.print(a[i][j]);
					}
				}
       a[i][j]=m;
       while(m> 0)
        {
        	n = m % 10;

            m = m / 10;
            add = add + n;
        }

        System.out.println("Sum of Digits:"+add);
      }
    }
*/

   }
class CreateMatrix
{
	public static void main(String args[]){
	MainClass obj = new MainClass();

	obj.create();
	obj.display();
	obj.RowsaddOpration();
	obj.ColoumaddOpration();
	obj.OddUniqueLargest();

	}

}
