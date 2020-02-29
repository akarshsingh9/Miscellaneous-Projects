# ******** Greedy algorithm ***************

n,d = map(int,input().split())
l = [None]*n
for i in range(n):
    e = int(input())
    l[i] = e
count = 0
l = sorted(l)
for i in range(n-1):
    for j in range(1,len(l)):
        if l[j] - l[i] >= d:
            count += 1  
            break    
print(int(count/2))       