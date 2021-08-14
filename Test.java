class Test2 {
    public static void main(String [] args) 
    {
        // int x= 0;
        // int y= 0;
        // for (int z = 0; z < 5; z++) 
        // {
        //     if (( ++x > 2 ) && (++y > 2)) 
        //     {
        //         System.out.println("hi");
        //         x++;
        //     }
        // }
        // System.out.println(x + " " + y);

        // final int to = 4;
        int i = 0, j = 5; 
    tp: for (;;) 
        {
            i++;  
            System.out.println("inside 1st loop" + i);
            for (;;) 
            {
                System.out.println("inside 2nd loop" + j);
                if(i > --j) 
                {
                    break tp; 
                } 
            }     
        }

        System.out.println("i =" + i + ", j = " + j);
        
    }
}
