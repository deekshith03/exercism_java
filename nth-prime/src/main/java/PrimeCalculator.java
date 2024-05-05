class PrimeCalculator {

    private boolean isPrimeNumber(int number){
        if(number <= 1) return false;
        for(int i=2; i<=number/2; i++){
            if(number%i == 0) return false;
        }
        return true;
    }

    int nth(int nth) {
        if(nth == 0)
        {
            throw new IllegalArgumentException();
        }
        int number = 2;
        int position = 1;
        while(true){
            if(position == nth && isPrimeNumber(number))
            {
                return number;
            }
            else if(isPrimeNumber(number))
            {
                position++;
            }
            number++;
        }
    }

}
