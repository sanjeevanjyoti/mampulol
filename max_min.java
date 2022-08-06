public class max_min {
    public static void main(String args[]){
        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        System.out.println("maximum value can be stored in a integer= "+max);
        System.out.println("minimum value can be stored in a integer= "+min);
        System.out.println("busted max value "+(max+1));//over flow
        System.out.println("busted min value "+(min-1));//under flow

        //we can write the number in this way also
        int s =1_568_461;
        long s1= 8_546_230_646_876_735_672L;
        short s2=9387;
        System.out.println(s+"   "+s1+"   "+s2);
    }
}
