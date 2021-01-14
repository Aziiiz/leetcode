package main

import (
	"fmt"
	"unicode"
)

func main() {
	str := []string{"fly", "flower", "flew"}
	fmt.Println(longestCommonPrefix(str))
}

func longestCommonPrefix(strs []string) string {

	if len(strs) == 1 {
		return strs[0]
	}
	strsLength := len(strs)
	if strsLength > 200 || strsLength <= 0 {
		return ""
	}

	loopTimes := 200
	for _, str := range strs {
		strLength := len(str)
		if strLength > 200 || strLength <= 0 {
			return ""
		}
		if strLength < loopTimes {
			loopTimes = strLength
		}
		for _, v := range str {
			if !unicode.IsLower(v) {
				return ""
			}
		}
	}
	i := 0
	flag := true
	for flag && i < loopTimes {
		temp := strs[0][i]
		for j := 0; j < len(strs); j++ {
			temp2 := strs[j][i]
			if temp != temp2 {
				flag = false
				break
			}
		}
		if flag {
			i++
		}
	}
	if i != 0 {
		return strs[0][0:i]
	} else {
		return ""
	}

}
