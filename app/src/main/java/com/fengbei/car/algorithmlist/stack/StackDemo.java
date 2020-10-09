package com.fengbei.car.algorithmlist.stack;

/**
 * author: beifeng.
 * date:   On 2020/9/23
 */
class StackDemo implements IStack {

    //  默认容量
    private static final int CAPITILY = 10;
    //  库容因子
    private static final int FACTOR = 2;

    //  集合元素的个数
    private int mSize = 0;

    //  核心数组
    private int[] mArray = new int[CAPITILY];

    @Override
    public int push(int element) {
        if (mSize > mArray.length) {
            //  需要扩容
            int[] newArray = new int[mArray.length * FACTOR];
            System.arraycopy(mArray, 0, newArray, 0, mArray.length);
            mArray = newArray;
        }
        mArray[mSize++] = element;
        return element;
    }

    @Override
    public int peek() {
        if (mSize > 0) {
            return mArray[mSize - 1];
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public int pop() {
        if (mSize > 0) {
            int i = mArray[mSize - 1];
            mArray[mSize - 1] = 0;
            mSize--;
            return i;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public boolean isEmpty() {
        return mSize == 0;
    }

    @Override
    public int size() {
        return mSize;
    }
}
