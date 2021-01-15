def get_brackets_definitions():
    return {
        '}': '{',
        ')': '(',
        ']': '['
    }
    
class Solution:
    def isValid(self, s: str) -> bool:
        definitions = get_brackets_definitions()
        stack = []
        for char in s:
            if char in definitions:
                if len(stack) and definitions[char] == stack[-1]: 
                    stack.pop()
                else:
                    return False
            else:
                stack.append(char)
        return len(stack) == 0


def main():
   s = Solution()
   print(s.isValid("()"))



if __name__ == "__main__":
    main()           