package searchInsert

func SearchInsert(nums []int, target int) int {

	if target < nums[0] {
		return 0
	}
	for i, k := range nums {
		if target == k {
			return i
		}
		if target < k {
			return i
		}
	}
	return len(nums)
}
