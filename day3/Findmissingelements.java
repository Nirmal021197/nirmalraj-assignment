package week1.day3;

import java.util.Arrays;

public class Findmissingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[]= {1,2,3,4,6,7,8};
int length=num.length;
Arrays.sort(num);
for(int i=1;i<num.length;i++)
{
if (i!=num[i-1])
	{
		System.out.println(i);
		break;
	}

		}
}
	}


