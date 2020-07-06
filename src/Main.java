public class Main {

    public int hammingDistance(int x, int y) {
        int count = 0;
        while ( x != 0 || y != 0){
            if (x%2 != y%2){
                count++;
            }
            x /= 2;
            y /= 2;
        }
        return count;
    }

    public static void main(String[] args){
        Main m = new Main();
        System.out.println(m.hammingDistance(93, 73));
    }
}
