
    //Creates a random integer array at the size of given input
    public static int[] createArray(int positiveInteger){
        int numbers[] = new int[positiveInteger];
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        return numbers;
    
    }
