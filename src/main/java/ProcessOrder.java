public class ProcessOrder {
    public String processOrder(String s, char c){
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int[] array = new int[6];
        int[] newArray = new int[6];
        String[] strings = s.split("");
        for (int i = 0 ; i < 6 ; i ++){
            array[i] = Integer.parseInt(strings[i]);
        }
        switch (c){
            case 'L':
                newArray = changeOrder(array, 5, 2);
                break;
            case 'R':
                newArray = changeOrder(array, 6, 1);
                break;
            case 'F':
                newArray = changeOrder(array, 5, 4);
                break;
            case 'B':
                newArray = changeOrder(array, 6, 3);
                break;
            case 'A':
                newArray = changeOrder(array, 4, 1);
                break;
            case 'C':
                newArray = changeOrder(array, 3, 2);
                break;
            default:
                System.out.println("Input error!");
        }
        for (int x : newArray) {
            sb.append(x);
        }
        return sb.toString();
    }

    public int[] changeOrder(int[] array, int a, int b){
        int[] copy = new int[6];
        System.arraycopy( array, 0, copy, 0, array.length);
        int x,y;
        switch (a + b){
            case 7:
                x = 0;
                y = 4;
                break;

            case 9:
                x = 2;
                y = 4;
                break;

            default://case 5
                x = 0;
                y = 2;
                break;
        }
        copy[x] = array[a - 1];
        copy[y] = array[b - 1];
        if (a % 2 == 0){
            copy[x + 1] = array[a - 2];
            copy[y + 1] = array[b];
        }else {
            copy[x + 1] = array[a];
            copy[y + 1] = array[b - 2];
        }
        return copy;
    }

    public void processLoop(String s){
        String order = "123456";
        for (int j = 0; j < s.length(); j ++)
            order = processOrder(order, s.charAt(j));
        System.out.println(order);
    }
}
