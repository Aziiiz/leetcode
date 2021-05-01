package mergeTwoLists

type ListNode struct {
	Val  int
	Next *ListNode
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func MergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	listNode := ListNode{}
	listNode.Next = nil
	tail := &listNode

	for l1 != nil || l2 != nil {
		if l1 == nil {
			(*tail).Next = l2
			break
		} else if l2 == nil {
			(*tail).Next = l1
			break
		} else {
			if l1.Val < l2.Val {
				(*tail).Next = l1
				l1 = (*l1).Next
			} else {
				(*tail).Next = l2
				l2 = (*l2).Next
			}
			tail = tail.Next
		}
	}
	return listNode.Next
}
