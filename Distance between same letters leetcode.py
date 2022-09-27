class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        l=[]
        c=[]
        n=[]
        count=0
        b=True
        k=0
        for i in range(len(s)-1):
            count=0
            k=ord(s[i])-97
            for j in range(i+1,len(s)):
                
                if(s[i] not in l):
                    if(s[i]!=s[j] ):
                   
                      count+=1
                    
                    if(s[i]==s[j]):
                        c.append(s[i])
                        n.append(count)
                
            l.append(s[i])
       
       
        for i in range(len(n)):
            v=ord(c[i])-97
            if(n[i]!=distance[v]):
                b=False
                    
                    
        return b