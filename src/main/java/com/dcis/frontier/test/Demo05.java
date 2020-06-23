package com.dcis.frontier.test;

public class Demo05 {

    //return index of value to be found,return -1 if not found
    //assuming that the array to search is sorted

    //loop implement
	public static int binarySearch2(int[] a,int toFind,int low,int high) {
		if (low>high||toFind<a[low]||toFind>a[high]) {
			return -1;
		}
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if (toFind==a[mid]) {
				return mid;
			}
			else if (toFind<a[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

    //recursive implement
    public static int binarySearch(int[] a,int toFind,int low,int high) {
        if (low>high||toFind<a[low]||toFind>a[high]) {
            return -1;
        }
        int mid=(low+high)/2;
        if (toFind==a[mid]) {
            return mid;
        }
        else if (toFind<a[mid]) {
            return binarySearch(a, toFind, low, mid-1);
        }
        else {
            return binarySearch(a, toFind, mid+1, high);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a={1,3,4,6,8,9,13,21};
        System.out.println(binarySearch(a, 4, 0, 7));
        System.out.println(binarySearch(a, 10, 0, 7));

    }

}