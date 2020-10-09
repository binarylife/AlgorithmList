package com.fengbei.car.algorithmlist.stack;

/**
 * author: beifeng.
 * date:   On 2020/9/23
 */
interface IStack {
    int push(int element);

    int peek();

    int pop();

    boolean isEmpty();

    int size();
}
