package main

import "fmt"

func twoSum(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := 0; j < len(nums); j++ {
			if nums[i]+nums[j] == target && j != i {
				return []int{i, j}
			}
		}

	}
	return []int{}
}

func main() {
	resp := twoSum([]int{2, 7, 11, 18}, 9)

	fmt.Println(resp)
}
