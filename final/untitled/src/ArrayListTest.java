

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(5);
        arrayList.add(0,13);
        arrayList.add(1,25);
        arrayList.add(2,8);
        arrayList.add(3,96);
        arrayList.add(4,3);
        bubblesort(arrayList);
        System.out.println(arrayList.toString());
    }

    //"Time complexity of the algorithm is Θ(n^2)"
    public static void bubblesort(ArrayList<Integer> list)
    {
        for (int i = 1; i < list.size()-1; i++) {
            for (int j = list.size()-1; j >0 ; j--) {
                if(list.get(j)<list.get(j-1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,temp);
                }
            }

        }
    }
    //"Time complexity of the algorithm is Θ(n^2)"


}
