# 子集

##### 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
##### 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。

**示例1**
> 输入：   
> nums = [1,2,3]    
> 输出：   
> [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]    

**示例2**
> 输入：   
> nums = [0]    
> 输出：   
> [[],[0]]    

**提示**
+ 1 <= nums.length <= 10
+ -10 <= nums[i] <= 10
+ nums 中的所有元素 互不相同

**思路**
> 当数组 `nums` 为`空集`的时候，他的子集有且只有`空集`。    
> `nums` 每新增一个元素，它的子集均可视作之前的所有子集 + 之前所有子集附加上新增的元素。
> 例：    
> nums = [] 子集为 []      
> nums = [1] 新增元素`1` 子集为 [] + [1]    
> nums = [1,2] 新增元素`2` 子集为 [],[1] + [2],[1,2]    
> nums = [1,2,3] 新增元素`3` 子集为 [],[1],[2],[1,2] + [3],[1,3],[2,3],[1,2,3]   

**实现**
> 见src目录下Subsets源码。   
> 时间复杂度O(n * 2^n) 空间复杂度O(n)    
