import math
def compute(p):
    res = 0
    for i in range(11,0,-1):
        res = res + int(p/2**i)
        p = p % 2**i
    return res            

#l = [1,2,4,8,16,32,64,128,256,512,1024,2048]
l2 = []
t = int(input())
for i in range(t):
    p = int(input())
    step = compute(p)
    l2.append(step)

print(l2)    
