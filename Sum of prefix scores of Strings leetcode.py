class Solution:
    def sumPrefixScores(self, words: List[str]) -> List[int]:
          l=[]
          c=0
          
          
          if(len(words)==1):
                l.append(len(words[0]))
          else:
            
            for i in words:
              c=0
              for k in range(1,len(i)+1):
                 for j in range(0,len(words)):
                     if(i[:k]==words[j][:k]):
                          c+=1
              l.append(c)
          return l
        