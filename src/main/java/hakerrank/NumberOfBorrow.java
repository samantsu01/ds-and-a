package hakerrank;

public class NumberOfBorrow {

    public static int numberOfBorrow(int num1, int num2){ // 754, 658
        if(num1 < num2){
            System.out.println("Not Possible");
            return 0;
        }else {
            int count = 0;
            boolean flag = false;
            while(num1 != 0 && num2 != 0){
                int temp1 = 0; //
                int temp2 = 0; // 8
                temp2 = num2 % 10; // temp2 = 8
                if(flag){
                    temp1 = num1 % 10 - 1;
                }else {
                    temp1 = num1 % 10;
                }

                if(temp1 < temp2){
                    count++;
                    flag = true;
                }else {
                    flag =false;
                }
                num1 = num1 / 10;
                num2 = num2 / 10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int numberOfBorrow = numberOfBorrow(244, 238);
        System.out.println(numberOfBorrow);
    }
}
