# Array based problem
# Link: https://www.codechef.com/problems/LECANDY
# @akarshsingh9
t = int(input())
output = []
for i in range(t):
    n,c = map(int,input().split())
    l = [int(j) for j in input().split()]
    if sum(l) <= c:
        output.append("Yes")
    else:
        output.append("No")

for i in range(len(output)):
    print(output[i])            
