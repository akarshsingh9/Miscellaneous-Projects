# array question CHN15A
# link: https://www.codechef.com/problems/CHN15A
# @akarshsingh9

import sys

t = int(sys.stdin.readline())
l = []
step = []
for i in range(t):
    count = 0
    n,k = map(int,sys.stdin.readline().rstrip().split(' '))
    num = map(int,sys.stdin.readline().rstrip().split(' '))
    l = list(num)
    for j in range(n):
        l[j]+=k
        if l[j] % 7 == 0:
            count+=1
    step.append(count)
for i in step:
    sys.stdout.write(str(i)+'\n')            