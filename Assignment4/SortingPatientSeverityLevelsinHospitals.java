package Assignment4;

import java.util.*;

public class SortingPatientSeverityLevelsinHospitals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//no. of patients
        int[] severity=new int[n];
        for(int i=0;i<n;i++)
            severity[i]=sc.nextInt();
            Arrays.sort(severity);
        for(int i=0;i<n;i++)
            System.out.println(severity[i]);
    }
}
