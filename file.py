t=int(input())
for tt in range(t):
    n,q=map(int,input().split())
    s=input().split()
    for pp in range(q):
        q1,q2=map(int,input().split())
        s[q1],s[q2]=s[q2],s[q1]
        i=n
        while i>=0:
            i-=1
            j=-1
            while j<i:
                j+=1
                temp=s[j:i]
                for k in range(len(temp)-1):
                    if temp(k)==temp[k+1]:
                        flag=0
                        break    
