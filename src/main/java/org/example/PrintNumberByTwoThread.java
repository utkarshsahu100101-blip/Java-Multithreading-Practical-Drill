package org.example;


class PrintNumberByTwoThread implements Runnable{
private final int start;
private final int end;
private final int oType;

    PrintNumberByTwoThread(int start, int end ,int oType) {
        this.start = start;
        this.end = end;
        this.oType=oType;
    }


    @Override
    public void run() {
        for(int i=start;i<=end;i++){
            if(i%2==oType)
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
