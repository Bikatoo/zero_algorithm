# 用两个栈实现队列

##### 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

**示例1**
> 输入：["CQueue","appendTail","deleteHead","deleteHead"]
> [[],[3],[],[]]
> 输出：
>[null,null,3,-1]

**示例2**
> 输入：
> ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
> [[],[],[5],[2],[],[]]
> 输出：
> [null,-1,null,null,5,2]

**提示**
> 1 <= values <= 10000
> 最多会对 appendTail、deleteHead 进行 10000 次调用

**思路**
> 题目要求使用两个栈实现一个队列，主要实现队尾插入和队首删除两个api。
> 主要的难点在取队首元素，由于栈先进先出的特点，无法直接取到先插入的元素。
> 因此可以使用一个栈s1用于存储元素，一个栈s2用于取队首元素。
> 在取队首元素时，先取栈s2中的元素，如果栈s2中无元素，再将栈s1中的元素倒入s2，

**实现**
> 见src目录下CQueue源码。
> 时间复杂度O(1)  空间复杂度O(n)