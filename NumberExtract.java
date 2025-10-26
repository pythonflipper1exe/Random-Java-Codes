class NumberExtract{
    public static void main(int num){
        int counter= 0, extract;
        int i = num;
        for(; i>0; i/=10){
            extract = i%10;
            counter+= 1;
        }
        System.out.println("There are " + counter + " digits.");
    }
}