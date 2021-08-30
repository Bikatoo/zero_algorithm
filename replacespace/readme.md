# 替换空格

##### 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

**示例1**
> 输入：   
> s = "We are happy."   
> 输出：   
> "We%20are%20happy."   

**限制**
> 0 <= s 的长度 <= 10000   

**思路**
> 题目是要实现一个replace的api 因此直接调用不合适   
> 其次参数是一个字符串，由于在java中String被设计为不可变类，因此无法设计出一个原地修改的解法。
> 最容易想到的就是遍历复制 / 替换。

**实现**
> 见src目录下ReplaceSpace源码。   
> 时间复杂度O(n)  空间复杂度O(n)   
> n为字符串长度