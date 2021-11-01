# 环形链表

##### 给定一个链表，判断链表中是否有环。

**示例1**
> ![示例1](img1.png)   
> 输入：head = [3,2,0,-4]   
> 输出：true   
> 解释：链表中有一个环，其尾部连接到第二个节点。   

**示例2**
> ![示例2](img2.png)   
> 输入：head = [1,2]   
> 输出：true   
> 解释：链表中有一个环，其尾部连接到第一个节点。   

**示例3**
> ![示例3](img3.png)   
> 输入：head = [1]   
> 输出：false   
> 解释：链表中没有环。   

**提示**
+ 链表中节点的数目范围是 [0, 104]
+ -105 <= Node.val <= 105

**思路1**
> 快慢指针   
> 快每次移动两步，慢指针每次移动一步   
> 环形链表最终两指针必定相遇   

**实现**
> 见 HasCycle 源码   
> 时间复杂度 O(n) 空间复杂度 O(1)   