package main

import "fmt"

func main() {
	fmt.Println(removeElement([]int{3, 2, 2, 3}, 3))
}

func removeElement(nums []int, val int) int {
	var j int
	for i := range nums {
		if nums[i] != val {
			nums[j] = nums[i]
			j++
		}
	}
	return j
}
