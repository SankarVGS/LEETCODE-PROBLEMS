class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        temp=[]
        for i in range(len(heights)):
            temp.append((heights[i],names[i]))
        temp.sort(reverse=True)
        return [y for x,y in temp]