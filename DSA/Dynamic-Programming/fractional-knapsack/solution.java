class Item{
    int value,weight;
    double ratio;
    public Item(int value,int weight){
        this.value=value;
        this.weight=weight;
        this.ratio=(double) value/weight;
    }
}
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n=val.length;
        Item[] items=new Item[n];
        for(int i=0;i<n;i++){
            items[i]=new Item(val[i],wt[i]);
        }

        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));

        double totalValue=0.0;
        long remainingCapacity=cap;
        for(Item item:items){
            if(item.weight<=remainingCapacity){
                totalValue+=item.value;
                remainingCapacity-=item.weight;
            }else{
                totalValue+=item.ratio*remainingCapacity;
                break;
            }
        }
        return totalValue;
    }
}