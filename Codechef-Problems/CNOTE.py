# Array Based Question  
# Link: https://www.codechef.com/problems/CNOTE
# @akarshsingh9

t = int(input())
output = []
flag = []
pos = 1
x,y,k,n = 0,0,0,0
for i in range(t):
    x,y,k,n = map(int,input().split())
    diff = x - y
    for j in range(n):
        p,c = map(int,input().split())
        if p >= diff:
            if c <= k:
                flag.append(1)

    if pos in flag:
        output.append('LuckyChef')
    else:
        output.append('UnluckyChef') 

    flag.clear()                           

     

for i in range(t):
    print(output[i])
