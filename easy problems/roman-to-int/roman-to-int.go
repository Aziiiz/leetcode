package main

import "fmt"

func main() {
	str := "IV"

	fmt.Println(romanToInt(str))

}
func romanToInt(s string) int {
	romanNum := map[string]int{"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
	var num int

	for i := 0; i < len(s); i++ {
		r := romanNum[string(s[i])]
		num += r
		if i+1 < len(s) {
			if r < romanNum[string(s[i+1])] {
				num = num - 2*r
			}
		}
	}
	return num
}
