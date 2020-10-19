import java.util.*;
class sarkaw{
    public static void main(String[] args) {
        System.out.print("write your number of letter name : ");
        Scanner sc=new Scanner(System.in);

        int numberLetter=sc.nextInt();

        char[] letters=new char[numberLetter];
        for(int i=0;i<letters.length;i++){

            System.out.print("write "+ (i+1) +" letter of your name : ");
            char nameLetter=sc.next().charAt(0);
            letters[i]=nameLetter;
        }


        String name="";
        for(int i=0;i<letters.length;i++){

            name+=letters[i];
        }

        System.out.println("your name is "+name+"");


    }
}