# 左旋转字符串

##### 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

**示例1**
> 输入:   
> s = "abcdefg", n = 2   
> 输出:   
> "cdefgab"

**示例2**
> 输入:   
> s = "lrloseumgh", n = 6   
> 输出:   
>"umghlrlose"

**限制**
> 1 <= n < s.length <= 10000

**思路**
> 其次参数是一个字符串，由于在java中String被设计为不可变类，因此无法设计出一个原地修改的解法。
> 巧妙利用取余，让遍历的起点是第一个不需要左旋的字符（下标n），遍历完不需要左旋的部分之后，从需要左旋的第一个字符开始，直到结束。

**实现**
> 见src目录下ReverseLeftWords源码。   
> 时间复杂度O(n)  空间复杂度O(n)   
> n为字符串长度