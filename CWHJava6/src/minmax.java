public class minmax {
        public static void main(String[] args) {
            int [] arr={1, 2, 3, 4, 5};

            //maximum

            int max=arr[0];

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.println("the largest number is "+max);

            //minimum

            int min=arr[0];

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
            System.out.println("the smallest number is "+min);
        }
    }


/*
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		int [] arr={1, 2, 3, 4, 5};

		//maximum

		int max=arr[0];

		for(int elem: arr)
		{
			if(elem>max)
			{
				max=elem;
			}
		}
		System.out.println("the largest number is "+max);

		//minimum

		int min=arr[0];

		for(int elem:arr)
		{
			if(elem<min)
			{
				min=elem;
			}
		}
		System.out.println("the smallest number is "+min);
	}
}
*/
