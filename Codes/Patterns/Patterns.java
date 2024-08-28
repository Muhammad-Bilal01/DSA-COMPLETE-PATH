class Patterns{

    static void pattern1(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print("* ");
            }
                System.out.print("\n");
        }
    }


    static void pattern2(int n){
         for(int i=0; i < n; i++){
           
           for(int j=0; j<=i; j++){

                System.out.print("* ");
           }

                System.out.print("\n");
        }
    }

    static void pattern3(int n){
         for(int i=0; i < n; i++){
           
           for(int j=0; j<=i; j++){

                System.out.print(j + 1 +" ");
           }

                System.out.print("\n");
        }
    }

    static void pattern4(int n){
        for(int i=0; i < n; i++){
        
        for(int j=0; j<=i; j++){

            System.out.print(i + 1 +" ");
        }

            System.out.print("\n");}
    }
    

    static void pattern5(int n){

        for(int i =0; i <n; i++){
            for(int j = 0; j < n - i; j++ ){
                System.out.print("* ");
            }
                System.out.print("\n");
        }

    }

    static void pattern6(int n){
        for(int i =0; i <n; i++){
            for(int j = 0; j < n - i; j++ ){
                System.out.print(j + 1 + " ");
            }
                System.out.print("\n");
        }
    }

    static void pattern7(int n){
        for(int i =0; i < n ; i++){
           
        //    For print spaces
            for(int j = 0; j < n - i - 1; j++ ){
                System.out.print( " ");
            }
           
        //    for print stars
           for(int j = 0; j < 2 * i + 1; j++){
            System.out.print( "*");
           }

            //    For print spaces
            for(int j = 0; j < n - i - 1; j++ ){
                System.out.print( " ");
            }

                System.out.print("\n");
        }
    }

    static void pattern8(int n){
        for(int i =0; i < n ; i++){
           
        //    For print spaces
            for(int j = 0; j < i ; j++ ){
                System.out.print( " ");
            }
           
        //    for print stars
           for(int j = 0; j < 2 * n - (2*i + 1); j++){
            System.out.print( "*");
           }

            //    For print spaces
            for(int j = 0; j <  i ; j++ ){
                System.out.print( " ");
            }

                System.out.print("\n");
        }
    }

    static void pattern9(int n){
       pattern7(n);
       pattern8(n);
    }

    static void pattern10(int n){
        for(int i = 0; i < 2*n  ; i++){

            int stars = i;
                if(i > n){
                   
                     stars = 2*n - i;
                     }
            
            for(int j = 0; j < stars; j++){
                System.out.print("* ");
            }
                System.out.print("\n");
        }
    }

       static void pattern11(int n){

        for(int i = 0; i < n ; i++){

            int start = 1;
               
               if(i%2 == 0){
                    start = 1;
               }else{
                start = 0;
               }

            for(int j = 0; j < i + 1; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
                System.out.print("\n");
        }
    }

        static void pattern12(int n){
        
            int spaces = (2*n) - 2;

            for(int i = 0; i < n ; i++){

            // numbers
              for(int j = 0; j < i+1 ; j++){
                System.out.print(j+1);
              }  

            // space
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            
            // numbers
              for(int j = i ; j >= 0; j--){
                System.out.print(j+1);
              }  

                System.out.print("\n");
                spaces-=2;
            }
    }


    static void pattern13(int n){
        int count = 1;
        for(int i = 0; i < n ; i++){

            for(int j = 0; j < i + 1; j++){
                
                System.out.print(count+ " ");
                count++;
            }
                System.out.print("\n");
            }
    }

    static void pattern14(int n){
       
        for(int i = 0; i < n ; i++){

            for(char ch = 'A'; ch <= 'A' + i; ch++){
                
                System.out.print(ch + " ");
                
            }
                System.out.print("\n");
            }
    }

    static void pattern15(int n){
       
        for(int i = n; i > 0 ; i--){

            for(char ch = 'A'; ch <= 'A' + i - 1; ch++){
                
                System.out.print(ch + " ");
                
            }
                System.out.print("\n");
            }
    }

    static void pattern16(int n){
        char ch = 'A';
       
        for(int i = 0; i < n  ; i++){

            for(int j = 0; j < i +1; j++ ){
                
                System.out.print(ch + " ");
                
            }
                System.out.print("\n");
                ch++;
            }
    }

    static void pattern17(int n){
       
       
        for(int i = 0; i < n  ; i++){

            // Spaces
            for(int j = 0; j < n - i - 1; j++ ){
                System.out.print(" "); 
            }
            // Characters
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
                for(int j = 1; j <= 2*i +1; j++){
                    System.out.print(ch);
                    if(j <= breakpoint ) ch++;
                    else ch--;

                }
            // Spaces
            for(int j = 0; j < n - i -1; j++ ){
                System.out.print(" "); 
            }
                System.out.print("\n");
                ch++;
            }
    }

    static void pattern18(int n){
        for(int i =0; i<n; i++){
            
           for(char ch =(char)(int)('A'+n-1-i);
           ch<=(char)(int)('A'+n-1);
           ch++){
                System.out.print(ch);
            }
                System.out.println();
        }
    }
    
    
    
    public static void main(String[] args){
        pattern18(5);
    }
}