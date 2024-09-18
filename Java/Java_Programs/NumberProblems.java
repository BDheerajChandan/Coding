class NumberProblems {
    public boolean twin(int n) {
        int x=0;
        int count=0;
        for(x=2;x<n;x++) {
            if(n%x==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public void twinprimes(int lim) {
        int num=0;
        int i=0;
        for(i=2;i<lim-2;i++) {
            num=i+2;
            if(twin(i) && twin(num))
            System.out.println(i + " " +num +"are twin primes");
        }
    }
}



