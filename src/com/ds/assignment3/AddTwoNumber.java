package com.ds.assignment3;

public class AddTwoNumber {

    public static int[] add(int X[], int Y[]) {
        int xlen = X.length;
        int ylen = Y.length;
        int carry = 0;
        int write = 0;
        int maxLexn = maxLen(xlen, ylen);
        int formatedX []=formatArray(X,xlen,maxLexn);
        int formatedY []=formatArray(Y,ylen,maxLexn);
        int S[] = new int[maxLexn + 1];
        for (int i = maxLexn; i > 0; i--) {
            int sum = formatedX[maxLexn - 1] + formatedY[maxLexn - 1];
             write = (sum % 10) + carry;
            if ((sum+carry) > 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            S[maxLexn] = write;
            maxLexn--;
        }
        if ((maxLexn==0) && (carry != 0)) {
            S[0] = 1;
        }

        return S;
    }

    static int maxLen(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        printSum();
    }

    private static void printSum() {
        String j = "";
        int x[] = {4, 5,6};
        int y[] = {7, 8,9};
        int sum[] = add(x, y);
        for (int i = 0; i < sum.length; i++) {
            j = j + sum[i];

        }
        System.out.println("" + j);

    }

    private static int[] formatArray(int[] A,int alen,int maxLexn) {
        
        if(alen<maxLexn){
          int farray[]=new int[maxLexn];
            for (int i = alen - 1; i >= 0; i--) {
               farray[maxLexn-1] = A[i];
               maxLexn--;
                
           }
           return farray;
       }else{
        return A;
        }
      
    }
}
