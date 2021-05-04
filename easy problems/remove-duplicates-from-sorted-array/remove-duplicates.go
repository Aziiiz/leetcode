package removeDuplicates

func RemoveDuplicates(nums []int) int {

	var counter int
	for k, _ := range nums {
		if nums[counter] != nums[k] {
			counter = counter + 1
			nums[counter] = nums[k]
		}
	}
	return counter + 1
}
