class Task3 {
    static int num = 165;
    static int sum = 0;
    public static void main (String[] args){
        sumCalculate();
        System.out.println(sum);
    }
    static void sumCalculate(){
        if (num < 10){
           return;
        }else{
           int temp = num % 10;
           sum += temp;
           num /= 10;
           if (num < 10) {
               sum += num;
           }
            sumCalculate();
        }
    }
}