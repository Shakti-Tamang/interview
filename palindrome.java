public class palindrome {



    public void fabonecci(int n,int a,int b){

        System.out.print(a+" "+b+ " ");


        for(int i=2;i<n;i++)
            {

                int temp=a+b;



                System.out.print(temp+" ");

                a=b;
                b=temp;


            }
    }
    {}

    public static void main(String[] args) {

        palindrome p=new palindrome();
        int n=10;

        int a=0;

        int b=1;

        p.fabonecci(n,a,b);

    }
    
}
